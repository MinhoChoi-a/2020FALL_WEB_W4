package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.*;

public class LoginServlet extends HttpServlet {
    
    
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String param = request.getParameter("logout");
        
        HttpSession session = request.getSession();
        
        if(param != null) {
           session.invalidate();
            session = request.getSession();
            
            request.setAttribute("message", "Succefully logged out");
            
            getServletContext().getRequestDispatcher("/WEB-INF/myLogin.jsp")
                .forward(request,response); }
            
        
        else {
                 getServletContext().getRequestDispatcher("/WEB-INF/myLogin.jsp")
                .forward(request,response); }
                
                
     }
               
    
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        
        System.out.println("servlet"+name);
        System.out.println("servlet"+password);
        
        if(name == null || name == "" || password == null || password == "") {
            request.setAttribute("message", "Input should not be empty");
            
            getServletContext().getRequestDispatcher("/WEB-INF/myLogin.jsp")
                .forward(request,response); 
        }
        
        AccountService newUser = new AccountService(name, password);
        
        System.out.println(newUser.getUser().getName());
        User user = (User) newUser.login();
        
        if(user != null) {
        
        HttpSession session = request.getSession();
        session.setAttribute("username", user.getName());
                        
        response.sendRedirect("/SessionAndAuthentication/home");
        }
        
        else {
        request.setAttribute("message", "Invalid username/password");
            
            getServletContext().getRequestDispatcher("/WEB-INF/myLogin.jsp")
                .forward(request,response); 
            
        }
    
    }   
}
   
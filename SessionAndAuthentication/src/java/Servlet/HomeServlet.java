package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author minho
 */
public class HomeServlet extends HttpServlet {

     protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
         HttpSession session = request.getSession();
         
         String name = (String) session.getAttribute("username");
         
        if(name != null && name != "") {
         
         request.setAttribute("name", name);
         
        getServletContext().getRequestDispatcher("/WEB-INF/home.jsp")
                .forward(request,response); 
        }
        
     else {
            response.sendRedirect("/SessionAndAuthentication/login");
    }
}
                
}

<%-- 
    Document   : myLogin
    Created on : 5-Oct-2020, 11:34:48 AM
    Author     : minho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form method="post" action="">
            Username: <input type="text" name="name" value=""/><br>
            Password: <input type="text" name="password" value=""/><br>
            <p>${message}</p>
            <input type="submit" value="Log in"/>
        </form>
        
        
    </body>
</html>

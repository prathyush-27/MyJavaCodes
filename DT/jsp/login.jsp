<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login Result</title>
</head>
<body>
    <h1>Login Result</h1>
    <%
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        // Perform authentication logic here
        // For simplicity, let's assume a successful login
    %>
    <p>Welcome, <%= username %>! You have successfully logged in.</p>
</body>
</html>

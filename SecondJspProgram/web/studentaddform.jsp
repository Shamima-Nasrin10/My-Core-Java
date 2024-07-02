<%-- 
    Document   : studentaddform
    Created on : 2 July 2024, 12:14:42 pm
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Student Form</h1>
        
        <form method="POST" action="savestudent.jsp">
            Name: <input type="text" name="name"><br>
            Email <input type="email" name="email"><br>
            Address <input type="text" name="address"><br>
            
            <input type="submit" name="Save">
            
        </form>
    </body>
</html>

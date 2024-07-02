

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="model.Student" %>
<%@page import="dao.StudentDao" %>
<%@page import="java.util.*" %>

<% 

List<Student> stList=StudentDao.viewAllStudent();
request.setAttribute("stList",stList);

%>
<table border="1">

        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Address</th>
                <th>Action</th>
    
            </tr>
        </thead>
        <tbody>
            <c:forEach var="student" items="${stList}" >
            <tr>
                <td>${student.getId()}</td>
                <td>${student.getName()}</td>
                <td>${student.getEmail()}</td>
                <td>${student.getAddress()}</td>
                <td>
                    <a href="#">Edit</a>
                    <a href="deletestudent.jsp?id=${student.getId()}">Delete</a>
                </td>
            </tr>
            </c:forEach>

        </tbody>

    </table>

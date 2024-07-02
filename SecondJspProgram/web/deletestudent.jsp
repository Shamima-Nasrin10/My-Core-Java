<%-- 
    Document   : deletestudent
    Created on : Jul 2, 2024, 3:16:56 PM
    Author     : Admin
--%>

<<jsp:useBean class="model.Student" id="s"/>
<%@page import="dao.StudentDao" %>
<jsp:setProperty name="s" property="*" />

<% 
  
   StudentDao.deleteStudent(s);
response.sendRedirect("viewallstudent.jsp");
    
%>

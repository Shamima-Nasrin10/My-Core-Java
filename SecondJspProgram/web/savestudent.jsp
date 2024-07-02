<%-- 
    Document   : savestudent
    Created on : 2 July 2024, 12:00:10 pm
    Author     : HP
--%>

<jsp:useBean class="model.Student" id="s"/>
<%@page import="dao.StudentDao" %>
<jsp:setProperty name="s" property="*" />

<% 
  
    int i=StudentDao.saveStudent(s);
    
    if(i>0){
    response.sendRedirect("success.jsp");
    }
    else{
    response.sendRedirect("error.jsp");
    }
    
%>



<%-- 
    Document   : DeleteCompany
    Created on : 3 Sep, 2017, 12:16:38 PM
    Author     : SURYA PRIY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="h"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% if(session.getAttribute("admin")!=null)
        {
        %>            
        <h:form action="/delcomp">
            Company ID :<input type="text" name="compid" size="20" required /><br><br>
            <input type="submit" value="DELETE" />
        </h:form>
        <% } 
         else
        {
            out.println("<h3><font color=red>You must Login first as Admin!!</font color></h3>");
        %>
        <jsp:include page="/AdminLogin.jsp" />
        <% } %>            
    </body>
</html>

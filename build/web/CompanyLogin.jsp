<%-- 
    Document   : CompanyLogin
    Created on : 2 Sep, 2017, 1:07:59 PM
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
        <h:form action="/complog">
            Company ID :<input type="text" name="compid" size="20" required /><br><br>
            Password :<input type="password" name="passw" size="20" required /><br><br>
            <input type="submit" value="LOGIN" />
        </h:form>
    </body>
</html>

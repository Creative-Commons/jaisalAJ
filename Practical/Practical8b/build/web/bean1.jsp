<%-- 
    Document   : bean1
    Created on : Feb 16, 2018, 9:36:08 AM
    Author     : Prathamesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String st=request.getParameter("t1");
            out.println("Username from the request:"+st);
            %>
            <jsp:useBean id="b1" scope="session" class="bean.bean1"/>
            <jsp:setProperty name="b1" property="uname" value="<%=st%>"/>
            <br>
            Username from the bean:<jsp:getProperty name="b1" property="uname"/>
            
            
    </body>
</html>

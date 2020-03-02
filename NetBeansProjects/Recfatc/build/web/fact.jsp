<%-- 
    Document   : fact
    Created on : Jan 29, 2018, 11:30:57 PM
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
        <%!
            int fact(int n)
            {
                if(n<=0)
                    return 1;
                else
                    return n*fact(n-1);
            }
            %>
            <%
                String st=request.getParameter("txtno");
                int n=Integer.parseInt(st);
                int val=fact(n);
                %>
                <%="n="+n%>
                <%="n!="+val%>
                </body>
</html>

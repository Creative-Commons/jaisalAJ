<%-- 
    Document   : index
    Created on : Feb 1, 2018, 10:53:42 PM
    Author     : Prathamesh
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
String uid = request.getParameter("uid");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "java";
String userid = "root";
String password = "vishu123";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body>
       <h1>Retrieve data from database in jsp</h1>
<table border="1">
<tr>
<td>uid</td>
<td>first name</td>
<td>last name</td>
<td>Password</td>
<td>Confirm Password</td>
<td>Zip code</td>
<td>town</td>
<td>Country</td>
<td>update</td>
</tr>
<%
    try{
Connection con = DriverManager.getConnection(connectionUrl+database, userid, password);
 Statement st=con.createStatement();
String sql ="select * from register";
 ResultSet rs = st.executeQuery(sql);
while(rs.next()){
%>
<tr>
<td><%=rs.getString("uid") %></td>
<td><%=rs.getString("fname") %></td>
<td><%=rs.getString("lname") %></td>
<td><%=rs.getString("pwd") %></td>
<td><%=rs.getString("pwd1") %></td>
<td><%=rs.getString("zipcode") %></td>
<td><%=rs.getString("town") %></td>
<td><%=rs.getString("country") %></td>
<td><a href="update.jsp?id=<%=rs.getString("uid")%>">update</a></td>
</tr> 
<%
    } 
con.close();
}catch (Exception e) {
e.printStackTrace();
}
%>
    </body>
</html>

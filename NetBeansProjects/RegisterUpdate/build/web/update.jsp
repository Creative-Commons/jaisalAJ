<%-- 
    Document   : update
    Created on : Feb 2, 2018, 4:44:22 PM
    Author     : Prathamesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%

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
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String uid = request.getParameter("id");
String sql ="select * from register where uid="+uid;
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<!DOCTYPE html>
<html>
<body>
<h1>Update data from database in jsp</h1>
<form method="post" action="update_process.jsp">
<input type="hidden" name="uid" value="<%=resultSet.getString("uid") %>">
<input type="text" name="uid" value="<%=resultSet.getString("uid") %>">
<br>
First name:<br>
<input type="text" name="fname" value="<%=resultSet.getString("fname") %>">
<br>
Last name:<br>
<input type="text" name="lname" value="<%=resultSet.getString("lname") %>">
<br>
Password:<br>
<input type="password" name="pwd" value="<%=resultSet.getString("pwd") %>">
<br>
Confirm Password:<br>
<input type="password" name="pwd1" value="<%=resultSet.getString("pwd1") %>">
<br><br>
Zip code:<br>
<input type="text" name="zipcode" value="<%=resultSet.getString("zipcode") %>">
<br><br>
Town:<br>
<input type="text" name="town" value="<%=resultSet.getString("town") %>">
<br><br>
Country:<br>
<input type="text" name="country" value="<%=resultSet.getString("country") %>">
<br><br>
<input type="submit" value="submit">
</form>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</body>
</html>

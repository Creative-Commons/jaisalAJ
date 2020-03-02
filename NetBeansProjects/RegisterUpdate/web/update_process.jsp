<%-- 
    Document   : update_process
    Created on : Feb 2, 2018, 5:08:12 PM
    Author     : Prathamesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%! String driverName = "com.mysql.jdbc.Driver";%>
<%!String url = "jdbc:mysql://localhost:3306/java";%>
<%!String user = "root";%>
<%!String psw = "vishu123";%>
<%
String uid = request.getParameter("uid");
String fname=request.getParameter("fname");
String lname=request.getParameter("lname");
String pwd=request.getParameter("pwd");
String pwd1=request.getParameter("pwd1");
String zipcode=request.getParameter("zipcode");
String town=request.getParameter("town");
String country=request.getParameter("country");
if(uid != null)
{
Connection con = null;
PreparedStatement ps = null;
//int personID = Integer.parseInt(uid);
try
{
Class.forName(driverName);
con = DriverManager.getConnection(url,user,psw);
String sql="update register set uid=?,fname=?,lname=?,pwd=?,pwd1=?,zipcode=?,town=?,country=? where uid="+uid;
ps = con.prepareStatement(sql);
            ps.setString(1,uid);
            ps.setString(2,fname);
            ps.setString(3,lname);
            ps.setString(4,pwd);
            ps.setString(5,pwd1);
            ps.setString(6,zipcode);
            ps.setString(7,town);
            ps.setString(8,country);
int i = ps.executeUpdate();
if(i > 0)
{
out.print("Record Updated Successfully");
}
else
{
out.print("There is a problem in updating Record.");
} 
}
catch(SQLException sql)
{
request.setAttribute("error", sql);
out.println(sql);
}
}
%>

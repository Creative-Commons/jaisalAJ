<%-- 
    Document   : register
    Created on : Jan 31, 2018, 1:45:47 PM
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
        <h1>Login page</h1>
        <form action="registration" method="post">
            <table cellpadding="4" cellspacing="2" border="0">
                <tr><th colspan="2">Registration form<br></th></tr>
                <tr><td>Firstname<sup>*</sup></td>
                    <td><input type="text" name="fname" value="" maxlength="20" size="15">
                    </td></tr>
                <tr><td>Lastname<sup>*</sup></td>
                    <td><input type="text" name="lname" value="" maxlength="20" size="15">
                    </td></tr>
                <tr><td>Zipcode<sup>*</sup></td>
                    <td><input type="text" name="zip" value="" maxlength="8" size="5">
                    </td></tr>
                <tr><td>Username<sup>*</sup></td>
                    <td><input type="text" name="uid" value="" maxlength="20" size="10">
                    </td></tr>
                <tr><td>Password<sup>*</sup></td>
                    <td><input type="password" name="pwd" value="" maxlength="20" size="10">
                    </td></tr>
                <tr><td>Confirm password<sup>*</sup></td>
                    <td><input type="password" name="pwd1" value="" maxlength="20" size="10">
                    </td></tr>
                <tr><td>Town<sup>*</sup></td>
                    <td><input type="text" name="town" value="" maxlength="10" size="15">
                    </td></tr>
                <tr><td>Country<sup>*</sup></td>
                    <td><input type="text" name="country" value="" maxlength="20" size="15">
                    </td></tr>
                <tr><td align="center" colspan="2"><br>
                        <input type="submit" value="Submit"></td></tr>
            </table>
        </form>
    </body>
</html>

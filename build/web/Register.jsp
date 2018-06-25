<%-- 
    Document   : Login
    Created on : Jun 25, 2018, 2:49:39 PM
    Author     : MRuser
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <form action="AuthHandler" method="POST">
            <label for="uname" id="label_uname">Username:</label><input type="text" name="uname" value="" /><br />
            <label for="pass" id="label_pass">Password:</label><input type="password" name="pass" value="" /><br />
            <input type="submit" value="Login" name="button_login" />
        </form>
    </body>
</html>

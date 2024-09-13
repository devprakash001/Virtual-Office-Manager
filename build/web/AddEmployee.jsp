<%-- 
    Document   : AddEmployee
    Created on : 24 Aug, 2024, 3:39:07 PM
    Author     : fujitsu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="AdminHeader.jsp"%>
<center>
    <div style="background-color: lightsteelblue; width: 600px; height: 720px;">
        <h2>Employee Registration Page</h2>
        <form action="AddEmplyee">
        <table width="600" border="1" cellpadding="13">
            <tr><td>Employee Code</td><td><input type="number" name="code"></td></tr>
            <tr><td>Employee Name</td><td><input type="text" name="name"></td></tr>
            <tr><td>Date of Birth</td><td><input type="date" name="dob"></td></tr>
            <tr><td>Gender</td><td><input type="radio" name="gen" value="Male">Male
                    <input type="radio" name="gen" value="Female">Female</td></tr>
            <tr><td>Post</td><td><input type="text" name="post"></td></tr>
            <tr><td>Address</td><td><input type="text" name="addr"></td></tr>
            <tr><td>City</td><td><input type="text" name="city"></td></tr>
            <tr><td>Contact</td><td><input type="number" name="cont"></td></tr>
            <tr><td>Email</td><td><input type="email" name="mail"></td></tr>
            <tr><td>ID Name</td><td><input type="text" name="idname"></td></tr>
            <tr><td>ID Number</td><td><input type="number" name="idno"></td></tr>
            <tr><td>Password</td><td><input type="password" name="pswd"></td></tr>
            <tr><th><input type="submit" value="Submit"></th><th><input type="reset" value="Reset"></th></tr>
        </table>
            </form>
    </div>
</center>
</body>
</html>
<%-- 
    Document   : EmpChangePassword
    Created on : 28 Aug, 2024, 7:35:38 PM
    Author     : fujitsu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="EmployeeHeader.jsp"%>
<!DOCTYPE html>
<html>
    <body>
        <div>
            <center>
                <form action="EmpChangePassword" method="post">
                    <table width="500" cellpadding="20" cellspacing="0" border="1" style="background-color: lightblue;">
                        <tr><td>Old Password</td><td><input type="password" name="opswd" required></td></tr>
                        <tr><td>New Password</td><td><input type="password" name="npswd" required></td></tr>
                        <tr><td>Confirm Password</td><td><input type="password" name="cpswd" required></td></tr>
                        <tr><th><input type="submit" value="Submit"></th><th><input type="reset" value="Reset"></th></tr>
                    </table>
                </form>
                <%
                    if(request.getParameter("error") != null) {
                        String msg = request.getParameter("error");
                        out.println("<h2 style='color:red;'>" + msg + "</h2>");
                    }
                %>
            </center>
        </div>
    </body>
</html>
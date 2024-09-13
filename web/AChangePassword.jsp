<%-- 
    Document   : AChangePassword
    Created on : 27 Aug, 2024, 4:04:49 PM
    Author     : fujitsu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="AdminHeader.jsp"%>
<!DOCTYPE html>
<html>
    <body>
        <div>
            <center>
                <form action="AChangePassword" method="post">
                    <table width="500" cellpadding="20" cellspacing="0" border="1" style="background-color: gold;">
                        <tr><td>Old Password</td><td><input type="password" name="opswd"></td></tr>
                        <tr><td>New Password</td><td><input type="password" name="npswd"></td></tr>
                        <tr><td>Confirm Password</td><td><input type="password" name="cpswd"></td></tr>
                        <tr><th><input type="submit" value="Submit"></th><th><input type="reset" value="Reset"></th></tr>
                    </table>
                </form>
                <%
                    if(request.getParameter("error")!=null)
                    {
                        String msg=request.getParameter("error");
                        out.println("<h2 style='color:red;'>"+msg+"</h2>");
                    }
                %>
            </center>
        </div>
    </body>
</html>

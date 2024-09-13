<%-- 
    Document   : UpdateEmployee
    Created on : 26 Aug, 2024, 11:16:41 AM
    Author     : fujitsu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="AdminHeader.jsp"%>
<!DOCTYPE html>
<html>
    <body>
        <div>
            <h1>Search Employee</h1>
            <center>
                <form action="EmployeeDetail.jsp">
                    <br>
                    <table width="500" cellpadding="20" border="1" cellspacing="0" bgcolor="lightgreen">
                        <tr><td>Employee Code or Contact or E mail</td><td><input type="search" name="data"></td></tr>
                        <tr><th><input type="submit" value="Search"></th><th><input type="reset" value="Reset"></th></tr>
                    </table>
                </form>
            </center>
        </div>
    </body>
</html>

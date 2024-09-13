<%-- 
    Document   : EmpAttendance
    Created on : 30 Aug, 2024, 3:52:52 PM
    Author     : fujitsu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="AdminHeader.jsp"%>
<div>
    <center>
        <h2>Employee Attendance Report</h2>
        <form action="EmpAttendanceRepo.jsp">
            <table width="500" cellpadding="20" cellspacing="0" border="2" bgcolor="lightyellow">
                <tr><td color="white">Employee Code </td><th><input type="search" name="code"></th></tr>
                <tr><th><input type="submit" value="Submit"></th><th><input type="reset" value="Reset"></th></tr>
            </table>
            
            </form>
        </center>
 </div>          
           
    </body>
</html>
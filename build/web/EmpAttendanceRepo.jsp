<%-- 
    Document   : EmpAttendanceRepo
    Created on : 1 Sep, 2024, 12:32:58 PM
    Author     : fujitsu
--%>

<%@page import="DB.DBCon"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="AdminHeader.jsp"%>
<div>
    <center>
        <h2>Employee Attendance Report</h2>
        <%
        String user=request.getParameter("code");
        DBCon db=new DBCon();
         db.pstmt=db.con.prepareStatement("select ecode,ename,egender,epost from emp_mstr where ecode=?");
        db.pstmt.setString(1,user);
        String code="";
        db.rst=db.pstmt.executeQuery();
        if(db.rst.next())
        {
         code=db.rst.getString(1);
         out.println("<table width=500 bgcolor=white >");
         if(db.rst.getString(3).equalsIgnoreCase("Male"))
             
         {
             out.println("<tr><td width=250><b>Employee Code:"+db.rst.getString(1)+"</b></td>"
                     + "<td><b>Employee Name: Mr."+db.rst.getString(2)+"</b></td></tr>");
         }
         else
         {
                out.println("<tr><td width=250><b>Employee Code:"+db.rst.getString(1)+"</b></td>"
                     + "<td><b>Employee Name: Ms."+db.rst.getString(2)+"</b></td></tr>");
         }
            out.println("<tr><td width=250><b>Employee Post:"+db.rst.getString(4)+"</b></td>"
                     + "<td><b>E Mail:"+user+"</b></td></tr>");
        }
        out.println("<table width=500 bgcolor=white border=1>");
        out.println("<tr bgcolor=lightyellow><th>Attendance Date</th><th>Time In</th><th>Time Out</th>"
                + "<th>Working Hours</th></tr>");
        db.pstmt=db.con.prepareStatement("select atnd_date,time_in,time_out,(time_out-time_in)from emp_attendance where ecode=?");
        db.pstmt.setString(1,code);
        db.rst=db.pstmt.executeQuery();
        while(db.rst.next())
        {
            out.println("<tr><td>"+db.rst.getString(1)+"</td><td>"+db.rst.getString(2)+"</td>"
                    + "<td>"+db.rst.getString(3)+"</td><td>"+Math.abs(db.rst.getInt(4))+"</td></tr>");
        }
        
        %>
        </center>
        </div>
    </body>
</html>
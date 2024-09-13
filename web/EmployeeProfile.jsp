<%-- 
    Document   : EmployeeProfile
    Created on : 28 Aug, 2024, 3:36:40 PM
    Author     : fujitsu
--%>

<%@page import="DB.DBCon"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="EmployeeHeader.jsp"%>
<!DOCTYPE html>
<html>
    <body>
        <div>
            <center>
                    <%
                        try
                        {
                            String email=session.getAttribute("user").toString();
                            DBCon db=new DBCon();
                            db.pstmt=db.con.prepareStatement("select * from emp_mstr where email=?");
                            db.pstmt.setString(1, email);
                            db.rst=db.pstmt.executeQuery();
                            if(db.rst.next())
                            {
                                out.println("<center><h1>Employee Profile</h1>");
                                out.println("<table width=500 border=1 cellpadding=10 bgcolor=lightblue>"
                                        + "<tr><td>Employee Code</td><td>"+db.rst.getString(1)+"</td></tr>"
                                        + "<tr><td>Employee Name</td><td>"+db.rst.getString(2)+"</td></tr>"
                                        + "<tr><td>Date of Birth</td><td>"+db.rst.getString(3)+"</td></tr>"
                                        + "<tr><td>Gender</td><td>"+db.rst.getString(4)+"</td></tr>"
                                        + "<tr><td>Post</td><td>"+db.rst.getString(5)+"</td></tr>"
                                        + "<tr><td>Address</td><td>"+db.rst.getString(6)+"</td></tr>"
                                        + "<tr><td>City</td><td>"+db.rst.getString(7)+"</td></tr>"
                                        + "<tr><td>Contact</td><td>"+db.rst.getString(8)+"</td></tr>"
                                        + "<tr><td>E Mail</td><td>"+db.rst.getString(9)+"</td></tr>"
                                        + "<tr><td>ID Name</td><td>"+db.rst.getString(10)+"</td></tr>"
                                        + "<tr><td>ID Number</td><td>"+db.rst.getString(11)+"</td></tr>");
                            }
                        }
                        catch(Exception e)
                        {
                            e.printStackTrace();
                        }
                    %>
                </table>
            </center>
        </div>
    </body>
</html>

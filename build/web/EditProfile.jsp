<%-- 
    Document   : EditProfile
    Created on : 28 Aug, 2024, 6:45:42 PM
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
                    String mail = session.getAttribute("user").toString();
                    DBCon db = new DBCon();
                    db.pstmt = db.con.prepareStatement("select * from emp_mstr where email=?");
                    db.pstmt.setString(1, mail);
                    db.rst = db.pstmt.executeQuery();
                    if (db.rst.next())
                    {
            %>
                        <h1>Edit Profile</h1>
                        <form action="UpdateProfile" method="post">
                            <input type="hidden" name="code" value="<%=db.rst.getString(1)%>" />
                            <table width="500" border="1" cellpadding="10" bgcolor="lightgray">
                                <tr>
                                    <td>Employee Name:</td>
                                    <td><input type="text" name="name" value="<%=db.rst.getString(2)%>" required/></td>
                                </tr>
                                <tr>
                                    <td>Date of Birth:</td>
                                    <td><input type="date" name="dob" value="<%=db.rst.getString(3)%>" required/></td>
                                </tr>
                                <tr>
                                    <td>Gender:</td>
                                    <td>
                                        <select name="gen" required>
                                            <option value="Male" <%=db.rst.getString(4).equals("Male") ? "selected" : ""%>>Male</option>
                                            <option value="Female" <%=db.rst.getString(4).equals("Female") ? "selected" : ""%>>Female</option>
                                        </select>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Post:</td>
                                    <td><input type="text" name="post" value="<%=db.rst.getString(5)%>" required/></td>
                                </tr>
                                <tr>
                                    <td>Address:</td>
                                    <td><input type="text" name="addr" value="<%=db.rst.getString(6)%>" required/></td>
                                </tr>
                                <tr>
                                    <td>City:</td>
                                    <td><input type="text" name="city" value="<%=db.rst.getString(7)%>" required/></td>
                                </tr>
                                <tr>
                                    <td>Contact:</td>
                                    <td><input type="text" name="cont" value="<%=db.rst.getString(8)%>" required/></td>
                                </tr>
                                <tr>
                                    <td>Email:</td>
                                    <td><input type="email" name="mail" value="<%=db.rst.getString(9)%>" readonly/></td>
                                </tr>
                                <tr>
                                    <td>ID Name:</td>
                                    <td><input type="text" name="idname" value="<%=db.rst.getString(10)%>" required/></td>
                                </tr>
                                <tr>
                                    <td>ID Number:</td>
                                    <td><input type="text" name="idno" value="<%=db.rst.getString(11)%>" required/></td>
                                </tr>
                            </table>
                            <br/>
                            <input type="submit" value="Update Profile"/>
                        </form>
            <%
                    }
                    else
                    {
                        out.println("<h3>Record not found</h3>");
                    }
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            %>
        </center>
    </div>
</body>
</html>

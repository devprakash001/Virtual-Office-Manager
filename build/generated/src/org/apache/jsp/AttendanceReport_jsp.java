package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DB.DBCon;

public final class AttendanceReport_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/EmployeeHeader.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<title>Virtual Office</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/coin-slider.css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/droid_sans_400-droid_sans_700.font.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/coin-slider.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"main\">\n");
      out.write("  <div class=\"header\">\n");
      out.write("    <div class=\"header_resize\">\n");
      out.write("     \n");
      out.write("      <div class=\"logo\">\n");
      out.write("        <h1><a href=\"index.html\"><span>Virtual</span>Office System</a></h1>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("      <div class=\"menu_nav\" style=\"width: 1200px;\">\n");
      out.write("        <ul>\n");
      out.write("          <li class=\"active\"><a href=\"EmployeeProfile.jsp\"><span>View Profile</span></a></li>\n");
      out.write("          <li><a href=\"EditProfile.jsp\"><span>Edit Profile</span></a></li>\n");
      out.write("          <li><a href=\"AddAttendance.jsp\"><span>Add Attendance</span></a></li>\n");
      out.write("          <li><a href=\"AttendanceReport.jsp\"><span>Attendance Report</span></a></li>\n");
      out.write("          <li><a href=\"EmpChangePassword.jsp\"><span>Change Password</span></a></li>\n");
      out.write("          <li><a href=\"Logout\"><span>Logout</span></a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div> </div>\n");
      out.write("      </div>\n");
      out.write("      </div> \n");
      out.write("     ");
      out.write("\n");
      out.write("<div>\n");
      out.write("    <center>\n");
      out.write("        <h2>Attendance Report</h2>\n");
      out.write("        ");

        String user=session.getAttribute("user").toString();
        DBCon db=new DBCon();
        db.pstmt=db.con.prepareStatement("select ecode,ename,egender,epost from emp_mstr where email=?");
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
                     + "<td><b>Employee Name:Mr."+db.rst.getString(2)+"</b></td></tr>");
         }
         else
         {
                out.println("<tr><td width=250><b>Employee Code:"+db.rst.getString(1)+"</b></td>"
                     + "<td><b>Employee Name:Ms."+db.rst.getString(2)+"</b></td></tr>");
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
        
        
      out.write("\n");
      out.write("        </center>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

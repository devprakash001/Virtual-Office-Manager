package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class EmployeeAttendance_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Attendance Report</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("        }\n");
      out.write("        .search-bar {\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("        .employee-list, .attendance-report {\n");
      out.write("            margin: 20px 0;\n");
      out.write("        }\n");
      out.write("        table {\n");
      out.write("            width: 100%;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("        }\n");
      out.write("        table, th, td {\n");
      out.write("            border: 1px solid black;\n");
      out.write("        }\n");
      out.write("        th, td {\n");
      out.write("            padding: 10px;\n");
      out.write("            text-align: left;\n");
      out.write("        }\n");
      out.write("        th {\n");
      out.write("            background-color: #f2f2f2;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1>Attendance Report</h1>\n");
      out.write("\n");
      out.write("    <div class=\"search-bar\">\n");
      out.write("        <form action=\"attendanceReport\" method=\"get\">\n");
      out.write("            <input type=\"text\" name=\"searchCode\" placeholder=\"Search by Employee Code\" />\n");
      out.write("            <input type=\"submit\" value=\"Search\" />\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"employee-list\">\n");
      out.write("        <h2>Select an Employee</h2>\n");
      out.write("        ");

            ResultSet employeeList = (ResultSet) request.getAttribute("employeeList");
            if (employeeList != null) {
                while (employeeList.next()) {
                    String employeeCode = employeeList.getString("employee_code");
                    String employeeName = employeeList.getString("employee_name");
        
      out.write("\n");
      out.write("                    <a href=\"attendanceReport?employeeCode=");
      out.print( employeeCode );
      out.write("\">\n");
      out.write("                        ");
      out.print( employeeName );
      out.write(' ');
      out.write('(');
      out.print( employeeCode );
      out.write(")\n");
      out.write("                    </a><br/>\n");
      out.write("        ");

                }
            }
        
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"attendance-report\">\n");
      out.write("        <h2>Attendance Report</h2>\n");
      out.write("        ");

            ResultSet attendanceList = (ResultSet) request.getAttribute("attendanceList");
            if (attendanceList != null) {
        
      out.write("\n");
      out.write("            <table>\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Date</th>\n");
      out.write("                        <th>Status</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("        ");

                while (attendanceList.next()) {
                    String date = attendanceList.getString("date");
                    String status = attendanceList.getString("status");
        
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print( date );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( status );
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("        ");

                }
        
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        ");

            } else if (request.getParameter("employeeCode") != null) {
                out.println("<p>No attendance record found for this employee.</p>");
            }
        
      out.write("\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

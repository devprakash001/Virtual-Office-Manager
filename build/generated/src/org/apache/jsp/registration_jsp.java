package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("        <div class=\"logo\">\n");
      out.write("        <h1><a href=\"index.html\"><span>Office </span> Manager</a></h1>\n");
      out.write("        </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("      <div class=\"menu_nav\" style=\"width:1000px; \">\n");
      out.write("          &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;\n");
      out.write("        <ul>\n");
      out.write("          <li class=\"active\"><a href=\"index.html\"><span>Home Page</span></a></li>\n");
      out.write("          <li><a href=\"about.jsp\"><span>About Us</span></a></li>\n");
      out.write("          <li><a href=\"contact.jsp\"><span>Contact Us</span></a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("      <div class=\"slider\" >\n");
      out.write("        <div id=\"coin-slider\"> <a href=\"#\"><img src=\"images/slide1.jpg\" width=\"960\" height=\"360\" alt=\"\" /></a> <a href=\"#\"><img src=\"images/slide2.jpg\" width=\"960\" height=\"360\" alt=\"\" /> </a><a href=\"#\"><img src=\"images/slide3.jpg\" width=\"960\" height=\"360\" alt=\"\" /> </a></div>\n");
      out.write("       <div class=\"clr\"></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div><br><br><br>\n");
      out.write("    <center>\n");
      out.write("     <div style=\"width:350px;height:250px;\">\n");
      out.write("         <form action=\"CompanyRegister\" method=\"get\">\n");
      out.write("               <fieldset style=\"width: 350px;height: 250px;border: 5px solid black;background-color: dodgerblue;\">\n");
      out.write("                   <legand><h2 style=\"color:green;\">Company Registration</h2></legand>\n");
      out.write("             <table width=350px, height=\"250px\">\n");
      out.write("                 <tr height=\"30px\"><td width=\"10px\"><label style=\"color: white\";>User Type</label></td><td width=\"10px\" align=\"center\"><select name=\"t1\" value=\"Admin\"style=\"width: 140px;height: 70;background-color: #A0EDE5;\"><option>Company</option></select></td><td width=\"10px\"></td></tr>\n");
      out.write("                 <tr><td width=\"30px\" align=left><lable style=\"color: white\";>Company Id :</lable><lable style=\"color:white;\">*</lable><td><input type=text name=\"t2\"/></td></tr><tr height=\"10px\"></tr>\n");
      out.write("                 <tr><td width=\"30px\" align=left><lable style=\"color: white\";>Password :</lable><lable style=\"color:white;\">*</lable></td><td><input type=password name=\"t3\"/></td></tr><tr height=\"5px\"></tr>\n");
      out.write("                 <tr width=\"30px\"><td width=\"10px\"></td><td width=\"10px\" align=\"center\"><input type=\"submit\" value=\"Register\" style=\"width:70px;height: 25px;background-color: #ACF7D1;\"></td><td width=\"10px\"></td></tr>\n");
      out.write("                 <tr height=\"10px\"></tr>  <tr width=\"30px\" height=\"20px\"><td width=\"10px\"></td><td width=\"10px\" align=\"center\"></td><td width=\"10px\"></td></tr> \n");
      out.write("\n");
      out.write("</table>\n");
      out.write("               \n");
      out.write("            \n");
      out.write("</fieldset>\n");
      out.write("          </form>\n");
      out.write("</div>\n");
      out.write("    </center><br/><br/>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("  </body>\n");
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

<%-- 
    Document   : contact
    Created on : 21 Aug, 2024, 4:40:30 PM
    Author     : fujitsu
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Contact Us</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="main">
  <div class="header">
    <div class="header_resize">
      <div class="logo">
        <h1><a href="index.html"><span>Office</span>Manager</a></h1>
      </div>
      <div class="clr"></div>
      <div class="menu_nav">
        <ul>
          <li><a href="index.html"><span>Home Page</span></a></li>
          <li><a href="about.jsp"><span>About Us</span></a></li>
          <li class="active"><a href="contact.jsp"><span>Contact Us</span></a></li>
        </ul>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  
  <div class="content">
    <div class="content_resize">
      <div class="mainbar">
        <h2>Contact Us</h2>
        <p>If you have any questions, comments, or concerns, please feel free to reach out to us. We are here to help you with any inquiries you may have.</p>
        <p><strong>Email:</strong> support@officemanager.com</p>
        <p><strong>Phone:</strong> +1-234-567-890</p>
        <p><strong>Address:</strong> 123 Office Street, Business City, BC 12345</p>
        
        <h3>Send Us a Message</h3>
        <form action="contactForm" method="post">
          <table>
            <tr>
              <td>Name:</td>
              <td><input type="text" name="name" required /></td>
            </tr>
            <tr>
              <td>Email:</td>
              <td><input type="email" name="email" required /></td>
            </tr>
            <tr>
              <td>Message:</td>
              <td><textarea name="message" required></textarea></td>
            </tr>
            <tr>
              <td></td>
              <td><input type="submit" value="Send" /></td>
            </tr>
          </table>
        </form>
      </div>
      <div class="sidebar">
        <!-- You can add widgets or additional information here -->
      </div>
      <div class="clr"></div>
    </div>
  </div>
  
  <div class="footer">
    <div class="footer_resize">
      <p class="lf">&copy; Copyright <a href="#">OfficeManager</a>.</p>
      <div style="clear:both;"></div>
    </div>
  </div>
</div>
</body>
</html>

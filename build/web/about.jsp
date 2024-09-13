<%-- 
    Document   : about
    Created on : 21 Aug, 2024, 4:32:06 PM
    Author     : fujitsu
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>About Us</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <!--<style>
        /* Adding background image to the entire page */
        body {
            background-image: url('images/slide2.jpg');
            background-size: cover;
            background-repeat: no-repeat;
            background-attachment: fixed; /* Ensures the background stays fixed when scrolling */
        }
        
        /* Optionally, you can apply the background to a specific section */
        .content_resize {
            background-color: rgba(255, 255, 255, 0.8); /* Optional: Adds a white overlay with some transparency */
            padding: 20px;
            border-radius: 10px;
        }
    </style>-->
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
          <li class="active"><a href="about.jsp"><span>About Us</span></a></li>
          <li><a href="contact.jsp"><span>Contact Us</span></a></li>
        </ul>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  
  <div class="content">
    <div class="content_resize">
      <div class="mainbar">
        <h2>About Us</h2>
        <p>Welcome to OfficeManager! We are committed to providing the best office management solutions. Our mission is to streamline office operations, improve productivity, and foster better communication within teams. With our user-friendly platform, we aim to make office management simpler and more efficient.</p>
        <p>Our team consists of experienced professionals dedicated to creating innovative solutions tailored to your needs. We are passionate about technology and constantly work towards enhancing our services to meet the evolving demands of the modern workplace.</p>
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

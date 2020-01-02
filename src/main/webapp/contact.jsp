<%--
  Created by IntelliJ IDEA.
  User: edin
  Date: 12/29/19
  Time: 10:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>

<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contact - Kazumi Tattoo</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="css/mobile.css" media="screen and (max-width : 568px)">
    <script type="text/javascript" src="js/mobile.js"></script>
</head>
<body>
<div id="header">
    <a href="home" class="logo">
        <img src="images/logo.jpg" alt="">
    </a>
    <ul id="navigation">
        <li>
            <a href="home">home</a>
        </li>
        <li>
            <a href="about">about</a>
        </li>
        <li>
            <a href="gallery">gallery</a>
        </li>
        <li>
            <a href="blog">blog</a>
        </li>
        <li class="selected">
            <a href="contact">contact</a>
        </li>
    </ul>
</div>
<div id="body">
    <h1><span>let's keep in touch</span></h1>
    <form action="contact.html">
        <input type="text" name="fname" id="fname" value="name">
        <input type="text" name="address" id="address" value="address">
        <input type="text" name="email" id="email" value="email">
        <input type="text" name="phone" id="phone" value="phone number">
        <textarea name="message" id="message">message</textarea>
        <input type="submit" name="send" id="send" value="send">
    </form>
</div>
<div id="footer">
    <div>
        <p>&copy; 2023 by Mustacchio. All rights reserved.</p>
        <ul>
            <li>
                <a href="http://freewebsitetemplates.com/go/twitter/" id="twitter">twitter</a>
            </li>
            <li>
                <a href="http://freewebsitetemplates.com/go/facebook/" id="facebook">facebook</a>
            </li>
            <li>
                <a href="http://freewebsitetemplates.com/go/googleplus/" id="googleplus">googleplus</a>
            </li>
            <li>
                <a href="http://pinterest.com/fwtemplates/" id="pinterest">pinterest</a>
            </li>
        </ul>
    </div>
</div>
</body>
</html>
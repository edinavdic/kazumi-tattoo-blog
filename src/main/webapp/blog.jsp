<%--
  Created by IntelliJ IDEA.
  User: edin
  Date: 1/1/20
  Time: 7:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>

<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Blog - Kazumi Tattoo</title>
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
        <li class="selected">
            <a href="blog">blog</a>
        </li>
        <li>
            <a href="contact">contact</a>
        </li>
    </ul>
</div>
<div id="body">
    <h1><span>blog</span></h1>
    <div>
        <ul>
            <li>
                <a href="blog-single-post.html" class="figure">
                    <img src="images/cutting-mustache.jpg" alt="">
                </a>
                <div>
                    <h3>why i grew a mustache</h3>
                    <p>
                        Our website templates are created with inspiration, checked for quality and originality and meticulously sliced and coded. What’s more, they’re absolutely free! You can do a lot with them. You can modify them.
                    </p>
                    <a href="blog-single-post.html" class="more">read this</a>
                </div>
            </li>
            <li>
                <a href="blog-single-post.html" class="figure">
                    <img src="images/in-the-country.jpg" alt="">
                </a>
                <div>
                    <h3>in the country</h3>
                    <p>
                        Our website templates are created with inspiration, checked for quality and originality and meticulously sliced and coded. What’s more, they’re absolutely free! You can do a lot with them. You can modify them.
                    </p>
                    <a href="blog-single-post.html" class="more">read this</a>
                </div>
            </li>
            <li>
                <a href="blog-single-post.html" class="figure">
                    <img src="images/mustache-brothers.jpg" alt="">
                </a>
                <div>
                    <h3>the mustache brothers</h3>
                    <p>
                        Our website templates are created with inspiration, checked for quality and originality and meticulously sliced and coded. What’s more, they’re absolutely free! You can do a lot with them. You can modify them.
                    </p>
                    <a href="blog-single-post.html" class="more">read this</a>
                </div>
            </li>
        </ul>
    </div>
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


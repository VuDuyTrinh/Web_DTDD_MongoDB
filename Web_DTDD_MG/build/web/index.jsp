<%-- 
    Document   : index.jsp
    Created on : Dec 19, 2016, 7:03:29 PM
    Author     : SUALAPTOP24h.NET
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!--    <link rel="stylesheet/less" type="text/css" href="less/simplex.less">
	<link rel="stylesheet/less" type="text/css" href="less/classified.less">
	<link rel="stylesheet/less" type="text/css" href="less/amelia.less">  MOVE DOWN TO activate
	-->
	<link rel="stylesheet/less" type="text/css" href="less/bootshop.less">
	<script src="js/less.js" type="text/javascript"></script> 
	
<!-- Bootstrap style --> 
    <link id="callCss" rel="stylesheet" href="bootshop/bootstrap.min.css" media="screen"/>
    <link href="css/base.css" rel="stylesheet" media="screen"/>
	<link href="css/bootstrap-responsive.min.css" rel="stylesheet"/>
	<link href="css/font-awesome.css" rel="stylesheet" type="text/css">
	<link href="js/google-code-prettify/prettify.css" rel="stylesheet"/>
    <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
	<style type="text/css" id="enject"></style>
    </head>
    <body>
         <jsp:include page="header.jsp"></jsp:include>
      <jsp:include page="sanpham.jsp"></jsp:include>
      <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>

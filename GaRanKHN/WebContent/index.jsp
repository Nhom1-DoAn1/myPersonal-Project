<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<link rel="shortcut icon" href="favicon.ico">
<title>KHN Việt Nam</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/font-awesome.min.css" rel="stylesheet">
<link href="css/prettyPhoto.css" rel="stylesheet">
<link href="css/price-range.css" rel="stylesheet">
<link href="css/animate.css" rel="stylesheet">
<link href="css/main.css" rel="stylesheet">
<link href="css/responsive.css" rel="stylesheet">
<!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->



<style type="text/css">
body {
	background-color: #ff3640;
}


.myAds img 
{	
margin-left: 80px;
margin-top: 20px;	
margin-bottom: 20px;	
float:none;
width: 400px;
height: 400px;
border: 5px solid #fff;
}

.myAds img:hover {
	border: 5px solid #eca71b;
}

</style>

</head>
<!--/head-->
<body>

	<div id="container">
		
		<div id="header">
		
			<%@ include file="header.jsp"%>
		</div>


		<div id="content">


		<%@ include file="ads.jsp"%>

	
		</div>


		<div id="footer">
			<%@ include file="footer.jsp"%>
		</div>
		
	</div>








</body>
</html>
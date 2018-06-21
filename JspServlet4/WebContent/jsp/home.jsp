<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/home.css" rel="stylesheet">
  <link href="css/signUp.css"  rel="stylesheet" > 

<title>home</title>
</head>
<body>
<h1> Home jsp </h1>
<h2><a href="${pageContext.request.contextPath}/Login">to ==> Login</a> </h2>
<h2><a href="${pageContext.request.contextPath}/SignUp">to ==> SignUp</a> </h2>

<!-- 	<span style="color: #00CC00">Hello</span> -->
	<h1><span style="color: ${cookie.color.value}" >Hello</span></h1>

	<form action="home" method="post">
		<label> <select name="color" id="color">
				<option value="red" >red</option>
				<option value="blue">blue</option>
				<option value="yellow">yellow</option>
		</select>
		</label>
		<input type="submit" value="Color send">
	</form>

</body>
</html>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> login.jsp </title>
<link href="css/demo.css" rel="stylesheet">
  <link href="css/signUp.css"  rel="stylesheet" > 
</head>
<body>
<h1> Login jsp </h1>


<h2><a href="${pageContext.request.contextPath}/SignUp">to ==> Login</a> </h2>
<h2><a href="${pageContext.request.contextPath}/home">to ==> Home</a> </h2>

<div class="form-style-2">

<div class="form-style-2-heading">
Please sign up
</div>



	<form action="Login" method="post">
		<label for="name"  class="required"> user  name <input type="text" class="input-field" id="name" name="name">
		</label>   <br><br>
		<label for="password" class="required"> user password <input type="password"  class="input-field"  id="password" name="password">
		</label >   <br><br>
		<input type="submit"  id="" value="sign up" name="submit">

	</form>

<div class="form-style-2-heading">
Already registered
</div>

  </div>
</body>
</html>
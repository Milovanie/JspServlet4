<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<%-- <link rel="stylesheet" href='<c:url value="/WEB-INF/../css/signUp.css"/>' type="text/css"/> --%>
<!-- <link rel="stylesheet" type="text/css" href="mycss/signUp.css" > -->

  <link href="css/signUp.css"  rel="stylesheet" > 

<title>sign up jsp </title>
</head>
<body>
<h1> sign up jsp </h1> 

<h2><a href="${pageContext.request.contextPath}/Login">to ==> Login</a> </h2>
<h2><a href="${pageContext.request.contextPath}/home">to ==> Home</a> </h2>


  <br />
<div class="form-style-2"><br />

<div class="form-style-2-heading">
Please sign up<br />
</div>

	<form action="SignUp" method="post">
		<label for="name"  class="required"> user  name <input type="text" class="input-field" id="name" name="name">
		</label>   <br><br>
		<label for="password" class="required"> user password <input type="password"  class="input-field"  id="password" name="password">
		</label >   <br><br>
		<label for="birthday" class="required"> user birthday <input type="text" value="1995-01-01" class="input-field"  id="birthday" name="birthday">
		</label>   <br><br>
		<input type="submit"  id="" value="sign up" name="submit">

	</form>

<div class="form-style-2-heading">
Already registered
</div>

<div class="form-style-2">
	<table border="2" class="tableA">

		<tr>
			<th>name</th>
			<th>password</th>
			<th>birthday</th>
		</tr>
		<c:forEach items="${usersFromServer }" var="user">
			<tr>
				<td>${user.name }</td>
				<td>${user.password }</td>
				<td>${user.birthday }</td>
			</tr>
			<tr></tr>
		</c:forEach>
	</table>
	
	</div>
  </div>
</body>
</html>
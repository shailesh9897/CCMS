<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Registration</title>
<link type="text/css"
	  rel="stylesheet"
	  href="${pageContext.request.contextPath}/resources/css/style.css"
>
<link type="text/css"
	  rel="stylesheet"
	  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css"
>
</head>
<body>
<div id="wrapper">
<div id="header">
<h1>CCMS-Customer Contact Management  System</h1>

</div>
</div>
<div id="container">
<h3>New Registration Form</h3>

</div>
<form:form action="addnewcustomer" modelAttribute="customerdata" method="POST">
<table>
		<tr> 
			<td><label>First Name:</label></td>
			<td><label><form:input path="firstName"/></label></td>
		</tr>
		
		<tr> 
			<td><label>Last Name:</label></td>
			<td><label><form:input path="lastName"/></label></td>
		</tr>
		
		<tr> 
			<td><label>Email:</label></td>
			<td><label><form:input path="email"/></label></td>
		</tr>
		
		<tr> 
			<td><label>Phone:</label></td>
			<td><label><form:input path="phone"/></label></td>
		</tr>
</table>
<input type="submit" value="Save" class="save">
</form:form>

</body>
</html>
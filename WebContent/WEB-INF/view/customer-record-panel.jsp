<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Contact Management System </title>
<link type="text/css"
	  rel="stylesheet"
	  href="${pageContext.request.contextPath}/resources/css/style.css"
>
</head>
<body>

<div id="wrapper">
<div id="header">
<h1>CCMS-Customer Contact Management  System</h1>

</div>
</div>

<div id="container">
<div id="content">
<input type="button" 
value="Add New Costumer"
onclick="window.location.href='showaddform';return false"
class="add-button">

<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Phone</th>
</tr>


<c:forEach var="customerlist" items="${allcustomer}">
<tr>
<td>${customerlist.firstName}</td>
<td>${customerlist.lastName}</td>
<td>${customerlist.email}</td>
<td>${customerlist.phone}</td>
</tr>
</c:forEach>

</table>


</div>
</div>






</body>
</html>
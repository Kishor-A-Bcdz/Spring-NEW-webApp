
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>

<!-- Popper JS -->
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<meta charset="ISO-8859-1">
<title>Registration</title>
<style>
.error{
color:red;
}

.errorblock{
color:white;background-color:black;padding:8px;margin:16px;
}
</style>
</head>
<body>
<h1>Registration</h1>

<form:form modelAttribute="registrations" >
<form:errors path="*" cssClass="errorblock" element="div"/>
	<table>
		<tr>
			<td>
				<spring:message code="name"/>
			</td>
			<td>
				<form:input path="name"/> 
			</td>
			<td>
			    <form:errors path="name" cssClass="error"/>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="submit">
			</td>
		</tr>
	</table>

</form:form>

</body>
</html>
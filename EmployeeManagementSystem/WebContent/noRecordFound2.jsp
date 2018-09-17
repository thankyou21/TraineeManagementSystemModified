<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="nr" uri="http://www.springframework.org/tags/form" %>
	<nr:form modelAttribute="tdetails">
	<h1>Sorry,No record found for id ${tdetails.traineeId}</h1><br>
	<a href="start.obj">Click here to go to the Login page</a>
	</nr:form>
</body>
</html>
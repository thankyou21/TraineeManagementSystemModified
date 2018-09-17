<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="d" uri="http://java.sun.com/jstl/core_rt" %>


	<h1>Trainee Details</h1>
	
	<table> 
			<tr>
				<td>Trainee Id</td>
				<td>Trainee Name</td>
				<td>Trainee Location</td>
				<td>Trainee Domain</td>
			</tr>
		<d:forEach var="tr" items="${tList}">
			<tr>
				<td>${tr.traineeId}</td>
				<td>${tr.traineeName}</td>
				<td>${tr.traineeLocation}</td>
				<td>${tr.traineeDomain}</td>
			</tr>
		</d:forEach>
	</table>
	
	<br><a href="start.obj">Click here to go to the Login page</a>
</body>
</html>
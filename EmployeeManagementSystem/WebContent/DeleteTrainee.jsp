<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib prefix="d" uri="http://www.springframework.org/tags/form" %>
	<%@taglib prefix="p" uri="http://java.sun.com/jstl/core_rt" %>
	
	<d:form action="delete1.obj" modelAttribute="tdetails">
	<table>
		<tr>
			<td>Enter Trainee Id</td>
			<td><d:input path="traineeId"/></td>
		</tr>
		<tr>
			<td><d:button>Delete</d:button></td>
		</tr>
	</table>
	</d:form>
	<br>
	<br>
	<br>
	<p:if test="${flag==true}">
		<d:form action="delete2.obj" modelAttribute="trainee">
			<d:hidden path="traineeId"/>
			<table>
				<tr>
					<td>Trainee Id</td>
					<td>Trainee Name</td>
					<td>Trainee Location</td>
					<td>Trainee Domain</td>
				</tr>
				<tr>
					<td>${trainee.traineeId}</td>
					<td>${trainee.traineeName}</td>
					<td>${trainee.traineeLocation}</td>
					<td>${trainee.traineeDomain}</td>
				</tr>
				<tr>
					<td><d:button>Delete</d:button></td>
				<tr>
			</table>
		</d:form>
	</p:if>
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib prefix="l" uri="http://www.springframework.org/tags/form" %>
	
	<l:form action="validate.obj" modelAttribute="vl">
		<table>
			<tr>
				<td>Enter Username</td>
				<td><l:input path="userName"/><l:errors path="userName"/></td>
			</tr>
			<tr>
				<td>Enter Password</td>
				<td><l:password path="password"/><l:errors path="password"/></td>
			</tr>
			<tr>
				<td><l:button>Login</l:button></td>
			</tr>
		</table>
	</l:form>
</body>
</html>
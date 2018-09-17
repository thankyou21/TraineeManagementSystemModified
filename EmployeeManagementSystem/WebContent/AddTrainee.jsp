<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib prefix="ed" uri="http://www.springframework.org/tags/form" %>
	
	<ed:form action="AddToDB.obj" modelAttribute="tdetails">
		<table>
			<tr>
				<td>Enter Trainee Name</td>
				<td><ed:input path="traineeName"/><ed:errors cssStyle="color:red" path="traineeName"/></td>
			</tr>
			<tr>
				<td>Enter Trainee Location</td>
				<td><ed:radiobutton path="traineeLocation" value="Chennai"/>Chennai
					<ed:radiobutton path="traineeLocation" value="Bangalore"/>Bangalore
					<ed:radiobutton path="traineeLocation" value="Pune"/>Pune
					<ed:radiobutton path="traineeLocation" value="Mumbai"/>Mumbai
					<ed:errors cssStyle="color:red" path="traineeLocation"/>
				</td>
			</tr>
			<tr>
				<td>Enter Trainee Domain</td>
				<td><ed:select path="traineeDomain">
						<ed:option value="CLOUD">CLOUD</ed:option>
						<ed:option value="JEE">JEE</ed:option>
						<ed:option value="BI">BI</ed:option>
						<ed:option value=".NET">.NET</ed:option>
					</ed:select>
				<%-- 	<ed:errors path="traineeDomain"/> --%>
				</td>
			</tr>
			<tr>
				<td><ed:button>Add Trainee</ed:button></td>
			</tr>
		</table>
	</ed:form>
	
</body>
</html>
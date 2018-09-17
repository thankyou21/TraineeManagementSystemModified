<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib prefix="m" uri="http://www.springframework.org/tags/form" %>
	
	<m:form action="modify.obj" modelAttribute="tdetails">
		<table>
			<tr>
				<td>Enter Trainee Id</td>
				<td><m:input path="traineeId"/><m:errors cssStyle="color:red" path="traineeId"/></td>
			</tr>
			<tr>
				<td>Enter Trainee Name</td>
				<td><m:input path="traineeName"/><m:errors cssStyle="color:red" path="traineeName"/></td>
			</tr>
			<tr>
				<td>Enter Trainee Location</td>
				<td><m:radiobutton path="traineeLocation" value="Chennai"/>Chennai
					<m:radiobutton path="traineeLocation" value="Bangalore"/>Bangalore
					<m:radiobutton path="traineeLocation" value="Pune"/>Pune
					<m:radiobutton path="traineeLocation" value="Mumbai"/>Mumbai
					<m:errors cssStyle="color:red" path="traineeLocation"/>
				</td>
			</tr>
			<tr>
				<td>Enter Trainee Domain</td>
				<td><m:select path="traineeDomain">
						<m:option value="CLOUD">CLOUD</m:option>
						<m:option value="JEE">JEE</m:option>
						<m:option value="BI">BI</m:option>
						<m:option value=".NET">.NET</m:option>
					</m:select>
				<%-- 	<m:errors path="traineeDomain"/> --%>
				</td>
			</tr>
			<tr>
				<td><m:button>Modify Trainee</m:button></td>
			</tr>
		</table>
	</m:form>
</body>
</html>
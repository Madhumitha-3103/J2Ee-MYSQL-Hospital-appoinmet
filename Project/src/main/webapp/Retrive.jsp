<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
*{
text-align:center;
color: green;
background-color: lightpink;
}
table{
margin-left:450px;
}
</style>
</head>
<body>
<h3>Retriving Patient Appoinment Details</h3>
<br>
<table border="1">
<tr>
<th>Patient Id</th>
<th>Patient Name</th>
<th>patient Age</th>
<th>Patient DOB</th>
<th>Concern Doctor</th>
<th>Appoinment Date&Time</th>

</tr>

<c:forEach items="${view}" var="patientdetails">
<tr>
<td><c:out value="${patientdetails.appNo}"></c:out></td>
<td><c:out value="${patientdetails.patientName }"></c:out></td>
<td><c:out value="${patientdetails.patientAge }"></c:out></td>
<td><c:out value="${patientdetails.patientDob }"></c:out></td>
<td><c:out value="${patientdetails.doctorName }"></c:out></td>
<td><c:out value="${patientdetails.dateandtime }"></c:out></td>

<td><a href="Deletepatient?id=<c:out value="${patientdetails.appNo}"/>">Delete</a></td>
<td><a href="Updateservelet?id=<c:out value='${patientdetails.appNo}'/>" >Update</a></td>
</c:forEach>

</table>

</body>
</html>     
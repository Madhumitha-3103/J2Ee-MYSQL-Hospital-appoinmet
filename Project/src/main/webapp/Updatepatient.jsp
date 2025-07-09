
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
h3{
text-align:center;
}
body{
background-color: grey;
text-align:center;
}
container2{
text-align:center;
}
button{
margin-top:20px;
border-radius:6px;
}
.label1{
display: block;
}
input{
width:50%;
height:30px;
margin-bottom:auto;
border-radius:6px;

}
</style>
</head>
<body>
<form action="Updateview" method="post">
<h3>Registration Page</h3>
<div class="container">

<label class="label1"><b>Appoinment No</b></label>
<input type="text" name="appNo" value="c<c:out value='${id}'/>">
<label class="label1"><b>Patient Name</b></label>
<input type="text" name="patientName" placeholder="Enter patient name" required>
<label class="label1"><b>Patient Age</b></label>
<input type="text" name="patientAge" placeholder="Enter patient age" required>
<label class="label1"><b>Patient DOB</b></label>
<input type="date" name="patientDob" placeholder="Enter patiet DOB" required>
<label class="label1"><b>Doctor Name</b></label>
<input type="text" name="doctorName" placeholder="Enter doctor name" required>
<label class="label1"><b>Appoinment Date and Time</b></label>
<input type="datetime-local" name="dateandtime" placeholder="select Appoinmet date and time" required>
<div class="container2">
<button  type="submit"><b>Fix Appoinment</b></button>
</div>
</div>

</form>

</body>
</html>
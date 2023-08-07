<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 style="color: blue; margin-left: 400px">Provide your Details here!!</h2>
<div style="margin-left: 450px">
<form action="registerMe" method="post" enctype="multipart/form-data">
	Username:<input type="text" name="uname"><br><br>
	Password: <input type="text" name="password"><br><br>
	Complete Name:<input type="text" name="name"><br><br>
	Email:<input type="text" name="email"><br><br>
	Choose Role:<br><br>
	Admin:<input type="radio"  name="role" value="admin">
	Student:<input type="radio" name="role" value="student"> <br><br>
	<input type="file" name="image"><br><br>
	<input type="submit" value="Register" >
</form>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
This is welcome page for Student
//<img alt="abc" src="/photos/Screenshot (2).png" height="150px", width="150px">

${userData.getName() }
${userData.getEmail() }
${userData.getUsername() }
${userData.getPassword() }
</body>
</html>
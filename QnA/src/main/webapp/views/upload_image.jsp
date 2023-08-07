<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<Form action="users/save" enctype="multipart/form-data" method="post">

Username:<input type="text"><br><br>
Password:<input type="text"><br><br>
<input type="file" name="image">
<input type="submit">
</Form>
</body>
</html>
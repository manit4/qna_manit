<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
I am updae Page
<form action="/update" method="post">
Question Id:<input type="text" value="${quesAndAns.getBookId() }" readonly name="questionId"><br><br>
Question:<input type="text" value="${quesAndAns.getQuestion() }" name="question"><br><br>
Answer:<input type="text" value="${quesAndAns.getAnswer() }" name="answer"><br><br>
Category:<input type="text" value="${quesAndAns.getCategory() }" name="category"><br><br>
<input type="submit" value="Submit">
</form>
</body>
</html>
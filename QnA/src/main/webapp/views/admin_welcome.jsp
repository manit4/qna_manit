<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.List, com.nriit.to.QuesAndAns" %>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<H2 style="margin-left: 500px; color: Blue">Welcome Admin</H2>

<table class="table">
  <thead>
    <tr>
      <th scope="col">Username</th>
      <th scope="col">Complete Name</th>
      <th scope="col">Email</th>
      <th scope="col">Role</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>${userData.getUsername() }</td>
	<td>${userData.getName() }</td>
	<td>${userData.getEmail() }</td>
	<td>${userData.getRole() }</td>
    </tr>
    
   
  </tbody>
</table>

<h3 style="margin-left: 300px; color: Red">Below are the Questions and Answers available in the Question Bank</h3>
${quesAndAns.get(0).getAnswer()}
${quesAndAns.get(0).getBookId()}
${quesAndAns.get(0).getQuestion()}
${quesAndAns.get(0).getCategory()}

<%
List<QuesAndAns> questions = (List<QuesAndAns>) request.getAttribute("quesAndAns");
%>

<table class="table">
  <thead>
    <tr>
      <th scope="col">Question Id</th>
      <th scope="col">Question</th>
      <th scope="col">Answer</th>
      <th scope="col">Category</th>
      <th scope="col">Update</th>
      <th scope="col">Delete</th>
    </tr>
  </thead>
  <tbody>
<%
for(int i = 0; i < questions.size(); i++) {
	
%>
<tr>
<td><%= questions.get(i).getBookId()%></td>
<td><%= questions.get(i).getQuestion()%></td>
<td><%= questions.get(i).getAnswer()%></td>
<td><%= questions.get(i).getCategory()%></td>
<td><a href = "">Update</a></td>
<td><a href = "">Delete</a></td>
</tr>

<%} %>

</table>




























</body>
</html>
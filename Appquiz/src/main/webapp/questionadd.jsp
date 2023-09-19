<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="database.questions"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Add Question</title>
</head>
<body>
	
	<form action="addq" method="post">
	<div align="center">
	<label>Question</label><input type="text" name="qid">  <br><br>
	<label>Question</label><textarea rows="3" cols="30" name="que"></textarea> <br><br>
	<label>option a</label><input type="text" name="opa">  <br><br>
	<label>option b</label><input type="text" name="opb">  <br><br>
	<label>correct option</label><input type="text" name="correct">  <br><br>
	<input type="submit" value="Add Question" >
	
	</div>
	<%
	String qid=request.getParameter("qid");	
	String que=request.getParameter("que");
	String opa=request.getParameter("opa");
	String opb=request.getParameter("opb");
	String correct=request.getParameter("correct");
	questions.addquestion(qid,que,opa,opb,correct);
	%>
	</form>
</body>
</html>
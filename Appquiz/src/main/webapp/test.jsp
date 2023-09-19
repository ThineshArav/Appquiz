<%@page import="database.questions"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test</title>
</head>
<body style="background: orange;text-align: center;">
	<%!
	int q=1;
	String qid="";
	String ques="";
	String opa="";
	String opb="";
	%>
	<%
	while(q<=3)
	{
		
		ArrayList al = questions.fetchques(q);
		for(Object o:al)
		{
			//out.print(o+"<br>");
			String row=o.toString();
			String [] qa=row.split(":");
			 qid=qa[0];
			 ques=qa[1];
			 opa=qa[2];
			 opb=qa[3];
			/*out.print(qid+" "+ques+"<br>");
		
			out.print("<input type="radio">"+opa+"<br>");
			out.print(opb+"<br>");*/
			
		}
		q++;
		break;
		//if(q==3)
		
}
	
	%>
	<form action="test.jsp" style="background-color: lime;" >
	<div>
	<h1>Q. <%= qid %>  </h1>
	<h2><%=ques %></h2>
	A.<input type="radio"><%=opa %><br>
	B.<input type="radio"><%=opb %><br><br>
	<input type="submit" value="next"><br><br>
	</div>
	</form>
	<form action="finsh.jsp"><div><input type="submit" value="submit" ></div></form>
	
</body>
</html>
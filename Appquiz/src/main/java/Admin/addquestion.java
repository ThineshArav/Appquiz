package Admin;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.questions;
@WebServlet("/addq")
public class addquestion extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse resp)
	{
	String qid=req.getParameter("qid");
	String que=req.getParameter("que");
	String opa=req.getParameter("opa");
	String opb=req.getParameter("opb");
	String correct=req.getParameter("correct");
	
	questions.addquestion(qid,que,opa,opb,correct);
	
	}

}

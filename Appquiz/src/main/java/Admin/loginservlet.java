package Admin;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/log")
public class loginservlet extends HttpServlet{
				public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException
				{
					String webEmail=req.getParameter("email");
					String webpass=req.getParameter("pass");
					
					String aMail="admin";
					String apass="admin";
										
					if(aMail.equals(webEmail)&& apass.equals(webpass))
					{
						resp.sendRedirect("questionadd.jsp");//question add web page link
					}
					else
					{
						resp.sendRedirect("index.jsp");
					}
				}
}

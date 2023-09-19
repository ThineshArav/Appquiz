package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class questions {
	public static void addquestion(String qid,String que,String opa,String opb,String correct)
	{
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String pass="system";
		String sql="INSERT INTO question Values(?,?,?,?,?)";
		try 
		{
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url, user, pass);
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,Integer.parseInt(qid));
			ps.setString(2, que);
			ps.setString(3, opa);
			ps.setString(4, opb);
			ps.setString(5, correct);
			ps.executeUpdate();
		}
		catch (Exception e) {
        e.printStackTrace();
		}
	}
	public static ArrayList fetchques(int q1) {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String pass="system";
		String sql="SELECT * FROM question WHERE QUESTION_ID = "+q1;
		ArrayList al=new ArrayList();
		try 
		{
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url, user, pass);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
			{
				String q=rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getString(4);
				al.add(q);
			}
		}
		catch (Exception e) {
        e.printStackTrace();
		}
		return al;
	}
}

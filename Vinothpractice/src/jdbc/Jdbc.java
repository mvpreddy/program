package jdbc;
import java.sql.*;
public class Jdbc {
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","mvpreddy@123");//URL,name,password
		Statement stmt=con.createStatement();
		String sql="CREATE TABLE emp(int id)";
		stmt.execute(sql);
		System.out.println("done");
	}
}



	/*public static void main(String[] args)throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","mvpreddy@123");
		Statement stmt=con.createStatement();
		String sql="create table st2(id number(2))";
		stmt.execute(sql);
		System.out.println("done");
		// TODO Auto-generated method stub

	}
}
*/
package jdbc;

import java.sql.*;
class  B
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","mysql","12345");
		Statement stmt=con.createStatement();
		String sql="CREATE TABLE PERSON(" + 
			                     "SNO NUMBER(2),FIRST_NAME VARCHAR(40),"+" AGE NUMBER(2),EMAIL VARCHAR2(30))";
		stmt.execute(sql);
		System.out.println("done");
	}
}

package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {
	public static void main(String[] args) throws SQLException, ClassNotFoundException  {
		
		//fetch db url, password, username of the mysql db
		
		String dbURL="jdbc:mysql://localhost:3306/2607wiprodb";
		
		String username="root";
		
		String password="Maisha@#0302";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//load the mysql driver file
		
		//The line Class.forName("com.mysql.cj.jdbc.Driver"); in Java is used to explicitly
		
		//Create a connection to the database- connecting the database in java application
		
		//in JDBC ( Java Database connectivity), a connection represents an active session
		
		Connection con= DriverManager.getConnection(dbURL, username, password);
		
		
		//create the statement object
		
		//in JDBC(Java Database connectivity), a statement object is an interface used
		
		Statement st=con.createStatement();
		
		//execute the queries
		
		String selectquery="select *from peeps;";
		
		//pass the selectquery to result set
		
		ResultSet rs=st.executeQuery(selectquery);
		
		//result set in JDBC(Java Database connectivity), a result is an object
		
		//while(rs.next()) {
			//System.out.println(rs.getString("PersonID"));
			//System.out.println(rs.getString("FName"));
			//System.out.println(rs.getString("LName"));
			
			//Basic syntax for result set
			
			/*int id=rs.getInt("PersonID");
			
			System.out.println(id);
			
			//fetch FName
			
			String FName=rs.getString("FName");
			System.out.println(FName);*/
			
			//use column indexing
			
		/*int id1=rs.getInt(1);
			System.out.println(id1);
			
			String s=rs.getString(2);
			System.out.println(s);
			*/
			 
			
			 
			
		
		con.close();
	}
	
	
	}




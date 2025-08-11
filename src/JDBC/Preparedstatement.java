package JDBC;
import java.sql.*;

public class Preparedstatement{

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        String dbURL = "jdbc:mysql://localhost:3306/2607wiprodb";
        String username = "root";
        String password = "Maisha@#0302";

        // Load MySQL driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Create DB connection
        Connection con = DriverManager.getConnection(dbURL, username, password);

        // SQL query with placeholder
        String query = "SELECT * FROM Peeps WHERE FName = ?";

        // Create PreparedStatement
        PreparedStatement ps = con.prepareStatement(query);

        // Set value for the placeholder
        ps.setString(1, "Ram");

        // Execute query
        ResultSet rs = ps.executeQuery();

        // Print results
        while (rs.next()) {
            System.out.println(rs.getString("FName"));
            System.out.println( rs.getString("LName"));
        }
        


         //   String query1="Select * from Peeps where FName='Ravi' and PersonID='101'";
            
            String query2="Select * from Peeps where FName=? and PersonID=?";
            
            PreparedStatement ps1 = con.prepareStatement(query2);
            //set parameters
            
            ps1.setString(1,"Ram");
            ps1.setInt(2,101);
            
            ResultSet rs1=ps1.executeQuery();
            	
            	while (rs1.next()) {
            		System.out.println(rs1.getString("Address"));
            		System.out.println(rs1.getString("LName"));
            		System.out.println(rs1.getString("City"));
            	}
            
        

        // Close connection
        con.close();
    }
}
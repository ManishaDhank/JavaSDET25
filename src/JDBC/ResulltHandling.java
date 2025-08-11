package JDBC;
import java.sql.*;

public class ResulltHandling{
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        String dbURL = "jdbc:mysql://localhost:3306/2607wiprodb";
        String username = "root";
        String password = "Maisha@#0302";

        // Load MySQL driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Create DB connection
        Connection con = DriverManager.getConnection(dbURL, username, password);

        // Create statement
        Statement st = con.createStatement();

        // Query
        String selectquery = "SELECT * FROM peeps;";
        ResultSet rs = st.executeQuery(selectquery);

        // Get column count
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();

        // Loop through each row
        while (rs.next()) {
            // Loop through each column in the row
            for (int i = 1; i <= columnCount; i++) {
                String columnName = rsmd.getColumnName(i);
                String columnValue = rs.getString(i);
                System.out.print(columnName + ": " + columnValue + "  ");
            }
            System.out.println(); // new line after each row
        }

        // Close connection
        con.close();
    }
}

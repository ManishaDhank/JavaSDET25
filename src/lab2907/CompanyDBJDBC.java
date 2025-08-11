package lab2907;
import java.sql.*;

public class CompanyDBJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/companydb";
        String username = "root";
        String password = "Maisha@#0302"; 
        
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection conn = DriverManager.getConnection(url, username, password);
         

            // --- SELECT all employees ---
            String selectQuery = "SELECT * FROM employees";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(selectQuery);

            System.out.println("\n--- Employee Records ---");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String department = rs.getString("department");
                double salary = rs.getDouble("salary");
                System.out.println(id + " | " + name + " | " + department + " | " + salary);
            }

            // --- INSERT a new employee ---
            String insertQuery = "INSERT INTO employees (id, name, department, salary) VALUES (?, ?, ?, ?)";
            PreparedStatement psInsert = conn.prepareStatement(insertQuery);
            psInsert.setInt(1, 104);
            psInsert.setString(2, "David");
            psInsert.setString(3, "Marketing");
            psInsert.setDouble(4, 58000);
            int rowsInserted = psInsert.executeUpdate();
            System.out.println("\nInserted rows: " + rowsInserted);


            String updateQuery = "UPDATE employees SET department = ? WHERE name = ?";
            PreparedStatement psUpdate = conn.prepareStatement(updateQuery);
            psUpdate.setString(1, "Finance");
            psUpdate.setString(2, "Alice");
            int rowsUpdated = psUpdate.executeUpdate();
 

          
            ResultSet rsUpdated = stmt.executeQuery("SELECT * FROM employees WHERE name = 'Alice'");

            while (rsUpdated.next()) {
                System.out.println(rsUpdated.getInt("id") + " | " +
                                   rsUpdated.getString("name") + " | " +
                                   rsUpdated.getString("department") + " | " +
                                   rsUpdated.getDouble("salary"));
            }

            // Close resources
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
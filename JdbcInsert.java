//Compile
// javac -cp .;mysql-connector-j-9.5.0.jar JdbcInsert.java
//RUN
// java -cp .;mysql-connector-j-9.5.0.jar JdbcInsert

import java.sql.*;
import java.util.Scanner;

public class JdbcInsert {
    public static void main(String[] args) {

        //  MySQL connection details
        String url = "jdbc:mysql://localhost:3306/demo_jdbc";
        String user = "root";         // ROOT of MySQL
        String password = "swagat";     //  MySQL password


        // Take Data input From Comandline after run the Program
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();


        //Exeception Handling
        try {
            //Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");   // Class Name //JDBC Connector is Establish between JAVA and MySQL Database

            //Establish connection
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL Database!");

            //Create SQL Insert Query
            String query = "INSERT INTO users (name, email) VALUES (?, ?)";

            //Use PreparedStatement to avoid SQL Injection
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, email);

            // Execute the query
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Data inserted successfully!");
            }

            // Close connection
            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Hey There is Error: " + e.getMessage());
        }

        sc.close();
    }
}

package com.jdbc;
import java.sql.*;

public class JDBCInsertDemo {
    public static void main(String[] args) throws Exception{
        // Load the JDBC Driver [jar file]
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Start / Establish the connection
        Connection connection = DriverManager.
                getConnection("jdbc:mysql://localhost:3306/snpsu_ise_jdbc",
                        "root",
                        "1234");
        System.out.println("Connection Established!!!");
        String fname = "Saurav";
        String lname = "J S";
        // Avoid SQL Injections - we don't write the exact column names in QUERY
        // We give question marks for the parameters
        PreparedStatement ps = connection.
                prepareStatement("INSERT INTO students VALUES (?,?)");
        ps.setString(1, fname);
        ps.setString(2, lname);
        int i = ps.executeUpdate(); // This returns the number of rows affected
        if(i > 0){
            System.out.println("Inserted data successfully!");
        }else {
            System.out.println("Failed to insert data!");
        }
        ps.close();
        connection.close();
    }
}

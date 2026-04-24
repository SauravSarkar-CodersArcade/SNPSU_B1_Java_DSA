package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCCreateTableDemo {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/snpsu_ise_jdbc";
        String USERNAME = "root";
        String PASSWORD = "1234";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection
                    (URL, USERNAME, PASSWORD);
            System.out.println("Connection Established!!!");
            Statement statement = connection.createStatement();
            String createTableQuery = "CREATE TABLE teachers (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "name VARCHAR(50), " +
                    "age INT, " +
                    "salary DOUBLE)";
            statement.executeUpdate(createTableQuery);
            System.out.println("Table 'teachers' created!");
        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}

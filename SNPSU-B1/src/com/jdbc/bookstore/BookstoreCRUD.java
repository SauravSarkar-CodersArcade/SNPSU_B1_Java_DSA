package com.jdbc.bookstore;

import java.sql.*;
import java.util.Scanner;

public class BookstoreCRUD {
    private static final String URL =
            "jdbc:mysql://localhost:3306/ise_bookstore_db";
    private static final  String USERNAME = "root";
    private static final  String PASSWORD = "1234";

    public static void main(String[] args) {
        // Try with resources [The classes are auto-closed by JVM]
        try(Connection conn =
                    DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Scanner scanner = new Scanner(System.in)) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // MAIN CRUD APPLICATION [BOOKSTORE]
            while (true){
                // Display some menu options
                System.out.println("\n1. Create Book | 2. Read Books | 3. Update Book | 4. Delete Book | 5. Exit");
                System.out.print("Choice: ");
                int ch = scanner.nextInt();
                scanner.nextLine(); // Consume leftover newline - goes to next
                // ======================== CREATE ========================
                if(ch == 1){
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Price: ");
                    double price = scanner.nextDouble();
                    // Prepared Statement to prevent SQL Injection
                    String sql = "INSERT INTO books (title, author, price) VALUES (?, ?, ?)";
                    try(PreparedStatement ps = conn.prepareStatement(sql)) {
                        ps.setString(1, title);
                        ps.setString(2, author);
                        ps.setDouble(3, price);
                        ps.executeUpdate(); // Executes the INSERT Operation
                        System.out.println("Book: " + title + " added to DB");
                    }
                }
                // ================ READ =========================
                else if (ch == 2){
                    String sql = "SELECT * FROM books";
                    try(Statement statement = conn.createStatement();
                    ResultSet rs = statement.executeQuery(sql)) {
                        System.out.println("ID | TITLE | AUTHOR | PRICE");
                        while (rs.next()){
                            int id = rs.getInt("id");
                            String title = rs.getString("title");
                            String author = rs.getString("author");
                            double price = rs.getDouble("price");
                            System.out.println(id + "\t|\t" + title + "\t|\t" + author + "\t|\t" + price);
                        }
                    }
                }
                // ============================ UPDATE =========================
                else if(ch == 3){
                    System.out.print("Enter Book ID to Update: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume the leftover line
                    System.out.print("New Title: ");
                    String title = scanner.nextLine();
                    System.out.print("New Author: ");
                    String author = scanner.nextLine();
                    System.out.print("New Price: ");
                    double price = scanner.nextDouble();
                    String sql = "UPDATE books SET title=?, author=?, price=? WHERE id=?";
                    try(PreparedStatement ps = conn.prepareStatement(sql)) {
                        ps.setString(1, title);
                        ps.setString(2, author);
                        ps.setDouble(3, price);
                        ps.setInt(4, id);
                        int rows = ps.executeUpdate(); // Returns affected rows
                        if(rows > 0) System.out.println("Updated.");
                        else System.out.println("ID NOT FOUND.");
                    }
                }
                // ======================= DELETE =============================
                else if(ch == 4){
                    System.out.print("Enter Book ID to delete: ");
                    int id = scanner.nextInt();
                    String sql = "DELETE FROM books WHERE id=?";
                    try(PreparedStatement ps = conn.prepareStatement(sql)) {
                        ps.setInt(1, id);
                        int rows = ps.executeUpdate();
                        if(rows > 0) System.out.println("Deleted.");
                        else System.out.println("ID NOT FOUND.");
                    }
                }
                // ========================= EXIT ========================
                else if (ch == 5) {
                    System.out.println("Exiting the BOOKSTORE system: ");
                    for (int i=0; i<5; i++){
                        System.out.print(" . ");
                        Thread.sleep(1000);
                    }
                    break; // Exits the while loop
                }
                // HANDLE THE INVALID MENU CASES
                else{
                    System.out.println("Invalid Choice,");
                    System.out.println("CHOICES: [1,2,3,4,5]");
                }
            }
        }catch (ClassNotFoundException e){
            System.out.println("MYSQL JDBC Driver not found. Add JAR to classpath.");
        }catch (SQLException e){
            System.out.println("Database Error: " + e.getMessage());
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}

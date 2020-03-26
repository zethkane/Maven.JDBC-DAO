package models;

import java.sql.*;

public class DataTransfer implements DataTransferInterface {

    static String username = "zeth";
    static String password = "password";
    static String dbUrl = "jdbc:mysql://localhost:3306/jdbcdao";

    public static Connection getConnected(){
        System.out.println("---------- MySQL JDBC Connection ------------" );
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(username, password, dbUrl);
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found!");
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting.");
        }
        return null;
    }
    public int getId() {
        return 0;
    }
}

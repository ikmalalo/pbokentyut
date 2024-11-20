/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

/**
 *
 * @author ikmal
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.*;


public class DatabaseConnection {
    private static DatabaseConnection instance; // Instance Singleton
    private Connection connection; // Objek Connection
    private final static String DB_HOST = "localhost";
    private final static String DB_NAME = "e-surat";
    private final static String DB_USERNAME = "root";
    private final static String DB_PASSWORD = "";

    // Constructor privat
    private DatabaseConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded!");
        } catch (ClassNotFoundException e) {
            System.out.println("Failed to load driver!");
        }
    }

    // Metode untuk mendapatkan instance
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
            instance.connect(); // Koneksi saat instance dibuat
        }
        return instance;
    }

    // Metode untuk menghubungkan ke database
    public Connection connect() {
        if (connection == null) {
            try {
                String url = "jdbc:mysql://" + DB_HOST + "/" + DB_NAME;
                connection = DriverManager.getConnection(url, DB_USERNAME, DB_PASSWORD);
                System.out.println("Database connected!");
            } catch (SQLException e) {
                System.out.println("Failed to connect database!" + e.getMessage());
            }
        }
        return connection;
    }

    // Metode untuk memutuskan koneksi
    public void disconnect() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Database disconnected!");
                connection = null; // Reset koneksi setelah diputuskan
            } catch (SQLException e) {
                System.out.println("Failed to disconnect database!");
            }
        }
    }

    public Connection getConnection() {
        return connection; // Mengembalikan objek Connection
    }
}
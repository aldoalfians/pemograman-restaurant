/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aldob
 */
public class dbConnection {

    private static final String database = "jdbc:mysql://localhost:3306/restaurantpb";

    private static Connection koneksi;

    public static Connection getkoneksi() {
        if (koneksi == null) {
            try {
                String url = database;
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
            } catch (SQLException t) {
                System.out.println("Error membuat koneksi");
            }
        }
        return koneksi;
    }
}

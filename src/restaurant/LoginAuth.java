/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurant;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author aldob
 */
public class LoginAuth {

    Connection koneksi = new dbConnection().getkoneksi();

    public void userLogin(String username, String password) {
        try {
            String SQL = "select * from users where username='" + username + "' and password='" + password + "' ";
            Statement statement = (Statement) koneksi.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Login Success");
                new OrderScreen().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Username atau Password anda salah");
                new LoginScreen().setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void adminLogin(String username, String password) {
        try {
            String SQL = "select * from admin where username='" + username + "' and password='" + password + "' ";
            Statement statement = (Statement) koneksi.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Login Success");
                new AdminManageUserScreen().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Username atau Password anda salah");
                new LoginScreen().setVisible(true);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

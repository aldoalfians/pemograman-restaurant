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
public class CrudManageUser {

    Connection koneksi = new dbConnection().getkoneksi();

    public void insert(String name, String username, String password, String gender) {
        try {
            String SQL = "INSERT INTO `users`(`name`, `username`, `password`, `gender`) "
                    + "VALUES ('" + name + "','" + username + "', '" + password + "', '" + gender + "')";

            PreparedStatement ps = koneksi.prepareStatement(SQL);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Akun Berhasil Dibuat, Silahkan Login");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Membuat Akun");
        }
    }

    public void update(int user_id, String name,String username, String password, String gender) {
        try {
            String SQL = "update users set name='" + name + "',username='" + username + "', password='" + password + "', gender='" + gender + "' where id=" + user_id + " ";
            PreparedStatement ps = koneksi.prepareStatement(SQL);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Akun berhasil perbarui");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Akun gagal di perbarui");
        }
    }

    public void delete(int user_id) {
        try {
            String SQL = "delete from users where id=" + user_id + "";
            PreparedStatement ps = koneksi.prepareStatement(SQL);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Akun berhasil di delete");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Users> select() {
        ArrayList<Users> result = new ArrayList<>();
        try {

            String SQL = "SELECT * FROM USERS";
            Statement statement = (Statement) koneksi.createStatement();
            ResultSet rs = statement.executeQuery(SQL);

            while (rs.next()) {
                int user_id = rs.getInt(1);
                String name = rs.getString(2);
                String username = rs.getString(3);
                String password = rs.getString(4);
                String gender = rs.getString(5);

                result.add(new Users(user_id, name, username, password, gender));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menampilkan Akun");
        }
        return result;
    }
}

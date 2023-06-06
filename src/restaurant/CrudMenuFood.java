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
public class CrudMenuFood {

    Connection koneksi = new dbConnection().getkoneksi();

    public void insert(String id_kode, String name, String stock, int price, String category) {
        try {
            String SQL = "INSERT INTO `food_menu`(`kode_food`, `name`, `stock`, `price`, `category`) "
                    + "VALUES ('" + id_kode + "','" + name + "','" + stock + "', " + price + ", '" + category + "')";
            PreparedStatement ps = koneksi.prepareStatement(SQL);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Makanan Berhasil Ditambahkan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(String id_kode, String name, String stock, int price, String category) {
        try {
            String SQL = "update food_menu set name='" + name + "',stock='" + stock + "' ,price=" + price + " ,category='" + category + "' where kode_food='" + id_kode + " ' ";
            PreparedStatement ps = koneksi.prepareStatement(SQL);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Menu Makanan berhasil diperbarui");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(String id_kode) {
        try {
            String SQL = "delete from food_menu where kode_food='" + id_kode + "'";

            PreparedStatement ps = koneksi.prepareStatement(SQL);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Menu makanan berhasil di hapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Food> select() {
        ArrayList<Food> result = new ArrayList<>();
        try {

            String SQL = "SELECT * FROM FOOD_MENU";
            Statement statement = (Statement) koneksi.createStatement();
            ResultSet rs = statement.executeQuery(SQL);

            while (rs.next()) {
                String kode_id = rs.getString(1);
                String name = rs.getString(2);
                String stock = rs.getString(3);
                int price = rs.getInt(4);
                String category = rs.getString(5);

                result.add(new Food(kode_id, name, stock, price, category));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menampilkan Menu Makanan");
        }
        return result;
    }

}

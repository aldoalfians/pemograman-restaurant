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
public class CrudOrder {

    Connection koneksi = new dbConnection().getkoneksi();

    public void checkSelect(String username) {
        try {
            String SQL = "select * from users where username='" + username + "'";
            Statement statement = (Statement) koneksi.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Username valid");
            } else {
                JOptionPane.showMessageDialog(null, "Username yang dimasukan salah");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void insert(String id_order, String username, String nama_menu, int jumlah, int harga, String orderStatus) {
        try {
            String SQL = "INSERT INTO `ordermenu`(`id_order`, `username`, `nama_menu`, `jumlah`, `harga`, `status`) "
                    + "VALUES ('" + id_order + "','" + username + "','" + nama_menu + "', " + jumlah + ", " + harga + ", '" + orderStatus + "')";
            PreparedStatement ps = koneksi.prepareStatement(SQL);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pesanan Berhasil Ditambahkan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(String id_order, String orderStatus) {
        try {
            String SQL = "update ordermenu set status='" + orderStatus + "'  where id_order='" + id_order + " ' ";
            PreparedStatement ps = koneksi.prepareStatement(SQL);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pembayaran Berhasil");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(String id_kode) {
        try {
            String SQL = "delete from ordermenu where id_order='" + id_kode + "'";

            PreparedStatement ps = koneksi.prepareStatement(SQL);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Orderan berhasil di hapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Order> select() {
        ArrayList<Order> result = new ArrayList<>();
        try {

            String SQL = "SELECT * FROM ordermenu";
            Statement statement = (Statement) koneksi.createStatement();
            ResultSet rs = statement.executeQuery(SQL);

            while (rs.next()) {
                String id_order = rs.getString(1);
                String username = rs.getString(2);
                String name_menu = rs.getString(3);
                int jumlah = rs.getInt(4);
                int harga = rs.getInt(5);
                String status = rs.getString(6);

                result.add(
                        new Order(id_order, username, name_menu, jumlah, harga, status));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menampilkan Order");
        }
        return result;
    }

    public ArrayList<Order> selectOrderId(String orderId) {
        ArrayList<Order> result = new ArrayList<>();
        try {

            String SQL = "SELECT * FROM ordermenu where id_order='" + orderId + "'";
            Statement statement = (Statement) koneksi.createStatement();
            ResultSet rs = statement.executeQuery(SQL);

            while (rs.next()) {
                String id_order = rs.getString(1);
                String username = rs.getString(2);
                String name_menu = rs.getString(3);
                int jumlah = rs.getInt(4);
                int harga = rs.getInt(5);
                String status = rs.getString(6);

                result.add(
                        new Order(id_order, username, name_menu, jumlah, harga, status));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menampilkan Order");
        }
        return result;
    }

}

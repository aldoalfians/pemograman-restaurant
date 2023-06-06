/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurant;

/**
 *
 * @author aldob
 */
public class Order {

    private String id_order;
    private String username;
    private String name_menu;
    private int jumlah;
    private int harga;
    private String status;

    public Order(String id_order, String username, String name_menu, int jumlah, int harga, String status) {
        this.id_order = id_order;
        this.username = username;
        this.name_menu = name_menu;
        this.jumlah = jumlah;
        this.harga = harga;
        this.status = status;
    }

    public void setId_order(String id_order) {
        this.id_order = id_order;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName_menu(String name_menu) {
        this.name_menu = name_menu;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId_order() {
        return id_order;
    }

    public String getUsername() {
        return username;
    }

    public String getName_menu() {
        return name_menu;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int getHarga() {
        return harga;
    }

    public String getStatus() {
        return status;
    }

   

}

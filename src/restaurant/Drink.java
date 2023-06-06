/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurant;

/**
 *
 * @author aldob
 */
public class Drink {

    private String kode_drink;
    private String name;
    private String stock;
    private int price;
    private String category;

    public Drink(String kode_drink, String name, String stock, int price, String category) {
        this.kode_drink = kode_drink;
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.category = category;
    }

    public void setKode_drink(String kode_drink) {
        this.kode_drink = kode_drink;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getKode_drink() {
        return kode_drink;
    }

    public String getName() {
        return name;
    }

    public String getStock() {
        return stock;
    }

    public int getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

}

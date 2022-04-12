package model;

import java.io.Serializable;

public class Product implements Serializable {
    private int code;
    private String name;
    private String made;
    private int price;
    private String note;

    public Product() {
    }

    public Product(int code, String name, String made, int price, String note) {
        this.code = code;
        this.name = name;
        this.made = made;
        this.price = price;
        this.note = note;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", made='" + made + '\'' +
                ", price=" + price +
                ", note='" + note + '\'' +
                '}';
    }
}

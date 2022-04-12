package model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> pro = new ArrayList<>();
        pro.add(new Product(1,"washing machine","samsung",15000000,"máy giặt cửa trên"));
        pro.add(new Product(2,"television","sony",25000000,"tivi 5k"));
        pro.add(new Product(3,"air conditioning","Casper",9000000,"điều hòa 1 chiều"));
        pro.add(new Product(4,"heater","LG",11000000,"làm nóng nhanh nhất thế giới"));
        pro.add(new Product(5,"telephone","Bphone",35000000,"Đắt nhất thế giới"));
        System.out.println("______________________test doc,viet file");
        String file = "Product.txt";
        saveFile(file,pro);

        List<Product> pro1 = readFile(file);
        for (Product product: pro1) {
            System.out.println(product);
        }
        System.out.println("______________________test add");
        add(file,new Product(6,"ô tô","hàn quốc",1000000000,"KIA"));
        render(file);
        System.out.println("______________________test search");
        System.out.println(search(7,file));

    }
    public static void saveFile(String file, List<Product> products)  {
       try {
           FileOutputStream f1 = new FileOutputStream(file);
           ObjectOutputStream objectOutputStream = new ObjectOutputStream(f1);
           objectOutputStream.writeObject(products);
           objectOutputStream.close();
           f1.close();
       } catch (Exception e) {
           e.printStackTrace();
       }
    }
    public static List<Product> readFile(String file){
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream f1 = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(f1);
            products = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
            f1.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
    public static void add(String file, Product product){
            List<Product> products = readFile(file);
            products.add(product);
            saveFile(file,products);
    }
    public static void render(String file){
        List<Product> products = readFile(file);
        for (Product product : products) {
            System.out.println(product);
        }
    }
    public static Product search(int code, String file){
        List<Product> products = readFile(file);
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getCode()==code){
                return products.get(i);
            }
        }
        return null;
    }
}

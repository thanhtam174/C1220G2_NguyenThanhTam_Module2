package _16_io_binary_file.exercises;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String nameProduct;
    private double productPrice;

    public Product() {

    }

    public Product(int id, String nameProduct, double productPrice) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.productPrice = productPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }


}

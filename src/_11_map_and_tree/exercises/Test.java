package _11_map_and_tree.exercises;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();

        Product product1 = new Product(1, "Milk", 30000);
        Product product2 = new Product(1, "Meat", 130000);
        Product product3 = new Product(2, "Orange", 5000);
        Product product4 = new Product(3, "Apple", 7000);

        productManager.addProduct(product1);
        productManager.addProduct(product2);
        productManager.addProduct(product3);
        productManager.addProduct(product4);

//        System.out.println("-----Them moi san pham----");
//        productManager.addProduct();
//
//        productManager.delete(3);
//
//        System.out.println("-----Sua thong tin san pham co id = 1 -----");
//        productManager.replace(1);
//
//        System.out.println("Tim kiem san pham");
//        System.out.print("Nhap ten san pham can tim kiem: ");
//        String nameProduct = scanner.nextLine();
//        productManager.search(nameProduct);
//        System.out.println();

        System.out.println("Danh sach truoc khi sap xep");
        productManager.display();
        productManager.sortProductPrice();
        System.out.println();
        System.out.println("Danh sach sau khi sap xep theo gia san pham");
        productManager.display();
    }
}

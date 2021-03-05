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

        int choose;
        do {
            System.out.println("----------MENU-----------");
            System.out.println("1. Them moi san pham");
            System.out.println("2. Sua thong tin san pham");
            System.out.println("3. Xoa san pham");
            System.out.println("4. Tim kiem san pham");
            System.out.println("5. Hien thi danh sach san pham");
            System.out.println("0. Thoat");
            System.out.print("Enter number: ");
            choose = scanner.nextInt();
            int id;
            switch (choose) {
                case 1:
                    productManager.addProduct();
                    break;
                case 2:
                    System.out.print("Nhap id san pham can sua: ");
                    id = scanner.nextInt();
                    productManager.replace(id);
                    break;

                case 3:
                    System.out.print("Nhap id san pham can xoa: ");
                    id = scanner.nextInt();
                    productManager.delete(id);
                    break;
                case 4:
                    System.out.print("Nhap ten san pham can tim: ");
                    String nameProduct = scanner.next();
                    productManager.search(nameProduct);
                    break;
                case 5:
                    productManager.sortProductPrice();
                    productManager.display();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Vui long chon cac lua chon trong menu");
            }
        } while (choose != 0);
    }
}

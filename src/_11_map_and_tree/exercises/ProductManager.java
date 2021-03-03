package _11_map_and_tree.exercises;

import java.util.*;

public class ProductManager {
    List<Product> products = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addProduct() {
        System.out.print("Nhap id: ");
        Integer id = Integer.valueOf(scanner.nextLine());
        System.out.print("Nhap ten san pham: ");
        String nameProduct = scanner.nextLine();
        System.out.print("Nhap gia san pham: ");
        Double productPrice = Double.valueOf(scanner.nextLine());
        Product newProduct = new Product(id, nameProduct, productPrice);
        products.add(newProduct);
    }

    public void replace(int id) {
        for (Product product : products) {
            if (id == product.getId()) {
                System.out.println("Thong tin san pham: " + product);
                int choose;
                do {
                    System.out.println("1. ID.");
                    System.out.println("2. Ten san pham.");
                    System.out.println("3. Gia san Pham.");
                    System.out.println("4. Done");
                    System.out.println("Chon thong tin can sua:");
                    choose = scanner.nextInt();
                    switch (choose) {
                        case 1:
                            System.out.print("Nhap id moi: ");
                            int newId = scanner.nextInt();
                            product.setId(newId);
                            break;
                        case 2:
                            System.out.print("Nhap ten san pham moi: ");
                            String newNameProduct = scanner.next();
                            product.setNameProduct(newNameProduct);
                            break;
                        case 3:
                            System.out.print("Nhap gia san pham moi: ");
                            double newProductPrice = scanner.nextDouble();
                            product.setProductPrice(newProductPrice);
                            System.out.println(product);
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Vui long chon dung cac lua chon co trong menu");
                    }
                } while (choose != 4);
                System.out.println("Thong tin sau khi sua doi: " + product);
                System.out.println();
            }
        }
    }

    public void display() {
        System.out.println(products);
    }

    public void delete(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                products.remove(i);
                System.out.println("Xoa thanh cong!");
            }
        }
    }

    public void search(String nameProduct) {
        String tempString = nameProduct.toLowerCase();
        boolean isNotProduct = true;
        for (Product product : products) {
            if (nameProduct.equals(product.getNameProduct().toLowerCase())) {
                System.out.println(product);
                isNotProduct = false;
            }
        }
        if (isNotProduct) {
            System.out.println("Khong co san pham nay trong danh sach");
        }
    }

    public void sortProductPrice() {
        ProductPriceComparator productPriceComparator = new ProductPriceComparator();
        Collections.sort(products, productPriceComparator);
    }
}

package review_oop.oop_java_1.exercise_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {

    public static void display(List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> vehicleList = new ArrayList<>();
        int choose;
        do {
            System.out.println("-----------MENU-----------");
            System.out.println("1. Tạo các đối tượng xe và nhập thông tin");
            System.out.println("2. Xuất bảng kê khai tiền thuế của các xe.");
            System.out.println("0. Thoát");
            System.out.print("Chon chuc nang: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    Vehicle newVehicle = new Vehicle();
                    vehicleList.add(newVehicle);
                    break;
                case 2:
                    display(vehicleList);
                default:
                    System.out.println("Vui long chon cac lua chon trong MENU");
            }
        } while (choose != 0);
    }
}

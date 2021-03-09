package review_oop.oop_java_1.exercise_1;

import java.util.Scanner;

public class Vehicle {
    private final double BELOW_100CC = 0.01;
    private final double BETWEEN_100CC_AND_200CC = 0.03;
    private final double OVER_200CC = 0.05;
    private String vehicleOwner;
    private int vehiclePrices;
    private double cylinderCapacity;

    public Vehicle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten chu so huu phuong tien: ");
        vehicleOwner = scanner.nextLine();
        do {
            System.out.print("Nhap tri gia phuong tien: ");
            vehiclePrices = scanner.nextInt();
        } while (vehiclePrices < 0);
        do {
            System.out.print("Nhap dung tich xylanh: ");
            cylinderCapacity = scanner.nextDouble();
        } while (cylinderCapacity < 0);

    }

    public Vehicle(String vehicleOwner, int vehiclePrices, double cylinderCapacity) {
        this.vehicleOwner = vehicleOwner;
        this.vehiclePrices = vehiclePrices;
        this.cylinderCapacity = cylinderCapacity;
    }

    public String getVehicleOwner() {
        return vehicleOwner;
    }

    public void setVehicleOwner(String vehicleOwner) {
        this.vehicleOwner = vehicleOwner;
    }

    public int getVehiclePrices() {
        return vehiclePrices;
    }

    public void setVehiclePrices(int vehiclePrices) {
        this.vehiclePrices = vehiclePrices;
    }

    public double getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(double cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleOwner='" + vehicleOwner + '\'' +
                ", vehiclePrices=" + vehiclePrices +
                ", cylinderCapacity=" + cylinderCapacity +
                ", tax=" + getTax() +
                '}';
    }

    public double getTax() {
        boolean below100cc = cylinderCapacity < 100;
        boolean over200cc = cylinderCapacity > 200;
        if (below100cc) {
            return vehiclePrices * BELOW_100CC;
        } else if (over200cc) {
            return vehiclePrices * OVER_200CC;
        } else {
            return vehiclePrices * BETWEEN_100CC_AND_200CC;
        }
    }
}

package review_oop.oop_java_2.exercise_1;

import java.util.Objects;
import java.util.Scanner;

public class Officers implements Comparable {
    private String name;
    private int yearOfBirth;
    private String sex;
    private String address;

    public Officers(String name, int yearOfBirth, String sex, String address) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.sex = sex;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Officers{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public void modify() {
        int choose;
        do {
            System.out.println("1. Name");
            System.out.println("2. Year of birth");
            System.out.println("3. Sex");
            System.out.println("4. Address");
            System.out.println("0. Done");
            System.out.println("Choose the information to be repaired");
            Scanner scanner = new Scanner(System.in);
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.print("Enter new name: ");
                    String name = scanner.nextLine();
                    this.setName(name);
                    break;
                case 2:
                    System.out.print("Enter new year of birth: ");
                    int year = scanner.nextInt();
                    this.setYearOfBirth(year);
                    break;
                case 3:
                    System.out.print("Enter new sex: ");
                    String sex = scanner.nextLine();
                    this.setSex(sex);
                    break;
                case 4:
                    System.out.println("Enter new address");
                    String address = scanner.nextLine();
                    this.setAddress(address);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Choose the correct menu options");
            }
        } while (choose != 0);
    }

    @Override
    public int compareTo(Object o) {
        return this.name.compareTo(((Officers) o).getName());
    }
}

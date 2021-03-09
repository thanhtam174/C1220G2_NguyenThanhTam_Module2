package review_oop.oop_java_2.exercise_1;

import java.util.Scanner;

public class Worker extends Officers {
    private String level;


    public Worker(String name, int yearOfBirth, String sex, String address, String level) {
        super(name, yearOfBirth, sex, address);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + super.getName() + '\'' +
                ", yearOfBirth=" + super.getYearOfBirth() +
                ", sex='" + super.getSex() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                "level=" + level +
                '}';
    }

    @Override
    public void modify() {
        int choose;
        do {
            System.out.println("1. Name");
            System.out.println("2. Year of birth");
            System.out.println("3. Sex");
            System.out.println("4. Address");
            System.out.println("5. Work");
            System.out.println("0. Done");
            System.out.println("Choose the information to be repaired");
            Scanner scanner = new Scanner(System.in);
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.print("Enter new name: ");
                    String name = scanner.nextLine();
                    super.setName(name);
                    break;
                case 2:
                    System.out.print("Enter new year of birth: ");
                    int year = scanner.nextInt();
                    super.setYearOfBirth(year);
                    break;
                case 3:
                    System.out.print("Enter new sex: ");
                    String sex = scanner.nextLine();
                    super.setSex(sex);
                    break;
                case 4:
                    System.out.print("Enter new address: ");
                    String address = scanner.nextLine();
                    super.setAddress(address);
                    break;
                case 5:
                    System.out.print("Enter new work: ");
                    String level = scanner.nextLine();
                    this.setLevel(level);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Choose the correct menu options");
            }
        } while (choose != 0);
    }
}

package review_oop.oop_java_2.exercise_1;

import java.util.Scanner;

public class Staff extends Officers {
    private String work;

    public Staff(String name, int yearOfBirth, String sex, String address, String work) {
        super(name, yearOfBirth, sex, address);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + super.getName() + '\'' +
                ", yearOfBirth=" + super.getYearOfBirth() +
                ", sex='" + super.getSex() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                "work='" + work + '\'' +
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
                    String work = scanner.nextLine();
                    this.setWork(work);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Choose the correct menu options");
            }
        } while (choose != 0);
    }
}

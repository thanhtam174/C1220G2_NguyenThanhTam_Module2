package review_oop.oop_java_2.exercise_1;

import java.util.Scanner;

public class Engineer extends Officers {
    private String trainingIndustry;

    public Engineer(String name, int yearOfBirth, String sex, String address, String trainingIndustry) {
        super(name, yearOfBirth, sex, address);
        this.trainingIndustry = trainingIndustry;
    }

    public String getTrainingIndustry() {
        return trainingIndustry;
    }

    public void setTrainingIndustry(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "name='" + super.getName() + '\'' +
                ", yearOfBirth=" + super.getYearOfBirth() +
                ", sex='" + super.getSex() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                "trainingIndustry='" + trainingIndustry + '\'' +
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
            System.out.println("5. Training industry");
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
                    int year = Integer.parseInt(scanner.nextLine());
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
                    String trainingIndustry = scanner.nextLine();
                    this.setTrainingIndustry(trainingIndustry);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Choose the correct menu options");
            }
        } while (choose != 0);
    }
}

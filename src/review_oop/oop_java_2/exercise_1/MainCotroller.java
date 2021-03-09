package review_oop.oop_java_2.exercise_1;

import java.util.Scanner;

public class MainCotroller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OfficersManager officersManager = new OfficersManager();
        Officers officer_1 = new Staff("Anh Nguyen", 1995, "Male", "Da Nang", "Waiter");
        Officers officer_2 = new Worker("Binh Nguyen", 1975, "Female", "Da Nang", "3/7");
        Officers officer_3 = new Staff("Hoang Tran", 1980, "Male", "Da Nang", "Waiter");
        Officers officer_4 = new Engineer("Oanh Le", 1984, "Female", "Da Nang", "IT");
        Officers officer_5 = new Worker("Diep Tran", 1985, "Female", "Da Nang", "6/7");
        Officers officer_6 = new Worker("Cong Hoang", 1990, "Male", "Da Nang", "4/7");
        officersManager.addOfficer(officer_1);
        officersManager.addOfficer(officer_2);
        officersManager.addOfficer(officer_3);
        officersManager.addOfficer(officer_4);
        officersManager.addOfficer(officer_5);
        officersManager.addOfficer(officer_6);
        int choose;
        do {
            System.out.println("1. Edit office information");
            System.out.println("2. Search office information");
            System.out.println("3. Display information");
            System.out.println("0. Exit");
            System.out.println("Select the function in the menu");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.print("Enter the name of the officer needing to edit the information: ");
                    String nameModify = scanner.nextLine();
                    officersManager.modify(nameModify);
                    break;
                case 2:
                    System.out.print("Enter the name of the officer needing to search: ");
                    String nameSearch = scanner.nextLine();
                    officersManager.search(nameSearch);
                    break;
                case 3:
                    officersManager.sort();
                    officersManager.display();
                case 0:
                    break;
                default:
                    System.out.println("Choose the correct menu options");
            }
        } while (choose != 0);
    }
}

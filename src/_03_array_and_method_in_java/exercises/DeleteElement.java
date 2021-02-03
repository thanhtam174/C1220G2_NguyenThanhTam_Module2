package _03_array_and_method_in_java.exercises;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number[] = new int[8];
        int a;
        for (int i = 0; i < number.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            number[i] = scanner.nextInt();
        }
        System.out.print("Enter element to be deleted: ");
        a = scanner.nextInt();
        boolean check = true;
        for (int i = 0; i < number.length; i++) {
            if (number[i] == a) {
                for (int j = i; j < number.length - 1; j++) {
                    number[j] = number[j + 1];
                    number[j + 1] = 0;
                    check = false;
                }
            }
        }
        if (check) {
            System.out.println("element not in array");
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }
}

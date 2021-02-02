package _02_loop_in_java.exercises;

import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextByte();
            switch (choice) {
                case 1:
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 7; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("bottom-left");
                    for (int i = 1; i <= 6; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    System.out.println("top-left");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    System.out.println("bottom-right");
                    for (int k = 1; k <= 5; k++) {
                        for (int j = 1; j <= 5 - k; j++) {
                            System.out.print(" ");
                        }
                        for (int i = 1; i <= k; i++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    System.out.println("top-right");
                    for (int k = 5; k >= 1; k--) {
                        for (int j = 1; j <= 5 - k; j++) {
                            System.out.print(" ");
                        }
                        for (int i = 1; i <= k; i++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 1; j <= 9; j++) {
                            if ((j <= 5 + i) && (j >= 5 - i)) {
                                System.out.print("*");
                                continue;
                            }
                            System.out.print(" ");
                        }
                        System.out.println("");
                    }

            }
        } while (choice != 0);
    }
}

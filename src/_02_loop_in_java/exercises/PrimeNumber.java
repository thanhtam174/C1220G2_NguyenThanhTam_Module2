package _02_loop_in_java.exercises;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int count = 0;
        int n = 2;
        boolean check;
        System.out.println("Enter number:");
        number = scanner.nextInt();
        while (count != number) {
            check = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }
    }

}

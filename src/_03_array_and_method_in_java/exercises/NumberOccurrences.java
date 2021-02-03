package _03_array_and_method_in_java.exercises;

import java.util.Scanner;

public class NumberOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "nguyen van thanh";
        String a;
        do {
            System.out.print("Enter characters: ");
            a = scanner.nextLine();
        } while (a.length() != 1);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a.charAt(0)) {
                count++;
            }
        }
        System.out.println("Number occurrences of character " + a + " is: " + count);
    }
}

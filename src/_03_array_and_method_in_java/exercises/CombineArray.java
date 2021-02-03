package _03_array_and_method_in_java.exercises;

import java.util.Scanner;

public class CombineArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers1[] = new int[5];
        int numbers2[] = new int[5];
        int numbers3[] = new int[numbers1.length + numbers2.length];
        System.out.println("Enter array number1:");
        for (int i = 0; i < numbers1.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers1[i] = scanner.nextInt();
        }
        System.out.println("Enter array number2:");
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers2[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers1.length; i++) {
            numbers3[i] = numbers1[i];
        }
        for (int i = 0; i < numbers2.length; i++) {
            numbers3[i + numbers1.length] = numbers2[i];
        }
        System.out.print("Combine Array: ");
        for (int i = 0; i < numbers3.length; i++) {
            System.out.print(numbers3[i] + " ");
        }
    }
}

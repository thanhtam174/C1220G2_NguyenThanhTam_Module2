package _03_array_and_method_in_java.exercises;

import java.util.Scanner;

public class SumOfCollumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, collumn;
        System.out.print("Enter number of row: ");
        row = scanner.nextInt();
        System.out.print("Enter number of collumn: ");
        collumn = scanner.nextInt();
        float matrix[][] = new float[row][collumn];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < collumn; j++) {
                System.out.print("Enter element" + "[ " + i + " ][ " + j + " ] " + ": ");
                matrix[i][j] = scanner.nextFloat();
            }
        }
        float sum = 0;
        System.out.print("Enter the column to be summed: ");
        int col = scanner.nextInt();
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][col];
        }
        System.out.println("Sum of collumn " + col + " is: " + sum);
    }
}

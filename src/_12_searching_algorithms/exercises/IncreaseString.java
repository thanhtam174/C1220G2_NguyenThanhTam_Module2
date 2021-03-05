package _12_searching_algorithms.exercises;

import java.util.Scanner;

public class IncreaseString {
    public static String maxIncreaseString(String string){
        String str[] = string.split("");
        String temp = str[0];
        String result = str[0];
        for (int i = 1; i<str.length;i++){
            if (str[i].compareTo(temp) > 0){
                result = result + str[i];
                temp = str[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        System.out.println(maxIncreaseString(string));
    }
}

package _01_introduction_java.exercies;

import java.util.Scanner;

public class ReadNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int hundreds = 0, tens = 0, ones = 0;
        String readOnes = "", readTens = "", readHundreds = "";
        System.out.println("Enter a number:");
        number = scanner.nextInt();
        if (number < 0 || number > 999) {
            readOnes = "out of ability";
        } else if (number == 0) {
            readOnes = "Zero";
        } else if (number < 20) {
            ones = number;
        } else {
            ones = number % 10;
            number = number / 10;
            tens = number % 10;
            hundreds = number / 10;
        }
        switch (ones) {
            case 1:
                readOnes = "One";
                break;
            case 2:
                readOnes = "Two";
                break;
            case 3:
                readOnes = "Three";
                break;
            case 4:
                readOnes = "Four";
                break;
            case 5:
                readOnes = "Five";
                break;
            case 6:
                readOnes = "Six";
                break;
            case 7:
                readOnes = "Seven";
                break;
            case 8:
                readOnes = "Eight";
                break;
            case 9:
                readOnes = "Nine";
                break;
            case 10:
                readOnes = "Ten";
                break;
            case 11:
                readOnes = "Eleven";
                break;
            case 12:
                readOnes = "Twelve";
                break;
            case 13:
                readOnes = "Thirteen";
                break;
            case 14:
                readOnes = "Fourteen";
                break;
            case 15:
                readOnes = "Fifteen";
                break;
            case 16:
                readOnes = "Sixteen";
                break;
            case 17:
                readOnes = "Seventeen";
                break;
            case 18:
                readOnes = "Eighteen";
                break;
            case 19:
                readOnes = "Nineteen";
                break;
        }
        switch (tens) {
            case 2:
                readTens = "Twenty ";
                break;
            case 3:
                readTens = "Thirty ";
                break;
            case 4:
                readTens = "Fourty ";
                break;
            case 5:
                readTens = "Fifty ";
                break;
            case 6:
                readTens = "Sixty ";
                break;
            case 7:
                readTens = "Seventy ";
                break;
            case 8:
                readTens = "Eighty ";
                break;
            case 9:
                readTens = "Ninety ";
                break;
        }
        switch (hundreds) {
            case 1:
                readHundreds = "One hundred and ";
                break;
            case 2:
                readHundreds = "Two hundred and ";
                break;
            case 3:
                readHundreds = "Three hundred and ";
                break;
            case 4:
                readHundreds = "Four hundred and ";
                break;
            case 5:
                readHundreds = "Five hundred and ";
                break;
            case 6:
                readHundreds = "Six hundred and ";
                break;
            case 7:
                readHundreds = "Seven hundred and ";
                break;
            case 8:
                readHundreds = "Eight hundred and ";
                break;
            case 9:
                readHundreds = "Nine hundred and ";
                break;
        }
        System.out.print(readHundreds + readTens + readOnes);
    }
}

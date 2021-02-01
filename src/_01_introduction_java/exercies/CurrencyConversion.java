package _01_introduction_java.exercies;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float usd,vnd;
        int rate;
        System.out.println("Enter the amount to convert (USD)");
        usd=scanner.nextFloat();
        System.out.println("Enter exchange rate");
        rate=scanner.nextInt();
        vnd=usd*rate;
        System.out.println("VND: "+vnd);
    }
}

package _01_introduction_java.practices;
import java.util.Scanner;
public class S_Rect {
    public static void main(String[] args) {
        float weight;
        float height;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap chieu dai");
        weight=scanner.nextFloat();
        System.out.println("Nhap chieu rong");
        height=scanner.nextFloat();
        float area=weight*height;
        System.out.println("Area is: "+area);
    }
}

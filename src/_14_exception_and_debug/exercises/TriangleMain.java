package _14_exception_and_debug.exercises;

import java.util.Scanner;

public class TriangleMain {
    static void varidate(double a, double b, double c) throws IllegalTriangleException {
        if ((a <= 0) || (b <= 0) || (c <= 0)) {
            throw new IllegalTriangleException("Du lieu nhap vao co so am hoac so 0");
        } else if ((a + b < c) || (a + c < b) || (c + b) < a) {
            throw new IllegalTriangleException("Du lieu nhap vao khong phai la 3 canh tam giac");
        } else {
            System.out.println("OK!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a, b, c;
        while (true) {
            System.out.println("Nhap 3 canh cua tam giac: ");
            try {
                System.out.print("Canh thu nhat: ");
                a = scanner.nextLine();
                System.out.print("Canh thu hai: ");
                b = scanner.nextLine();
                System.out.print("Canh thu ba: ");
                c = scanner.nextLine();
                varidate(Double.parseDouble(a), Double.parseDouble(b), Double.parseDouble(c));
                break;
            } catch (IllegalTriangleException m) {
                System.out.println(m.getMessage());
            }
        }
    }
}

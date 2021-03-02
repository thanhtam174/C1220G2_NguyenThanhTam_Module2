package _10_dsa_stack_queue.exercises.optional.exercises;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecToBin {
    public static String convert(int decimal) {
        int temp = decimal;
        String binary = null;
        Stack<Integer> convertStack = new Stack<Integer>();

        do {
            convertStack.push(temp % 2);
            temp /= 2;
        } while (temp != 0);
        String bin[] = new String[convertStack.size()];
        int i = 0;
        while (!convertStack.isEmpty()) {
            bin[i] = String.valueOf(convertStack.pop());
            i++;
        }
        return binary = binary.join("", bin);
    }

    public static void main(String[] args) {
        int decimal;
        String binary = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so thap phan can chuyen doi: ");
        decimal = scanner.nextInt();

        System.out.println(decimal + " = (" + convert(decimal) + ")B");
    }
}

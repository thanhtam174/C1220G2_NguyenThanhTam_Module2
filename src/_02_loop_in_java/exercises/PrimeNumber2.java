package _02_loop_in_java.exercises;

public class PrimeNumber2 {
    public static void main(String[] args) {
        boolean check;
        for (int i = 2; i <= 100; i++) {
            check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(i + " ");
            }
        }
    }

}

package _10_dsa_stack_queue.exercises.optional.exercises;

import java.util.Stack;

public class CheckBracket {
    public static boolean checkBracket(String expression) {
        String tempExp[] = expression.split("");
        Stack<String> bStack = new Stack<String>();
        for (int i = 0; i < tempExp.length; i++) {
            if (tempExp[i].equals("(")) {
                bStack.push(tempExp[i]);
            }
            if (tempExp[i].equals(")")) {
                if (bStack.isEmpty()) {
                    return false;
                } else {
                    bStack.pop();
                }
            }
        }
        if (bStack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        String exp = "s * (s – a) * (s – b) * (s – c)";
        System.out.println(checkBracket(exp));
        String exp2 = "s * (s – a) * (s – b * (s – c)";
        System.out.println(checkBracket(exp2));
    }
}

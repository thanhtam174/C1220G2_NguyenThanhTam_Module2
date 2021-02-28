package _10_dsa_stack_queue.exercises.exercise_1;

import java.util.Stack;

public class ReverseStringByStack {
    public static void display(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        String mWord = "abcdefgh";
        int index = 0;
        Stack<String> wStack = new Stack<String>();
        System.out.println("Array before is reversed:");
        System.out.println(mWord);
        System.out.println();
        String string[] = mWord.split("");
        for (int i = 0; i < string.length; i++) {
            wStack.push(string[i]);
        }
        while (!wStack.isEmpty()) {
            string[index] = wStack.pop();
            index++;
        }
        mWord = mWord.join("", string);
        System.out.println("Array after is reversed:");
        System.out.println(mWord);
    }
}

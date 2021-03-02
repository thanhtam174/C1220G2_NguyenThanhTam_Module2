package _10_dsa_stack_queue.exercises.optional.exercises;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CheckPalindrome {
    public static boolean isPalindrome(String str) {
        String tempString = str.toLowerCase();
        String string[] = tempString.split("");
        Stack<String> stringStack = new Stack<String>();
        Queue<String> stringQueue = new LinkedList<String>();
        for (int i = 0; i < string.length; i++) {
            stringStack.push(string[i]);
            stringQueue.add(string[i]);
        }
        for (int i = 0; i < string.length; i++) {
            boolean check = !(stringQueue.remove().equals(stringStack.pop()));
            if (check) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "Able was I ere I saw Elba";
        if (isPalindrome(str)) {
            System.out.println("\"" + str + '\"' + " is Palindrome");
        } else {
            System.out.println("\"" + str + '\"' + " is not Palindrome");
        }
    }
}

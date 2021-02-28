package _10_dsa_stack_queue.exercises.exercise_1;

import java.util.Stack;

public class ReverseIntegerByStack {
    public static void display(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int number[]={1,5,9,7,5,4};
        Stack<Number> numberStack=new Stack<Number>();
        System.out.println("Array before is reversed:");
        display(number);
        System.out.println();
        for (int i=0;i<number.length;i++){
            numberStack.push(number[i]);
        }
        for (int i=0;i<number.length;i++){
            number[i]= (int) numberStack.pop();
        }
        System.out.println("Array after is reversed:");
        display(number);
    }
}

package _13_sorting_algorithms.exercices;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void insertionSort(int[] list){
        for (int i = 1; i < list.length; i++){
            int currentElement = list[i];
            int k;
            for(k = i - 1; k >=0 && list[k] > currentElement; k--){
                list[k+1] = list[k];
            }
            list[k+1] = currentElement;
            System.out.println("Insert " + currentElement + " at index = " + (k+1));
            System.out.print("List after the " + i +"' sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            System.out.print("value " + (i+1) + ": ");
            list[i] = scanner.nextInt();
        }
        insertionSort(list);
    }
}

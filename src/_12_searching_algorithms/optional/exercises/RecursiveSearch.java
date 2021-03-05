package _12_searching_algorithms.optional.exercises;

import java.util.Scanner;

public class RecursiveSearch {
    public static int recursiveSearch(int x, int[] arr) {
        return recursiveSearch(x, arr, 0, arr.length - 1);
    }

    public static int recursiveSearch(int x, int[] arr, int left, int right) {
        int mid = (left + right) / 2;
        if (left > right) {
            return -1;
        } else if (x == arr[mid]) {
            return mid;
        } else if (x > arr[mid]) {
            return recursiveSearch(x, arr, mid + 1, right);
        } else if (x < arr[mid]) {
            return recursiveSearch(x, arr, left, mid - 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = {1, 3, 5, 7, 9, 11, 15};
        System.out.println("Nhap so nguyen can tim kiem: ");
        int x = scanner.nextInt();
        int index = recursiveSearch(x, arr);
        boolean isNotInArray = index == -1;
        if (isNotInArray) {
            System.out.println("Khong co phan tu nay trong mang");
        } else {
            System.out.println("Vi tri: " + index);
        }
    }
}

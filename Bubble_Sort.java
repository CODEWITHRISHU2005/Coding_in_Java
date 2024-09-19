package com.DSA;

public class Bubble_Sort {
    public static void main(String[] args) {
        // Time Complexity = 0(n^2):
        int arr[] = {7, 8, 3, 1, 2};
        int size = arr.length;
        System.out.println("Before Sorting...");
        for (int element : arr)
            System.out.print(element + " ");
        System.out.println();

        // Bubble_Sort:
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    // |1| |2| | |
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            for (int element : arr)
                System.out.print(element + " ");
            System.out.println();
        }
        System.out.println("After Sorting...");
        for (int element : arr)
            System.out.print(element + " ");
    }
}

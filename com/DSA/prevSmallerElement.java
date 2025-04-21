package com.DSA;

import java.util.Stack;

public class prevSmallerElement {
    public static void main(String[] args) {
        // TC : O(n)
        // SC : O(n)
        Stack<Integer> s = new Stack<>();
        int arr[] = {6, 8, 0, 1, 3};
        int n = arr.length;
        int ans[] = new int[n]; // Array to store next greater elements

        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && s.peek() >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ans[i] = -1;
            }else {
                ans[i] = s.peek();
            }
            s.push(arr[i]);
        }
        System.out.println("Dispalying the array elements: ");
        for (int val : ans) {
            System.out.print(val + " ");
        }
    }
}

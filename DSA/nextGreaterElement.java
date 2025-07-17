import java.util.Stack;

public class nextGreaterElement {

    public static void main(String[] args) {
        // TC : O(n)
        // SC : O(n)
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        int ans[] = new int[n]; // Array to store next greater elements

        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() <= arr[i]) {
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

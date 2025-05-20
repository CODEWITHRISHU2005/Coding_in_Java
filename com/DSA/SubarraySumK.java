
import java.util.HashMap;

public class SubarraySumK {

    public static void main(String[] args) {
        int[] arr = {10, 2, -2, -20, 10};
        int k = -10, n = arr.length, ans = 0, sum = 0;

        // Create a HashMap to store the cumulative sum and its frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        // Initialize the map with a cumulative sum of 0 and frequency of 1
        map.put(0, 1);

        // Iterate through the array
        for (int j = 0; j < n; j++) {
            // Calculate the cumulative sum
            sum += arr[j];

            if (map.containsKey(sum - k)) {
                // If the cumulative sum minus k exists in the map, add its frequency to the answer
                ans += map.get(sum - k);
            }

            if (map.containsKey(sum)) {
                // If the cumulative sum already exists in the map, increment its frequency
                map.put(sum, map.get(sum) + 1);
            } else {
                // Otherwise, add the cumulative sum to the map with a frequency of 1
                map.put(sum, 1);
            }
        }

        // Print the total number of subarrays with sum equal to k
        System.out.println("Total number of subarrays with sum equal to " + k + ": " + ans);
        
        // Print the contents of the map
        System.out.println("Map contents: " + map);
    }
}

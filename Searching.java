//Time Complexity for Binary Search -> 0(log n).
//Time Complexity for Linear Search -> 0(n).
public class Searching {
    public static void main(String[] args) {
        int nums[] = {5, 7, 9, 11, 13};
        int target = 11;
        //int result = linearSearch(nums, target);
        int result = binarySearch(nums, target, 0, nums.length - 1);
        if (result != -1)
            System.out.println("Element found at Index : " + result);
        else System.out.println("Element not found");
    }

    public static int linearSearch(int[] nums, int target) {
        //TS -> 0(N)
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int target, int left, int right) {
        //TS => 0(logn) and SC => 0(1)
        //int left = 0;
        //int right = nums.length - 1;
        if (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                return binarySearch(nums, target, mid + 1, right);
            else
                return binarySearch(nums, target, left, mid - 1);
        }
 /*       while(left <= right) {
            int mid = (left + right) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;*/
    }
}

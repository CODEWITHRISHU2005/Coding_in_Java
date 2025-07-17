import java.util.Arrays;

public class AggresiveCows {

    public static void main(String[] args) {
        int[] stalls = {1, 2, 8, 4, 9};
        int N = stalls.length, C = 3;

        System.out.println("The maximum minimum distance between cows is: " + aggressiveCows(stalls, N, C));
    }

    private static String aggressiveCows(int[] arr, int N, int C) {
        Arrays.sort(arr); // 0(NlogN)
        int st = 1, end = arr[N - 1] - arr[0], ans = -1;

        while (st <= end) { // 0(log(Range) * N)
            int mid = (st + end) / 2;

            if (isPossible(arr, mid, N, C)) { // R
                ans = mid;
                st = mid + 1;
            } else { // L
                end = mid - 1;
            }
        }

        return String.valueOf(ans);
    }

    private static boolean isPossible(int[] stalls, int minAllowedCows, int N, int C) { // 0(N)
        int cows = 1, lastStallPosition = stalls[0];

        for (int i = 1; i < N; i++) {
            if (stalls[i] - lastStallPosition >= minAllowedCows) {
                cows++;
                lastStallPosition = stalls[i];
            }
            if (cows == C) {
                return true;
            }
        }

        return false;
    }
}

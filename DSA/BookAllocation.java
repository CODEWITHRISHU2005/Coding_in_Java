public class BookAllocation {

    private static boolean isPossible(int[] books, int maxAllowedPages, int m, int n) {
        int students = 1, pages = 0;

        for (int i = 0; i < n; i++) {
            if (books[i] > maxAllowedPages) {
                return false; // A single book cannot be allocated to a student if it exceeds the max allowed pages
            }

            if (pages + books[i] <= maxAllowedPages) {
                pages += books[i];
            } else {
                students++;
                pages = books[i];
            }
        }

        return students > m;
    }
    private static int allocateBooks(int[] books, int n, int m) { // 0(log(N) * n)
        if (n < m) {
            return -1; // Not enough books for students
        }

        int st = 0, end = 0, ans = 0;

        for (int i = 0; i < n; i++) {
            end += books[i]; // Total number of pages
        }

        while (st <= end) {
            int mid = (st + end) / 2;

            if (isPossible(books, mid, m, n)) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] books = {15, 17, 20};
        int n = books.length, m = 2;

        System.out.println("The minimum number of max pages that can be allocated to a student is: " + allocateBooks(books, n, m));

    }

}

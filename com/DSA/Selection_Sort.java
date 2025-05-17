
public class Selection_Sort {

    public static void main(String[] args) {
        //Time Complexity_0(n^2)
        int arr[] = {7, 8, 1, 3, 2};
        int size = arr.length;
        System.out.println("Before Sorting...");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

        //Selection_Sort:
        for (int i = 0; i < size - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            //Swapping:
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

            for (int element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("After Sorting...");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}

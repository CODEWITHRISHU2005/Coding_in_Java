/*
=> Time Complexity :-
-> Worst Case_0(n^2)
-> Avg Case_0(nlogn)
=> Worst Case occurs when pivot is always smallest or largest element.
*/
public class Quick_Sort {
    private static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for(int j=low; j<high; j++) {
            if(arr[j]<pivot) {
                i++;
                //Swap
                int temp = arr[high];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1; // pivot index
    }
    public static void quickSort(int arr[], int low, int high) {
        if(low<high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
            }
        }
    public static void main(String[] args) {
        int arr[] = {6, 1, 9, 5, 3, 8};
        int size = arr.length;
        quickSort(arr, 0, size-1);
        for(int element : arr) 
        System.out.print(element+ " ");
    }
}
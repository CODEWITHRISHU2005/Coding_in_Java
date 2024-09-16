public class Merge_Sort {
    private static void mergeSort(int []arr, int l, int r) {
        if(l<r) {
            int mid = (l+r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
    }
    private static void merge(int []arr, int l, int mid, int r) {
        int size1 = mid-l+1;
        int size2 = r-mid;
        int larr[] = new int [size1];
        int rarr[] = new int [size2];
        for(int x=0; x<size1; x++) {
            larr[x] = arr[l+x];
        }
        for(int y=0; y<size2; y++) {
            larr[y] = arr[mid+1+y];
        }
        int i = 0;
        int j = 0;
        int k = l;
        while(i<size1 && j<size2) {
            if(larr[i]<=rarr[j]) {
                arr[k] = larr[i];
                i++;
            }
            else{
                arr[k] = rarr[j];
                j++;
            }
            k++;
        }
        while(i<size1) {
            arr[k] = larr[i];
            i++;
            k++;
        }
        while(j<size2) {
            arr[k] = larr[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 4, 6, 2};
        System.out.println("Before Sorting...");
        for(int element : arr) {
        System.out.print(element + " ");
        }
        System.out.println();

        mergeSort(arr, 0, arr.length-1);

        System.out.println("After Sorting...");
        for(int element : arr) {
            System.out.print(element + " ");
        }
    }
}
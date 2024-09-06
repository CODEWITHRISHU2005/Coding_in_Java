package org.classfiles;
public class Selection_Sort {
    public static void main(String[] args) {
    // Time Complexity_0(n^2)
    int arr[] = {7, 8, 1, 3, 2};

    //selection sort
    for(int i=0; i<arr.length-1; i++) {
        int smallest = i;
        for(int j=i+1; j<arr.length; j++) {
            if(arr[j] < arr[smallest]) {
                smallest = j;
                }
            }
        //swap
        int temp = arr[smallest];
        arr[smallest] = arr[i];
        arr[i] = temp;
        }
    for(int element:arr)
    System.out.print(element+" ");
    }
}

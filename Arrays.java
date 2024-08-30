import java.util.Scanner;
public class Arrays{
    public static void main(String[] args) {
        // Question_1-> Write a program to check if a given number is present in an array?
        Scanner sc =  new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5};
        int num = sc.nextInt();
        boolean isInArray = false;
        for(int element: arr){// Can replace by for loop
            if(num == element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("Entered value is present in a array");
        }
        else{
            System.out.println("The value is not present in an array");
        }

        // Question_2-> Write a program to calculate the average marks of all students in physics using for each loop?
        double phy[] = {77, 78 ,88, 99, 56};
        double sum = 0;
        for(double element: phy){
            sum = sum + element;
        }
        System.out.println(sum / phy.length);
        
        // Question_3-> Write a program to add two matrix of size-> 2*3      
        int firstMatrix[][] = {{1, 2, 3}, {4, 5, 6}};
        int secondMatrix[][] = {{7, 8, 9}, {10, 11, 12}};
        int sumMatrix[][] = new int[2][3];

        for(int i=0; i<firstMatrix.length; i++){// row no of times
            for(int j=0; j<firstMatrix[i].length; j++){// column no of times
                sumMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        for(int i=0; i<firstMatrix.length; i++){
            for(int j=0; j<firstMatrix[i].length; j++){
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // Question_4-> Write a program to reverse an array 
        int arr[] = {0,1,2,3,4,5,6,7,8};
        int n = arr.length;
        int l = Math.floorDiv(n, 2);// -> This is same as GIF function in math
        int temp;

        for(int i=0; i<l; i++){
            // |1| |2| | |
            // swap arr[i] and arr[n-1-i]
            temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        for(int element:arr){
            System.out.print(element + " ");
        }
        
        // Question_5-> Write a program to find out maximum element in an array
        int arr[] = {10, 20, 30, 40, 50};
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element in array is: " + max);
        
        // Question_6-> Write a program to check whether the array is sorted or not
        boolean isSorted = false;
        int arr[] = {70, 20, 30, 40, 50};
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                isSorted = true;
                break;
            }
        }
        if(isSorted) {
            System.out.println("Array is not sorted");
        } else {
            System.out.println("Array is sorted");
        }
        
        // Question_7-> Write a program to find out the max and min elements and return in an array that stores only the max and min elements
        int arr[] = {10, 20, 30, 40, 50};
        int min = arr[0];
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int result[] = {max, min};
        for(int element: result){
            System.out.print(element + " ");
        }
    }
}
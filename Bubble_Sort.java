public class Bubble_Sort {
    public static void main(String[] args) {
        // Time Complexity = 0(n^2)
        int arr[] ={7,8,3,1,2};
        // bubbleSort
        for(int i=0; i<arr.length-1; i++) { // n-1? -Because we have to travel a loop n-1 times to sort
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {

                    // swap arr[j] and arr[j+1]
                    // |1| |2| | |

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            } 
        }
        for(int element:arr)
        System.out.print(element+" ");
    }
}

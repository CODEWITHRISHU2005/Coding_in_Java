
public class Practice {
    public static void main(String[] args) {
        // Question_1-> Write a program to check if a given number is present in an array?
        // Scanner sc =  new Scanner(System.in);
        // /* 
        // int arr[] = {1, 2, 3, 4, 5};
        // int num = sc.nextInt();
        // boolean isInArray = false;
        // for(int element: arr){// Can replace by for loop
        //     if(num == element){
        //         isInArray = true;
        //         break;
        //     }
        // }
        // if(isInArray){
        //     System.out.println("Entered value is present in a array");
        // }
        // else{
        //     System.out.println("The value is not present in an array");
        // }

        // Question_2-> Write a program to calculate the average marks of all students in physics using for each loop?
        // double phy[] = {77, 78 ,88, 99, 56};
        // double sum = 0;
        // for(double element: phy){
        //     sum = sum + element;
        // }
        // System.out.println(sum / phy.length);

        // Question_3-> Write a program to add two matrix of size-> 2*3      
        // int firstMatrix[][] = {{1, 2, 3}, {4, 5, 6}};
        // int secondMatrix[][] = {{7, 8, 9}, {10, 11, 12}};
        // int sumMatrix[][] = new int[2][3];

        // for(int i=0; i<firstMatrix.length; i++){// row no of times
        //     for(int j=0; j<firstMatrix[i].length; j++){// column no of times
        //         sumMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
        //     }
        // }
        // for(int i=0; i<firstMatrix.length; i++){
        //     for(int j=0; j<firstMatrix[i].length; j++){
        //         System.out.print(sumMatrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // Question_4-> Write a program to reverse an array 
        // int arr[] = {0,1,2,3,4,5,6,7,8};
        // int n = arr.length;
        // int l = Math.floorDiv(n, 2);// -> This is same as GIF function in math
        // int temp;

        // for(int i=0; i<l; i++){
        //     // |1| |2| | |
        //     // swap arr[i] and arr[n-1-i]
        //     temp = arr[i];
        //     arr[i] = arr[n-1-i];
        //     arr[n-1-i] = temp;
        // }
        // for(int element:arr){
        //     System.out.print(element + " ");
        // }

        // Question_5-> Write a program to find out maximum element in an array
        // int arr[] = {10, 20, 30, 40, 50};
        // int max = arr[0];
        // for(int i=1; i<arr.length; i++){
        //     if(arr[i] > max){
        //         max = arr[i];
        //     }
        // }
        // System.out.println("Maximum element in array is: " + max);

        // Question_6-> Write a program to check whether the array is sorted or not
        // boolean isSorted = false;
        // int arr[] = {70, 20, 30, 40, 50};
        // for(int i=0; i<arr.length-1; i++) {
        //     if(arr[i] > arr[i+1]) {
        //         isSorted = true;
        //         break;
        //     }
        // }
        // if(isSorted) {
        //     System.out.println("Array is not sorted");
        // } else {
        //     System.out.println("Array is sorted");
        // }

        // Question_7-> Write a program to find out the max and min elements and return in an array that stores only the max and min elements
        // int arr[] = {10, 20, 30, 40, 50};
        // int min = arr[0];
        // int max = arr[0];
        // for(int i=1; i<arr.length; i++){
        //     if(arr[i] < min){
        //         min = arr[i];
        //     }
        //     if(arr[i] > max){
        //         max = arr[i];
        //     }
        // }
        // int result[] = {max, min};
        // for(int element: result){
        //     System.out.print(element + " ");
        // }

        // Question_8-> Write a program to print the sum of first n factorial
//         s = 1!+2!+3!+4!+5!+6!+......+n!
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextByte();
//         int sum = 0;
//         for(int i=1; i<=n; i++){
//             sum += factorial(i);
//             }
//             System.out.println("The sum of first " + n + " factorials: " + sum);
//         }
//         public static int factorial(int num) {
//             int product = 1;
//             for (int i=1; i<=num; i++) {
//                 product *= i;
//             }
//             return product;

        // Question_9-> Write a program to print the sum of below given series
        // s = 1^1 + 2^2 +3^3 +........+n^n 
        // Scanner sc = new Scanner(System.in);
        // byte n = sc.nextByte();
        // int sum = 0;
        // for(int i=1; i<=n; i++){
        //     sum += Math.pow(i, i);
        //     }
        //     System.out.println("The sum of given series: " + sum);

        // Question_10-> Write a program to print the sum of below given series
        // s = 1 + 2/2! + 3/3! +......+n/n!
        // Scanner sc = new Scanner(System.in);
        // byte n = sc.nextByte();
        // float sum = 0.0f;
        // for(float i=1; i<=n; i++){
        //     sum += i/factorial(i);
        //     }
        //     System.out.println("The sum of given series: " + sum);
        // }
        // public static int factorial(float num) {
        //     int product = 1;
        //     for (float i=1; i<=num; i++) {

        //         product *= i;
        //     }
        //     return product;

        // Question_11-> Write a program to print the sum of below given series
        // s = 1 + 2^2/2! + 3^3/3! +......+n^n/n!
        // Scanner sc = new Scanner(System.in);
        // byte n = sc.nextByte();
        // float sum = 0.0f;
        // for(float i=1; i<=n; i++){
        //     sum += Math.pow(i, i)/factorial(i);
        //     }
        //     System.out.println("The sum of given series: " + sum);
        // }
        // public static int factorial(float num) {
        //     int product = 1;
        //     for (float i=1; i<=num; i++) {

        //         product *= i;
        //     }
        //     return product;

        // Question_12-> Write a program to print the sum of below given series
        // s = 1 + 2^1/2! + 3^2/3! +......+n^n-1/n!
        // Scanner sc = new Scanner(System.in);
        // byte n = sc.nextByte();
        // float sum = 0.0f;
        // for(float i=1; i<=n; i++){
        //     sum += Math.pow(i, i-1)/factorial(i);
        //     }
        //     System.out.println("The sum of given series: " + sum);
        // }
        // public static int factorial(float num) {
        //     int product = 1;
        //     for (float i=1; i<=num; i++) {

        //         product *= i;
        //     }
        //     return product; 

        // Question_13-> Write a program to print the sum of below given series
        // s = 1! - 2! + 3! + -4! + 5! +........+
        // Scanner sc = new Scanner(System.in);
        // byte n = sc.nextByte();
        // int sum = 0;
        // for(int i=1; i<=n; i++){
        //     sum += Math.pow(-1, i+1) * factorial(i);
        //     }
        //     System.out.println("The sum of given series: " + sum);
        // }
        // public static int factorial(int num) {
        //     int product = 1;
        //     for (int i=1; i<=num; i++) {


        //         product *= i;
        //     }
        //     return product; 

        // Question_14-> Write a program to find the sum of the series of prime numbers up to (N).
        // Example_ 2, 3, 5, 7, 11, 13, 17, 19, ...............,97
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // int sum = 0;
        // for(int i=2; i<=N; i++){
        //     if(isPrime(i)){
        //         sum += i;
        //     }
        // }
        // System.out.println("Sum of prime numbers up to " + N + ": " + sum);
        // }
        //     public static boolean isPrime(int num) {
        //         if(num <= 1) return false;
        //         for(int i=2; i<=Math.sqrt(num); i++){
        //             if(num % i == 0) return false;
        //         }
        //         return true;
        // }
        // Question_15-> Write a program to print the sum of below given series
        // s = 1 + (1 + 2) + (1 + 2 + 3) +.........+ (1 + 2 + 3 +.....+N)
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // int totalSum = 0;
        // for(int i=1; i<=N; i++){
        //     int sum = 0;
        //     for(int j=1; j<=i; j++){
        //         sum += j;
        //         }
        //         totalSum += sum;
        //     }
        //     System.out.println("The sum of given series: " + totalSum);

        // Question_16-> Write a program to print the sum of below given series
        // s = 1 + (1.2) + (1.2.3) +........+ (1.2.3.4......N)
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // int sum = 0;
        // for(int i=1; i<=N; i++){
        //     int product = 1;
        //     for(int j=1; j<=i; j++){
        //         product *= j;
        //         }
        //         sum += product;
        //     }
        //     System.out.println("The sum of given series: " + sum);

        // Question_17-> Write a program to move all negative number to starting of series and positive to the end?
        // Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
        // Output: -12 -13 -5 -7 -3 -6 11 6 5

        // int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        // Arrays.sort(arr);
        //     for(int element: arr)
        //     System.out.print(element+" ");
        // }
        // String str = "123";
        // int number = Integer.parseInt(str, 12);
        // System.out.println(number);

        // Question_18-> WAP to print day using switch case.
        // String day = "Sunday";
        // switch(day) {
        // case "Monday" -> System.out.println("Monday");
        // case "Tuesday" -> System.out.println("Tuesday");      
        // case "Wednesday" -> System.out.println("Wednesday");      
        // case "Thursday" -> System.out.println("Thursday");      
        // case "Friday" -> System.out.println("Friday");
        // case "Saturday" -> System.out.println("Saturday");
        // default -> System.out.println("Sunday");

        // case "Monday" : System.out.println("Monday");
        // case "Tuesday" : System.out.println("Tuesday");      
        // case "Wednesday" : System.out.println("Wednesday");      
        // case "Thursday" : System.out.println("Thursday");      
        // case "Friday" : System.out.println("Friday");
        // case "Saturday" : System.out.println("Saturday");
        // default : System.out.println("Sunday");
        // }

        // Question_19-> WAP to calculate area of triangle using herones formula ?
//        System.out.println("Enter all thre  sides:");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        float s = (a + b + c) / 2.0f;
//
//        if ((a + b) > c && (b + c) > a && (c + a) > b) {
//            float area = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
//            System.out.println("The area of triangle is:" + area);
//        } else
//            System.out.println("Triangle is not possible you  cannot calculate area:");

        //Question_20-> WAP to check whethera given number is even or odd using bitwise operator?
//        System.out.println("Enter a number:");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        if ((num ^ 1) == (num + 1))
//            System.out.println("Entered number is even: ");
//        else System.out.println("Entered number is odd: ");

        //Question_21-> WAP to swap two num using bitwise operator?
//        int a = 2;
//        int b = 5;
//        a = a ^ b;
//        b = a ^ b;
//        a = a ^ b;
//        System.out.printf("%d %d", a, b);
    }
}

package com.DSA;

public class Recursion {
    public static void main(String[] args) {
    // recursive method to calculate factorial of a number n
    /*
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial (n - 1);
        }
    }
    // iterative method to calculate factorial of a number 
    static int factorial_Iterative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            int product = 1;
            for(int i=1; i<=n; i++){
                product *= i;
            }
            return product;
        }        
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("The factorial of a number n using iterative:" + factorial(n));
    System.out.println("The factorial of a number n using iterative:" + factorial_Iterative(n));
    }
    
    //Write a program to sum of first n natural numbers using recursion
    static int sum(int n){
        //Base Condition
        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }
    //Write a program to print the fibonacci series till nth term using recursion
    static void printFib(int a, int b, int n) {
        //Base Case
        //a-> 2nd last term
        //b-> last term
        if(n == 0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        printFib(c, b, n-1);
    }
    //Write a program to calculate the power of x^n using recursion stack height_(n)
    static int calcPower(int x, int n) {
        if(n == 0) { //Base Case_1
            return 1;
        }
        if(x == 0) { //Base Case_2
            return 0;
        }
        return x * calcPower(x, n-1);
    }
        public static void main(String[] args) {
        //System.out.println(calcPower(2, 5));
        //int a = 1, b = 2;
        //System.out.println(a);
        //System.out.println(b);
        //printFib(a, b, n-2);
        //int c = sum(4);
        //System.out.println(c);
    
    //Write a program to replace 0 with 5 Ex_Input_1004 and Output_1554
    public static int replaceZero(int num) {
        if(num == 0) {
            return 0;
        }
        int digit = num % 10;
        int modifiedDigit = replaceZero(num / 10);
        if(digit == 0) {
            return modifiedDigit * 10 + 5;
        }
        return modifiedDigit * 10 + digit; 
            
        }
        */
    }
}
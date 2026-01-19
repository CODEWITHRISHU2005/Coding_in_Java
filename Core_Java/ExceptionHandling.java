/*
=> TYPES OF ERRORS :
-> SYNTAX ERROR OR COMPILE TIME ERROR.
-> LOGICAL ERROR OR BUG.
-> EXCEPTION OR RUNTIME ERROR.

-> There are two types of Exception:-
 * Checked Exception or compile time exception Handled by compiler must be handled by programmer.Base Class is Exception.
 * Example: IOException, SQLException, ClassNotFoundException, etc.
 * Unchecked Exception or Runtime Exception. Handled by JVM. Base Class is RuntimeException or Error. optional to handle by programmer.
 * Example: ArithmeticException, ArrayIndexOutOfBoundsException, NullPointerException, etc.
*/

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with");
        int number = sc.nextInt();
        try {
            System.out.println("The value at array index entered is: " + marks[ind]);
            System.out.println("The value of array-value/number is: " + marks[ind] / number);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occured!");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occured!");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Some other exception occurred!");
            System.out.println(e);
        }
    }
}
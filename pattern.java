public class Pattern {
    public static void main(String[] args) {
        // Question_1-> Write a program to print the following pattern
        // *****
        // *****
        // *****
        // *****
        // for(int i=1; i<=4; i++){
        //     for(int j=1; j<=5; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Question_2-> Write a program to print the following pattern
        // *****
        // *   *
        // *   *
        // *****
        // 
        // for(int i=1; i<=4; i++){
        //     for(int j=1; j<=5; j++){
        //         if(i==1 || i==4){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // Question_3-> Write a program to print the following pattern
        // *
        // **
        // ***
        // ****
        // for(int i=1; i<=4; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //         }
        //         System.out.println();
        // }

        // Question_4-> Write a program to print the following pattern
        // ****
        // ***
        // **
        // *
        // for(int i=4; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //         }
        //         System.out.println();
        // }

        // Question_5-> Write a program to print the following pattern
        //    *
        //   **
        //  ***
        // ****
        // for(int i=1; i<=4; i++){
        //     // Spaces print
        //     for(int j=1; j<=4-i; j++){
        //         System.out.print(" ");
        //     }
        //     // Stars print
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Question_6-> Write a program to print the following pattern
        // 1
        // 12
        // 123
        // 1234
        // for(int i=1; i<=4; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // Question_7-> Write a program to print the following pattern
        // 12345
        // 1234
        // 123
        // 12
        // 1
        // for(int i=5; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // Question_8-> Write a program to print the following pattern
        // 1
        // 22
        // 333
        // 4444
        // 55555
        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        // Question_9-> Write a program to print the following pattern
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
        // int number = 1;
        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();
        // }

        // Question_10-> Write a program to print the following pattern
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1
        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=i; j++){
        //         int sum = i+j;
        //         if(sum%2 == 0){ //even
        //             System.out.print("1"+" ");
        //         }
        //         else{
        //             System.out.print("0"+" ");
        //         } 
        //     }
        //     System.out.println();
        // }

        // Question_11-> Write a program to print the following pattern
        // Butterfly problem

        // Upper Half
        // for(int i=1; i<=5; i++){
        //     // 1st part
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     // spaces
        //     int spaces = 2*(5-i);
        //     for(int j=1; j<=spaces; j++){
        //         System.out.print(" ");
        //     }
        //     // 2nd part
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // Lower Half
        // for(int i=5; i>=1; i--){
        //     // 1st part
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     // spaces
        //     int spaces = 2*(5-i);
        //     for(int j=1; j<=spaces; j++){
        //         System.out.print(" ");
        //     }
        //     // 2nd part
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Question_12-> Write a program to print the following pattern
        //     *****
        //    *****
        //   *****
        //  *****
        // *****

        // for(int i=1; i<=5; i++){
        //     // spaces
        //     for(int j=1; j<=5-i; j++){
        //         System.out.print(" ");
        //     }
        //     // stars
        //     for(int j=1; j<=5; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Question_13-> Write a program to print the following pattern
        //     1
        //    2 2
        //   3 3 3
        //  4 4 4
        // 5 5 5

        // for(int i=1; i<=5; i++){
        //     // spaces
        //     for(int j=1; j<=5-i; j++){
        //         System.out.print(" ");
        //     }
        //     // numbers-> print row no., row number of times
        //     for(int j=1; j<=i; j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        // Question_14-> Write a program to print the following pattern
        //     1
        //    2 1 2
        //   3 2 1 2 3
        //  4 3 2 1 2 3 4
        // 5 4 3 2 1 2 3 4 5

        // for(int i=1; i<=5; i++){
        //     // spaces
        //     for(int j=1; j<=5-i; j++){
        //         System.out.print(" ");
        //     }
        //     // 1st half numbers
        //     for(int j=i; j>=1; j--){
        //         System.out.print(j+" ");
        //     }
        //     // 2nd half numbers
        //     for(int j=2; j<=i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // Question_15-> Write a program to print the following pattern
        // Diamond pattern
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        //  *******
        //   *****
        //    ***
        //     *

        // //Upper Half
        // for(int i=1; i<=4; i++){
        //     // spaces
        //     for(int j=1; j<=4-i; j++){
        //         System.out.print(" ");
        //     }
        //     // stars
        //     for(int j=1; j<=2*i-1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // //Lower Half
        // for(int i=4; i>=1; i--){
        //     // spaces
        //     for(int j=1; j<=4-i; j++){
        //         System.out.print(" ");
        //     }
        //     // stars
        //     for(int j=1; j<=2*i-1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Question_16-> Write a program to print the following pattern
        // *****
        //  ***
        //   *
        //   *
        //  ***
        // *****
        // Upper Half
//         for(int i=3; i>=1; i--){
//             // spaces
//             for(int j=1; j<=3-i; j++){
//                 System.out.print(" ");
//             }
//             // stars
//             for(int j=1; j<=2*i-1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

        // Lower Half
//         for(int i=1; i<=3; i++){
//             // spaces
//             for(int j=1; j<=3-i; j++){
//                 System.out.print(" ");
//             }
//             // stars
//             for(int j=1; j<=2*i-1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
    }
}
package com.apnaCollege;

public class Patterns {

    public static void main(String[] args) {

        int n=5;
        //int number = 1;

        // Diamond Pattern
        // for upper half
        for(int i=1; i<=n; i++){
            // for spaces
            for(int j=1; j<=n-i; j++ ){
                System.out.print(" ");
            }
            // fpr printing stars
            for(int j=1; j<= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // for lower half
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++ ){
                System.out.print(" ");
            }
            for(int j=1; j<= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Plandromic pyramid

//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            for(int j=i; j>=1; j--){
//                System.out.print(j);
//            }
//            for(int j=2; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }



        // Number pyramid

//        for(int i=1; i <=n; i++){
//            for(int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//
//            for(int j=1; j<=i; j++){
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }

        //Butterfly pattern

        //upper half
        // left side *
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            int spaces = 2*(n-i);
//            for(int j=1; j<=spaces; j++){
//                System.out.print(" ");
//            }
//
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        // Lower half
//
//        for(int i=n; i>=1; i--){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            int spaces = 2*(n-i);
//            for(int j=1; j<=spaces; j++){
//                System.out.print(" ");
//            }
//
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // 0 1 Triangle

//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                int sum = i+j;
//                if(sum % 2 == 0)
//                    System.out.print(1 + " ");
//                else
//                    System.out.print(0 + " ");
//            }
//            System.out.println();
//        }

        // Flyod triangle

//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(number + " ");
//                number++;
//            }
//            System.out.println();
//        }

        // Inverted pyramid for number

//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n-i+1; j++){
//                System.out.print(j + "");
//            }
//            System.out.println();
//        }

        // Pryamid for number

//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }


        // Pyramid at right

        //outer loop
//        for(int i=1; i<=n; i++) {
//            // loop for apace
//            for(int j=1; j <=n-i; j++) {
//                System.out.print(" ");
//            }
//              // inner loop to print star
//                for(int j=1; j<=i; j++){
//                    System.out.print("*");
//                }
//
//            System.out.println();
//
//        }

        // inverted pyramid

//        for(int i=4; i>=1; i--){
//            for(int j=1; j<=i ;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//   pattern for half pyramid

//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//    Pattern for hollow triangle

//        for(int i=1; i<=4; i++){
//            for(int j=1; j<=5; j++){
//                if(i == 1 || j == 1 || i == 4 || j == 5) {
//                    System.out.print("* ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

//     Pattern for rectangle

//        for(int i=1; i<=4; i++){
//            for(int j=1; j<=5; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
}

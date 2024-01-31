package com.patterns;

public class Pattern {

    public static void main(String[] args) {

        int input = 5;
       // pattern(input);
        pattern1(input);

    }

    static void pattern(int input){
        // this loop will run for number of rows in the pattern
        for (int row = 1; row <= input; row++) {                 //
                                                                 //
            for (int col = 1; col <=row ; col++) {

                System.out.print("* ");

            }
            System.out.println();

        }

    }

    static void pattern1(int input){
        for (int row = 1; row <= input ; row++) {
            for (int col = 0; col <input-row+1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }


    }



}

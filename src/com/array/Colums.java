package com.array;

public class Colums {

    public static void main(String[] args) {

        int[][] arr = {
                {5, 6, 9, 2},
                {1, 4, 6},
                {3, 9}
        };

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}

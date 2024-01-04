package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionArray {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[][] arr2d =  new int[3][3];

        for (int row = 0; row < arr2d.length ; row++) {
            for(int col = 0; col < arr2d[row].length;col++){
                arr2d[row][col] = in.nextInt();

            }

        }

//        for (int row = 0; row < arr2d.length ; row++) {
//            for(int col = 0; col < arr2d[row].length;col++){
//                System.out.print(arr2d[row][col] + " ");

//        for (int row = 0; row < arr2d.length ; row++) {
//            System.out.println(Arrays.toString(arr2d[row]));
//
//            }
        for(int[] a : arr2d){
            System.out.println(Arrays.toString(a));
        }
            System.out.println();

        }

    }


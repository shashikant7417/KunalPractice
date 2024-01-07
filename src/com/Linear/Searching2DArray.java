package com.Linear;

import java.util.Arrays;

public class Searching2DArray {
    public static void main(String[] args) {

        int[][] arr2d = {
                {3,4,5,6},
                {2,9,8},
                {12,23,34,17}

        };
        int target = 97;

        int[] ans = search2d(arr2d,target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] search2d(int[][] arr, int target){
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {

                if(arr[row][col] == target){

                    return new int[]{row,col};
                }

            }

        }
        return new int[]{-1,-1};

    }
}

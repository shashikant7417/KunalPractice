package com.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class OneDArray {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] nums = new int[5];
        
        for (int i = 0; i <nums.length; i++) {
            nums[i] = in.nextInt();
            
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
            
        }
        
    }
}

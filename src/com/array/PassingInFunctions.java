package com.array;

import java.util.Arrays;

public class PassingInFunctions {

    public static void main(String[] args) {

        int[] nums = {1,2,3,45,6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

     static void change(int[] naam){

        naam[3] = 672;
    }
}

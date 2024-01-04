package com.array;

import java.util.Arrays;

public class SwapInArray {

    public static void main(String[] args) {

        int[] arr = {3 , 23, 45, 56, 87};
        swap(arr ,1,3 );
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}

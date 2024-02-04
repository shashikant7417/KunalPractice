package com.apnaCollege;

public class BubbleSort {

    public static void printArray(int[] array){
        for(int i=0; i< array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println();

    }

    public static void main(String[] args) {

        int[] arr = {7,8,3,1,2};

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){

                if(arr[j] > arr[j+1]){
                  // swapping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }

}

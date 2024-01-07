package com.Linear;

public class LinearSearch {

    public static void main(String[] args) {

        int[] nums = {23 , 12 , 32, -4 , 10 , 77 , -3 , 56};
        int element = 11;

        boolean index = linearSearch3(nums , element);

        System.out.println(index);

    }
    // creating Linear search method which is taking argument as int[] and target value to find
//    static int linearSearch(int[] arr , int target){
//        // checking weather array is empty
//        if(arr.length == 0){
//            return -1;
//        }
//    // with the help of for loop comparing every element of array with the target element
//        // if found it will return the index in the array where element is located
//        for (int index = 0; index < arr.length; index++) {
//            if(arr[index] == target){
//                return index;
//            }
//
//        }
//        // if target value not found return negative
//        return -1;
//    }

//    static int linearSearch1(int[] arr , int target){
//        // checking weather array is empty
//        if(arr.length == 0){
//            return -1;
//        }
//        // with the help of for loop comparing every element of array with the target element
//        // if found it will return the index in the array where element is located
//        for (int index = 0; index < arr.length; index++) {
//            int element = arr[index];
//            if(element == target){
//                return element;
//            }
//
//        }
//        // if target value not found return negative
//        return -1;
//    }

//    static int linearSearch2(int[] arr , int target){
//        // checking weather array is empty
//        if(arr.length == 0){
//            return -1;
//        }
//        // with the help of for loop comparing every element of array with the target element
//        // if found it will return the index in the array where element is located
//        for (int element : arr)
//            if(element == target){
//                return element;
//            }
//
//
//        // if target value not found return negative
//        return -1;
//    }

    static boolean linearSearch3(int[] arr , int target){
        // checking weather array is empty
        if(arr.length == 0){
            return false;
        }
        // with the help of for loop comparing every element of array with the target element
        // if found it will return the index in the array where element is located
        for (int element : arr)
            if(element == target){
                return true;
            }


        // if target value not found return negative
        return false;
    }
}

package com.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {-10,-5,-3,0,2,4,6,8,10,23,46,76};
        int target = -5;
        int ans = binarySearch(arr,target);
        System.out.println(ans);

    }

    static int binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1 ;

        while(start <= end){

            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;

            }else
                return mid;
        }

        return -1;
    }
}

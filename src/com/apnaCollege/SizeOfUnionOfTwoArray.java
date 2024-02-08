package com.apnaCollege;

import java.util.HashSet;

public class SizeOfUnionOfTwoArray {

    public static int union(int arr1[] , int arr2[]){
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i=0; i<arr1.length; i++){
            hashSet.add(arr1[i]);
        }
        for(int j=0; j<arr2.length; j++){
            hashSet.add(arr2[j]);
        }

        return hashSet.size();
    }

    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        System.out.println(union(arr1,arr2));
    }
}

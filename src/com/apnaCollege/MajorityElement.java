package com.apnaCollege;

import java.util.HashMap;

public class MajorityElement {

    public static void checkMajorityElement(int nums[]){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(hashMap.containsKey(nums[i])){  //true
                hashMap.put(nums[i],hashMap.get(nums[i])+1);
            }
            else {
                hashMap.put(nums[i], 1);
            }
        }

        for(int key : hashMap.keySet()){
            if(hashMap.get(key) > n/3){
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) {
       // int nums[] ={1,3,2,5,1,3,1,5,1};
        int nums[] = {1};
        checkMajorityElement(nums);

    }
}

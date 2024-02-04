package com.apnaCollege;

public class Recurssion {

    public static void printNumber(int n){
        // base condition
        if(n==0) {
            return;
        }

        System.out.println(n); // print number
        printNumber(n-1);    // recursive call
    }

    public static void main(String[] args) {

        int n=5;
        printNumber(n);

    }
}

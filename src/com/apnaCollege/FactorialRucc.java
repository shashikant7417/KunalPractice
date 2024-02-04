package com.apnaCollege;

public class FactorialRucc {

    public static void main(String[] args) {
        int n = 5;
        int sum = calculateFactorial(n);
        System.out.println(sum);
    }

    public static int calculateFactorial(int n) {
        if(n==0 || n==1){

            return 1;
        }

        int fac_nm1 =calculateFactorial(n-1);
        int fac_n= n * fac_nm1;
        return fac_n;

    }
}

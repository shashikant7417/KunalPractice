package com.apnaCollege;

public class RuccXpowN {

    public static void main(String[] args) {

        int x= 2, n=5;
        int ans = calPow(x,n);
        System.out.println(ans);
    }

    private static int calPow(int x, int n) {

        if (n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

         int powNm1 = calPow(x, n - 1);
         int powN1 = x* powNm1;
         return powN1;
    }
}

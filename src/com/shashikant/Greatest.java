package com.shashikant;

import java.util.Scanner;

public class Greatest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the three number");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = Math.max(c,Math.max(a,b));

//        if(b>a){
//            max=b;
//        }
//        if(c>b){
//            max=c;
//        }
        System.out.println("Maximum is :"+ max);
    }
}

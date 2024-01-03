package com.shashikant;

import java.util.Scanner;

public class Evenodd {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.print("Please input a number:");

        int num = number.nextInt();

        if(num%2==0){
            System.out.println("Entered number is Even:" + num);
        }else
        System.out.println("Entered number is Odd:" + num);

    }
}

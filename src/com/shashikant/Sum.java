package com.shashikant;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.print("Please enter the first number:");
        int firstNumber = number.nextInt();
        System.out.print("Please enter the first number:");
        int secondNumber =number.nextInt();

        int sum = firstNumber+secondNumber;
        System.out.print("Sum of two numbers is:" + sum);

    }


}

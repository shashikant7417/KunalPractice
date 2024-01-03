package com.shashikant;

import java.util.Scanner;

public class Simpleinterest {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.print("Please enter the Principle amount:");
        int principle = number.nextInt();
        System.out.print("Please enter the Rate of interest:");
        float rate =number.nextFloat();
        System.out.print("Please enter time:");
        int time =number.nextInt();

        float simpleInterest = (principle*rate*time)/100;
        System.out.println("Simple interest is:"+ simpleInterest);
    }
}

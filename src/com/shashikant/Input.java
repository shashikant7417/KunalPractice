package com.shashikant;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number :");
        int rollNo = input.nextInt();
        System.out.println("Your roll no is : " + rollNo);
    }
}

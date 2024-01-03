package com.shashikant;

import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        System.out.print("Please enter your name:");
        String name = string.next();
        System.out.println("Welcome to the programming world :" + name);
    }
}

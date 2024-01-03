package com.shashikant;

import java.util.Scanner;

public class Tabel {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Please enter the number to print Tabel:");
        int num = number.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }

    }
}

package com.shashikant;

import java.util.Scanner;

public class Leap {

    public static void main(String[] args) {

        Scanner year = new Scanner(System.in);
        System.out.print("Please enter the year to check weather its leap year or not :");
        int checkLeap = year.nextInt();
        if(checkLeap % 4 == 0 && checkLeap % 100 != 0 || checkLeap % 400 == 0){
            System.out.println("Entered year is leap year :" + checkLeap);
        } else
            System.out.println("Entered year is  not leap year :" + checkLeap);

    }
}

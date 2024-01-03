package com.shashikant;

public class Countnum {

    public static void main(String[] args) {
        int number  = 1353463;
        int count =0;
        while(number>0){
            int rem = number % 10;
            if(rem == 3){
                count++;
            }
            number = number/10;

            }
        System.out.println(count);


        }

    }


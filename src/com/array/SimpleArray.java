package com.array;

import java.util.Arrays;

public class SimpleArray {

    public static void main(String[] args) {

        String[] name = new String[5];
        name[0] = "shashikant";
        name[1] = "Ahiransh";
        name[2] = "Rachna";
        name[3] = "Kapil";
        name[4] = "Deva";

      System.out.println(Arrays.toString(name));

      name[2] = "shashikant";

        System.out.println(Arrays.toString(name));

//        for (int i = 0; i < name.length; i++) {
//            System.out.println(name[i]);

//        for(String naam : name){
//            System.out.print(naam +  " ");

//        System.out.print(Arrays.toString(name));

        }
    }


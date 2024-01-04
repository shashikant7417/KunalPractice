package com.array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> integerArrayList = new ArrayList<>(10);

        for (int i = 0; i < 5; i++) {
            integerArrayList.add(in.nextInt());

        }

        for (int i = 0; i < 5; i++) {
            System.out.println(integerArrayList.get(i));

        }

    }
}

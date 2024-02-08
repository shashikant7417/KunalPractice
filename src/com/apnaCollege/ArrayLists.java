package com.apnaCollege;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayLists {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        // To add element in array list
        arrayList.add(1);
        arrayList.add(9);
        arrayList.add(5);
        arrayList.add(2);

        System.out.println(arrayList);

        // To get element in arraylist
        Integer integer = arrayList.get(3);
        System.out.println(integer);

        // To remove element in array list
        arrayList.remove(2);
        System.out.println(arrayList);

        // Add in between
        arrayList.add(2,4);
        System.out.println(arrayList);

         // ArrayLiat Size
         int size = arrayList.size();
         System.out.println(size);

         // Iteration over ArrayList
        for(int i=0; i<arrayList.size(); i++){
            System.out.print(arrayList.get(i));

        }
        System.out.println();

        Collections.sort(arrayList);
        System.out.println(arrayList);

    }



}

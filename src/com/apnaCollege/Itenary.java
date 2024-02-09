package com.apnaCollege;

import java.util.HashMap;

public class Itenary {

    public static String getStart(HashMap<String,String> tick){
        HashMap<String, String> revMap = new HashMap<>();

        for (String key : tick.keySet()) {

            revMap.put(tick.get(key), key);
            
        }
        
        for (String key : tick.keySet() ) {
            if(!revMap.containsKey(key)){
                return key;

            }

        }
        return null;

    }


    public static void main(String[] args) {

        HashMap<String, String> ticketMap = new HashMap<>();
        ticketMap.put("Chennai", "Bengaluru");
        ticketMap.put("Mumbai", "Delhi");
        ticketMap.put("Goa", "Chennai");
        ticketMap.put("Delhi", "Goa");

        String start = getStart(ticketMap);

        while (ticketMap.containsKey(start)){
            System.out.println(start);
            start = ticketMap.get(start);
        }
        System.out.println(start);



    }
}

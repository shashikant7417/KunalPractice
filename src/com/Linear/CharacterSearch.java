package com.Linear;

public class CharacterSearch {

    public static void main(String[] args) {

        String str = "Shashikant";
        char target = 's';
        System.out.println(searchChar(str,target));

    }

    static boolean searchChar(String st, char target){
        if(st.length() == 0){
            return false;
        }

        for (int i = 0; i < st.length(); i++) {
            if(st.charAt(i) == target){
                return true;
            }

        }
        return false;
    }
}

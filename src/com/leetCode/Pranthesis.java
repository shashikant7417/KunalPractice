package com.leetCode;

import java.util.Stack;

public class Pranthesis {
    public static void main(String[] args) {

        Pranthesis pr = new Pranthesis();
        pr.isValid("()");

    }
    public char getVal(char ch){

        switch (ch){

            case ']': return '[';
            case '}': return '{';
            case ')': return '(';
            default: return ' ';

        }


    }

    public boolean isValid(String s) {

        String openingBracket = "({[";


        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){

            if(openingBracket.indexOf(ch) != -1){
                stack.push(ch);


            }else {
                if(stack.size() == 0) return false;

                char temp = stack.pop();
                if(getVal(ch) != temp )
                    return false;
            }


            }

        return stack.size() == 0;

    }




}

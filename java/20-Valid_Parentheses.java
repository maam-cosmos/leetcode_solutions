package com.company;

import java.util.Stack;

public class Main {

    public static boolean isValid(String s) {

        Stack parenStack = new Stack();
        int strLen = s.length();
        char[] parenArr;
        boolean flag = false;
        parenArr = s.toCharArray();

        if (strLen == 0 || (strLen % 2) != 0)
            return false;

        for (int i = 0; i < strLen; i++) {
            if (!parenStack.empty()) {
                if (parenStack.peek().equals('(') && parenArr[i] == ')') {
                    parenStack.pop();
                    flag = true;
                } else if (parenStack.peek().equals('{') && parenArr[i] == '}') {
                    parenStack.pop();
                    flag = true;
                } else if (parenStack.peek().equals('[') && parenArr[i] == ']') {
                    parenStack.pop();
                    flag = true;
                } else {
                    parenStack.push(parenArr[i]);
                    flag = false;
                }
            } else{
                parenStack.push(parenArr[i]);
            }
        }
        if (!parenStack.empty())
            return false;
        return flag;
    }

    public static void main(String[] args) {
        //Test cases

        //String s = "([}}])";
        //String s = "()[]{}";
        //String s = "()";
        //String s = "([)]";
        //String s = "(]";
        //String s = "((";
        String s = "[[[]";
        System.out.println("The string is: " + isValid(s));


    }
}

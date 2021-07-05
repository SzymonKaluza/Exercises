package com.company;

import java.util.LinkedList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        String turtle = "Żółw";
        int turtleLength = turtle.length();
        for(int counter = 0; counter < turtleLength; counter += 1){
            System.out.println(turtle.charAt(counter) + " : " + turtle.codePointAt(counter));
        }
    }
}

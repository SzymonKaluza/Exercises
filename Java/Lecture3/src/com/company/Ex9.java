package com.company;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int length = word.length();
        int tempLength = word.length();
        int test = 0;
        for (int counter = 0; counter < length; counter += 1) {
            if (word.charAt(counter) == word.charAt(tempLength - 1)) {
                tempLength -= 1;
                test += 1;
            } else {
                test -= 100;
            }
        }
        if (test == length || test == (length - 1)){
            System.out.println("Słowo jest polindromem!");
        }
        else {
            System.out.println("Słowo nie jest polindromem! ");
        }
    }
}

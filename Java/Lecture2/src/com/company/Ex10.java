package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("początek to: ");
        int a = scanner.nextInt();
        System.out.println("Koniec to: ");
        int b = scanner.nextInt();
        int score = 0;
        if (a % 2 == 0) {
            for (; a < b + 1; a += 2){
                score += a;
            }
        }
        if (a % 2 != 0){
            for (a = a + 1; a < b + 1; a += 2){
                score += a;
            }
        }
        System.out.println("suma liczb parzystych wynosi: " + score);
    }
}

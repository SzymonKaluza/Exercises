package com.company;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        double score = 0;
        int number = 1;
        Scanner scanner = new Scanner(System.in);
        while(number != 0){
            System.out.println("Podaj liczbę: ");
            number = scanner.nextInt();
            score += Math.sqrt(Math.abs(number));
        }
        System.out.println(score);
    }
}

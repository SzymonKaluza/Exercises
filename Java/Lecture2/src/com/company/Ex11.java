package com.company;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        int number = 1;
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        while (number != 0){
            System.out.println("Podaj liczbę: ");
            number = scanner.nextInt();
            score += number;
        }
        System.out.println("Wynik wynosi: "+ score);
    }
}

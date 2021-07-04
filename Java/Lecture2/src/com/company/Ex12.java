package com.company;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        int score = 1;
        while(number != 0){
            System.out.println("Podaj liczbę: ");
            score = score * number;
            number = scanner.nextInt();
        }
        System.out.println("Wynik wynosi: " + score);
    }
}

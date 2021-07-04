package com.company;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        int score = 0;
        int number = 1;
        Scanner scanner = new Scanner(System.in);
        while(number != 0){
            System.out.println("Podaj liczbę: ");
            number = scanner.nextInt();
            score += Math.abs(number);
        }
        System.out.println("Suma wartości bezwzględnych liczb podanych przez użytkownika wynosi: "+ score);
    }
}

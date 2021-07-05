package com.company;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");
        int number = scanner.nextInt();
        int score = 0;
        if (number < 0){
            score = -number;
        }
        else{
            score = number;
        }
        System.out.println("Wartość bezwzględna podanej wartości wynosi: " + score);
    }
}

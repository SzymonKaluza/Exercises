package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj liczbę: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 3 == 0) {
            System.out.println("Liczba jest podzielna przez 3!");
        } else {
            System.out.println("Liczba nie jest podzielna przez 3 !");
        }

    }
}

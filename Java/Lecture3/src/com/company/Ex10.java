package com.company;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int number = 1;
        while (number != 0) {
            System.out.print("Podaj liczbę całkowitą: ");
            number = scanner.nextInt();
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Największą z podanych liczb jest: " + max);
    }
}

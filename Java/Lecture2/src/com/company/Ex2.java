package com.company;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Podaj długość promienia: ");
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        System.out.println("Pole okręgu wynosi: " + (Math.PI * Math.pow(radius, 2)));
    }
}

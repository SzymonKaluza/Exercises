package com.company;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Długość podstawy 1 wynosi: ");
        double baseA = scanner.nextInt();
        System.out.println("Długość podstawy 2 wynosi: ");
        double baseB = scanner.nextInt();
        System.out.println("wysokość wynosi: ");
        double high = scanner.nextInt();
        System.out.println("Pole trapezu wynosi: "+((baseA + baseB) * high) / 2);

    }
}

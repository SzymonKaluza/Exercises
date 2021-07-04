package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj długość promienia: ");
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        System.out.println("Obwód okręgu wynosi: " + (2 * Math.PI * radius));
    }
}

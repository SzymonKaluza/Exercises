package com.company;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");
        int number = scanner.nextInt();
        System.out.print("Signum podajnej liczby wynosi: ");
        if(number == 0){
            System.out.println("0");
        }
        else if (number > 0){
            System.out.println("1");
        }
        else {
            System.out.println("-1");
        }
    }
}

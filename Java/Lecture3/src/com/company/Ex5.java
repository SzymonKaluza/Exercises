package com.company;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        float numberFirst = scanner.nextFloat();
        System.out.print("Podaj drugą liczbę: ");
        float numberSecond = scanner.nextFloat();
        if (numberSecond != 0){
            System.out.println(numberFirst/numberSecond);
        }
        else{
            System.out.println("Druga liczba jest równa 0. Nie można dokonać obliczenia!");
        }

    }
}

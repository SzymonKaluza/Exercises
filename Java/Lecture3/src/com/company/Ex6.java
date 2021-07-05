package com.company;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wartość a: ");
        float firstArgument = scanner.nextFloat();
        System.out.print("Podaj wartość b: ");
        float secondArgument = scanner.nextFloat();
        System.out.println("Równanie przyjmuje postać: " + firstArgument + "x" + secondArgument);
        if (firstArgument != 0){
            System.out.println(-secondArgument/firstArgument);
        }
        else {
            System.out.println("A wynosi 0, równanie nie ma pierwiastka");
        }
    }
}

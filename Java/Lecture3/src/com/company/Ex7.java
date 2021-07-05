package com.company;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        if (firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.println("Największa jest liczba " + firstNumber);
        }
        else if (secondNumber > firstNumber && secondNumber > thirdNumber){
            System.out.println("Największa jest liczba " + secondNumber);
        }
        else{
            System.out.println("Największa jest liczba " + thirdNumber);
        }
        if (firstNumber < secondNumber && firstNumber < thirdNumber){
            System.out.println("Najmniejsza jest liczba " + firstNumber);
        }
        else if (secondNumber < firstNumber && secondNumber < thirdNumber){
            System.out.println("Najmniejsza jest liczba " + secondNumber);
        }
        else {
            System.out.println("Najmniejsza jest liczba " + thirdNumber);
        }
    }
}

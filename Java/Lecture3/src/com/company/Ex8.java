package com.company;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj długość pierwszego boku: ");
        double firstSide = scanner.nextDouble();
        System.out.print("Podaj długość drugiego boku: ");
        double secondSide = scanner.nextDouble();
        System.out.print("Podaj długość trzeciego boku: ");
        double thirdSide = scanner.nextDouble();
        if(firstSide > secondSide + thirdSide || secondSide > firstSide + secondSide ||
                thirdSide > firstSide + secondSide || firstSide == secondSide + thirdSide ||
                secondSide == firstSide + secondSide || thirdSide == firstSide + secondSide) {
            System.out.println("Nie można utworzyć trójkąta!");
        }
        else {
            System.out.println("Obwód trójkąta wynosi: " + (firstSide + secondSide + thirdSide));
            double p = (firstSide + secondSide + thirdSide) / 2;
            double score = Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide));
            System.out.println(score);
            System.out.println("Poletrójkąta wynosi: " + score);
        }
    }
}

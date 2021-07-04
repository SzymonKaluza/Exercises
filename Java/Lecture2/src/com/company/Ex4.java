package com.company;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bok 1 jest równy: ");
        double firstSide = scanner.nextInt();
        System.out.println("Bok 2 jest równy: ");
        double secondSide = scanner.nextInt();
        System.out.println("Bok 3 jest równy: ");
        double thirdSide = scanner.nextInt();
        double score = 0;
        double point = (firstSide + secondSide + thirdSide) / 2;
        score = Math.sqrt(point*(point - firstSide)*(point - secondSide)* (point - thirdSide));
        System.out.println("Pole trójkąta wynosi: "+score);
    }
}

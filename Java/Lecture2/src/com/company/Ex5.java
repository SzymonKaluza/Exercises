package com.company;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println("Podaj ilość stopni: ");
        Scanner scanner = new Scanner(System.in);
        double degree = scanner.nextInt();
        double radian =  (2*degree)/360;
        System.out.println(degree + " stopni po przeliczeniu wynosi " + radian + " radianów");
    }
}

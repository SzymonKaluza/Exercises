package com.company;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        System.out.println("Podaj miarę konta w radianach: ");
        Scanner scanner = new Scanner(System.in);
        int radian = scanner.nextInt();
        if (radian == 0) {
            radian = 0;
        }
        else if (radian % 2 == 0) {
            radian = 2;
        }
        else if (radian > 2) {
            radian = radian % 2;
        }
        int degree = (radian * 360)/2;
        System.out.println("po przeliczeniu wynosi " + degree + " stopni.");
    }
}

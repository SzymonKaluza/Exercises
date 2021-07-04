package com.company;

public class Ex9 {
    public static void main(String[] args) {
        int score = 0;
        for (int counter = 1; counter < 64; counter += 1){
            score += Math.pow(2, counter);
        }
        System.out.println("Suma kolejnych potęg liczby 2, o wykładnikach od 1 do 63, wynosi: " + score);
    }
}

package com.company;

public class Ex7 {
    public static void main(String[] args) {
        int score = 0;
        for (int counter = 2; counter < 101; counter += 1){
            score += counter;
        }
        System.out.println("Suma liczb od 2 do 100 wynosi: " + score);
    }
}

package com.company;

public class Ex8 {
    public static void main(String[] args) {
        int score = 0;
        for (int counter = 0; counter < 101; counter += 1){
            score += Math.pow(counter, 2);
        }
        System.out.println("Suma kwadratów liczb od 1 do 100 wynosi: " + score);
    }
}

package com.company;

public class Ex2 {
    public static void main(String[] args) {
        int counter2 = 0;
        for (int counter = 0; counter < 11; counter += 1) {
            counter2 = counter2 + counter;
            System.out.println(counter + " : " + counter2);
        }
        System.out.println("Suma 10 pierwszych liczb całkowitych wynosi: " + counter2);
    }
}

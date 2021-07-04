package com.company;

public class Ex3 {
    public static void main(String[] args) {
        int counter2 = 1;
        for (int counter = 1; counter < 11; counter += 1) {
            counter2 = counter2 * counter;
            System.out.println(counter + " : " + counter2);
        }
        System.out.println("iloczyn 10 kolejnych liczb całkowitych wynosi: " + counter2);
    }
}

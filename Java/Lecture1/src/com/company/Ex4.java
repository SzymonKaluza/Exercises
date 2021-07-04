package com.company;

public class Ex4 {
    public static void main(String[] args) {
        int presentValue = 1000;
        double futureValue = 0.0;
        double r = 0.06;

        for (int time = 1; time < 4; time += 1)
        {
            futureValue = presentValue * Math.pow((1 + r), time);
            System.out.println("Saldo po " + (time) + " roku wynosi: " + futureValue);
        }

    }
}

package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex15 {
    public static void main(String[] args) {
        int counter = 0;
        List<Integer> listNumber = new LinkedList<>();
        listNumber.add(1);
        listNumber.add(2);
        listNumber.add(3);
        listNumber.add(4);
        listNumber.add(5);
        listNumber.add(6);
        listNumber.add(7);
        listNumber.add(8);
        listNumber.add(9);
        listNumber.add(10);
        for (Integer s: listNumber){
            listNumber.set(counter, (counter + 10));
            counter += 1;
        }
        System.out.println(listNumber);
    }
}

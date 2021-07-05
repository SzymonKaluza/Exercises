package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List <String> listCharacter = new LinkedList<>();
        listCharacter.add("'");
        listCharacter.add("\"");
        listCharacter.add("\"\"\"something\"\"\"");
        System.out.println(listCharacter);

    }
}

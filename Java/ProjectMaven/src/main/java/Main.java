import guru.springframework.norris.chuck.ChuckNorrisQuotes;

import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ChuckNorrisQuotes random = new ChuckNorrisQuotes();
        System.out.println(random.getRandomQuote());
        JOptionPane.showMessageDialog(null, random.getRandomQuote());
    }
}

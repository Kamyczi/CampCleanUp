package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = "src/dane.txt";

        String[] pary = ZadaniaElfow.odczytajDaneZPliku(fileName);

        if (pary != null) {
            int wynik = ZadaniaElfow.IleJestTakich(pary);
            System.out.println("Liczba par, w których jeden zakres w pełni zawiera drugi: " + wynik);
        }
    }

}

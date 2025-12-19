package org.example;

public class Main {
    public static void main(String[] args) {
        String[] pary = {
                "2-4,6-8",
                "2-3,4-5",
                "5-7,7-9",
                "2-8,3-7",
                "6-6,4-6",
                "2-6,4-8"
        };

        int wynik = ZadaniaElfow.IleJestTakich(pary);
        System.out.println("Liczba par, w których jeden zakres w pełni zawiera drugi: " + wynik);
    }
}
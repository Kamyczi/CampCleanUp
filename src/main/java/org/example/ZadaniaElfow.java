package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ZadaniaElfow {
    public static String[] odczytajDaneZPliku(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            java.util.List<String> lines = new java.util.ArrayList<>();

            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }

            return lines.toArray(new String[0]);
        } catch (FileNotFoundException e) {
            System.err.println("Błąd: Plik nie został znaleziony: " + e.getMessage());
            return null;
        }
    }

    public static boolean CzyJedenJestWDrugim(String range1, String range2) {
        String[] parts1 = range1.split("-");
        String[] parts2 = range2.split("-");

        int a = Integer.parseInt(parts1[0]);
        int b = Integer.parseInt(parts1[1]);
        int c = Integer.parseInt(parts2[0]);
        int d = Integer.parseInt(parts2[1]);

        if (a <= c && b >= d) {
            return true;
        }
        if (c <= a && d >= b) {
            return true;
        }
        return false;
    }

    public static int IleJestTakich(String[] pairs) {
        int count = 0;
        for (String pair : pairs) {
            String[] ranges = pair.split(",");
            String range1 = ranges[0];
            String range2 = ranges[1];

            if (CzyJedenJestWDrugim(range1, range2)) {
                count++;
            }
        }
        return count;
    }


}

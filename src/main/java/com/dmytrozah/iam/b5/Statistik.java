package com.dmytrozah.iam.b5;

import java.util.Scanner;

/**
 * P5
 * F1. Geben Sie ein Beispiel für einen Rundungsfehler durch Auslöschung an.
 * 10.93747321 - 10.9374733 = 0.00000011111 => Haufen sich Fehler an
 *
 * F2. Um welchen Mittelwert handelt es sich? Den arithmetischen oder den geometrischen Mittelwert?
 * Arithmetisch ist durch Wurzel und Multiplikation gegeben
 */

public class Statistik {

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Geben Sie n ein: ");
        int n = sc.nextInt();

        double[] daten = new double[n];

        for (int i = 0; i < n; i++) {
            daten[i] = sc.nextDouble();
        }

        // 0,9765 - 0,9764 = 0,00011111

        System.out.printf("Minimum der angegebenen Daten: %.16e\n", min(daten));
        System.out.printf("Maximum der angegebenen Daten: %.16e\n", max(daten));
        System.out.printf("Mittelwert der angegebenen Daten: %.16e\n", mittelWert(daten));
        System.out.printf("Streuung der angegebenen Daten: %.16e\n", streuung(daten));
        System.out.printf("Varianz der angegebenen Daten: %.16e\n", varianz(daten));
    }

    static double min(double[] daten){
        double minimum = daten[0];

        for (double v : daten) {
            if (v < minimum) {
                minimum = v;
            }
        }

        return minimum;
    }

    static double max(double[] daten){
        double maximum = daten[0];

        for (double v : daten) {
            if (v > maximum) {
                maximum = v;
            }
        }

        return maximum;
    }

    static double mittelWert(double[] daten){
        double mittelWert = 0;

        for (double v : daten) {
            mittelWert += v / daten.length;
        }

        return mittelWert;
    }

    static double streuung(double[] daten){
        double mittelWert = mittelWert(daten);
        double zwSumme = 0;

        for (int i = 0; i < daten.length; i++){
            zwSumme += Math.pow(daten[i] - mittelWert, 2);
        }
        return Math.sqrt(zwSumme / (daten.length - 1));
    }

    static double varianz(double[] daten){
        return Math.pow(streuung(daten), 2);
    }
}

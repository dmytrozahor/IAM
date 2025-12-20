package com.dmytrozah.iam.b7;

import java.util.Scanner;

/**
 * 1. Beschreiben Sie kurz das rekursive Verfahren "Divide and conquer".
 * Divide (Problem in kleinere zerlegen) → Conquer (löse die Probleme) → Combine (Lösungen zusammentun)
 * 2. Nennen Sie die vier Bestandteile, aus denen ein Methodenkopf besteht, und
 * erklären Sie kurz deren Funktionen.
 * Methodenkopf:
 * - Methodenname (wie sich die Funktion in Java bezeichnet),
 * - Zugriffsmodifikator (wie man auf die Funktion zugreifen kann),
 * - Rückgabetyp (was für einen Typ ergibt sich als Ergebnis),
 * - Parameterliste (Parameter und Datentypen)
 */

public class Praktikum7 {

    static void main() {
        final Scanner scanner = new Scanner(System.in);
        double x = 0;

        System.out.println("Geben Sie x ein: ");
        while (scanner.hasNextDouble() && (x = scanner.nextDouble()) >= 1) {
            double x0 = x - 1, z0 = 1;

            System.out.printf("x: %f\tln x: %.16f\n", x, Math.log(x));

            double rekurs = ln_rekurs(x0, z0), approx = ln_approx(x);

            double d_r = relativeError(Math.log(x), rekurs);
            double d_a = relativeError(Math.log(x), approx);

            System.out.printf("\t\t\tl_r: %.16f   d_r=%e\n", rekurs, d_r);
            System.out.printf("\t\t\tl_a: %.16f   d_a=%e\n", approx, d_a);
        }

        if (x <= 0) {
            System.err.println("x darf nicht negativ sein!");
            System.exit(1);
        }

        if (x > 0 && x < 1) {
            System.err.println("x muss groesser 1 sein!");
            System.exit(1);
        }
    }

    static double horner(double t, double[] p){
        double pT = 0;

        for (int i = p.length - 1; i >= 0; i--) {
            pT = pT * t + p[i];
        }

        return pT;
    }

    static double ln_approx(double x){
        double p0 = 2, p1 = 0.6704, p2 = 0.35370773, p3 = 0.48674609;
        double[] p = {p0, p1, p2, p3};

        double w = (x - 1) / (x + 1);

        return w * horner(w * w, p);
    }

    static double ln_rekurs(double x, double z){
        double xNext = (2 * x) / (1 + Math.sqrt(1 + z * x));
        double zNext = z / 2;
        if (x > xNext) {
            return ln_rekurs(xNext, zNext);
        }

        return x;
    }

    static double relativeError(double x, double y){
        return Math.abs((x - y) / x);
    }

}

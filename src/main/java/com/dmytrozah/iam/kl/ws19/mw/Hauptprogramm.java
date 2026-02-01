package com.dmytrozah.iam.kl.ws19.mw;

import java.util.Scanner;

public class Hauptprogramm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] feld = new int[n];

        for (int i = 0; i < feld.length; i++){
            feld[i] = scanner.nextInt();
        }

        System.out.printf("Iterativ: %e\n", Mittelwert.mittelwertIterativ(feld));
        System.out.printf("Rekursiv: %e\n", Mittelwert.mittelwertRekursiv(feld, feld.length));
    }
}

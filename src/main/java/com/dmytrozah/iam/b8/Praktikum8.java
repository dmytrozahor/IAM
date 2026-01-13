package com.dmytrozah.iam.b8;

import java.util.Arrays;
import java.util.Scanner;

/**
 * F1. Warum kann die Collatz-Folge zwischenzeitlich deutliche Vervielfachungen erreichen?
 * Die Collatz-Folge kann stark anwachsen, weil:
 * - der Schritt 3𝑛+1 Verdreifachung ist,
 * - die anschließenden Divisionen oft nicht ausreichen, das Wachstum sofort auszugleichen,
 * - und mehrere solche Schritte hintereinander auftreten können.
 */

public class Praktikum8 {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n < 0){
            System.err.println("Can't be less than zero.");
            System.exit(1);
        }

        int[] folge = new int[n];

        System.out.println(berechneCollatzFolge(11, 0, folge));
        System.out.println(Arrays.toString(folge));
    }

    static int berechneCollatzFolge(int N, int i, int[] folge){
        if (i == 0){
            folge[0] = N;
            return berechneCollatzFolge(berechneCollatzGlied(folge[0]), 1, folge);
        }

        if (folge.length <= i){
            return N;
        }

        folge[i] = N;

        return berechneCollatzFolge(berechneCollatzGlied(folge[i]), i+1, folge);
    }

    static int berechneCollatzGlied(int n){
        return n % 2 == 0 ? n / 2 : 3 * n + 1;
    }

    static int berechneMax(int[] array){
        return Arrays.stream(array).max().orElse(-1);
    }
}

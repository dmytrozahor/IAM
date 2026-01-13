package com.dmytrozah.iam.b9;

import java.util.Arrays;
import java.util.Scanner;

public class Praktikum9 {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];

        System.out.println("Geben Sie das Feld ein");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        Quicksort.sortieren(a, 0, a.length-1);
        System.out.println("Sortiert: " + Arrays.toString(a));
    }
}

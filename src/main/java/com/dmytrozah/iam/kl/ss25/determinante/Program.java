package com.dmytrozah.iam.kl.ss25.determinante;

import java.util.Scanner;

public class Program {

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[][] A = new double[n][n];
        double[][] L = new double[n][n];
        double[][] R = new double[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                A[i][j] = 1.0 / (i + j + 1);
            }
        }

        Determinante.decompose(A, L, R, n);
        System.out.printf("%.35e ist die Determinante\n", Determinante.determinant(L, n));
    }
}

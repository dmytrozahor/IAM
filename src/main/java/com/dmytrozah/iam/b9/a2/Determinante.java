package com.dmytrozah.iam.b9.a2;

import java.util.Scanner;

public class Determinante {

    static void main() {
        double[][] matrix = {
                {3, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        double[][] tableau = new double[3][5];
        double[] p = new double[3], n = new double[3];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                tableau[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < matrix.length; i++){
            for (int j = 3; j < 5; j++){
                tableau[i][j] = matrix[i][j-3];
            }
        }

        for (int i = 0; i < matrix.length; i++){
            p[i] = 1;
            n[i] = 1;

            for (int k = 0; k < matrix.length; k++) {
                p[i] *= tableau[k][i+k];
                n[i] *= tableau[2-k][i+k];
            }
        }

        double res = p[0] + p[1] + p[2] - (n[0] + n[1] + n[2]);

        System.out.printf("Determinante ist gleich %e\n", res);
    }
}

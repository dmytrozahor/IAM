package com.dmytrozah.iam.kl.ss25.determinante;

public class Determinante {

    public static void decompose(double[][] A, double[][] L, double[][] R, int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                double sum = 0;

                for (int k = 0; k < j; k++){
                    sum += L[i][k] * R[k][j];
                }

                L[i][j] = A[i][j] - sum;
            }

            for (int j = i + 1; j < n; j++){
                double sum = 0;

                for (int k = 0; k < i; k++) {
                    sum += L[i][k] * R[k][j];
                }

                R[i][j] = (A[i][j] - sum) / L[i][i];
            }
        }

    }

    public static double determinant(double[][] L, int n){
        double res = 1.0;

        for (int k = 0; k < n; k++){
            res *= L[k][k];
        }

        return res;
    }
}

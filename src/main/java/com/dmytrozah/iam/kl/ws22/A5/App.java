package com.dmytrozah.iam.kl.ws22.A5;

public class App {

    public static void main(String[] args) {
        for (int n = 2; n <= 5; n++){
            int[][] mat = new int[n][n];

            MatrixFunktionen.createMatrix(n, mat);
            MatrixFunktionen.ausgabe(mat);

            System.out.printf("%e norm \n", MatrixFunktionen.norm(mat, n));
        }
    }
}

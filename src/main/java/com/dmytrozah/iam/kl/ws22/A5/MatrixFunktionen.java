package com.dmytrozah.iam.kl.ws22.A5;

import java.util.Arrays;

public class MatrixFunktionen {

    public static int ueber(int n, int k){
        if (k == 0){
            return 1;
        }

        return ueber(n, k-1) * (n - k + 1) / k;
    }

    public static void createMatrix(int n, int[][] mat){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                int a = ueber(n+i, i);
                int b = ueber(n-1, n-j-1);
                int c = (a * b * n) / (i + j + 1);

                mat[i][j] = c;
            }
        }
    }

    public static void ausgabe(int[][] mat){
        int n = mat.length;

        for (int i = 0; i < n; i++){
            System.out.printf("mat[%d] = %s \n", i+1, Arrays.toString(mat[i]));
        }
    }

    public static double norm(int[][] mat, int n){
        double res = 0;

        for (int i = 0; i < n; i++){
            double zRes = 0;
            for (int j = 0; j < n; j++){
                zRes += mat[i][j] * mat[i][j];
            }

            res += zRes;
        }

        return Math.sqrt(res);
    }
}

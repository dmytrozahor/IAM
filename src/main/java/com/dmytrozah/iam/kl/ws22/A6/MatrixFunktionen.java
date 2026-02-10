package com.dmytrozah.iam.kl.ws22.A6;

public class MatrixFunktionen {

    public static double[] mult(double[][] A, double[] x){
        double[] res = new double[x.length];
        int n = x.length;

        for (int i = 0; i < n; i++){
            double sum = 0;

            for (int k = 0; k < n; k++){
                sum += A[i][k] * x[k];
            }

            res[i] = sum;
        }

        return res;
    }

    public static double[] substract(double[] v1, double[] v2){
        if (v1.length != v2.length){
            throw new IllegalArgumentException("v1 length != v2 length");
        }

        double[] res = new double[v1.length];

        for (int i = 0; i < v1.length; i++){
            res[i] = v1[i] - v2[i];
        }

        return res;
    }
}

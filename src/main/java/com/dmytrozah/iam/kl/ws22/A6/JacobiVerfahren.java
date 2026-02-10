package com.dmytrozah.iam.kl.ws22.A6;

import java.util.Arrays;

public class JacobiVerfahren {

    private double[][] M, D_inv;

    private double[] b;

    public JacobiVerfahren(double[][] A_, double[] b_) {
        this.b = b_;
        this.D_inv = new double[A_.length][A_.length];

        int n = A_.length;

        for (int i = 0; i < n; i++){
            this.D_inv[i][i] = 1.0   / A_[i][i];
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i == j){
                    continue;
                }

                this.D_inv[i][j] = 0;
            }
        }

        this.M = new double[A_.length][A_.length];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i == j){
                    this.M[i][j] = 0;
                    continue;
                }
                this.M[i][j] = A_[i][j];
            }
        }
    }

    public void run(double[] x0, int maxIt){
        double[] x_old = x0;
        double[] x_new;

        for (int i = 0; i < maxIt; i++){
            x_new = MatrixFunktionen.mult(D_inv, MatrixFunktionen.substract(b, MatrixFunktionen.mult(M, x_old)));

            System.out.printf("x_new = %s\n", Arrays.toString(x_new));

            x_old = x_new;
        }
    }
}

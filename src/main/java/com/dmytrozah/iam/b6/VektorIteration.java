package com.dmytrozah.iam.b6;

import java.util.Scanner;

public class VektorIteration {
    private final Scanner scanner = new Scanner(System.in);

    public double[] readVec(int dim){
        double[] u = new double[dim];

        for (int i = 0; i < dim; i++) {
            System.out.printf("u[%d] = ", i+1);
            u[i] = scanner.nextDouble();
            System.out.print("\n");
        }

        return u;
    }

    public double[][] readMat(int dim){
        double[][] a = new double[dim][dim];

        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.printf("a[" + (i + 1) + "][" + (j + 1) + "] = ");
                a[i][j] = scanner.nextDouble();
                System.out.print("\n");
            }
        }

        return a;
    }

    public void writeVec(double[] u){
        System.out.print("u = {");

        for (double v : u) {
            System.out.printf("%e ", v);
        }

        System.out.println("}");
    }

    public double[][] matPot(double[][] A, int dim, int n) {
        double[][] result = new double[dim][dim];
        double[][] base = A;

        for (int i = 0; i < dim; i++) {
            result[i][i] = 1;
        }

        for (int i = 0; i < n; i++) {
            result = matMult(result, base, dim);
        }

        return result;
    }

    public double[][] matMult(double[][] A, double[][] B, int dim) {
        double[][] c = new double[dim][dim];

        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                double sum = 0;
                for (int k = 0; k < dim; k++) {
                    sum += A[i][k] * B[k][j];
                }
                c[i][j] = sum;
            }
        }
        return c;
    }

    public double[] matVecMult(double[][] a, double[] b, int dim){
        double[] resB = new double[dim];

        for (int i = 0; i < dim; i++) {
            resB[i] = 0;
            for (int j = 0; j < dim; j++) {
                resB[i] += a[i][j] * b[j];
            }
        }

        return resB;
    }
}

package com.dmytrozah.iam.kl.ws22.A6;

public class App {

    public static void main(String[] args) {
        double[][] A = new double[][]{
            {2, -1, 0},
            {-1, 2, -1},
            {0, -1, 2}
        };

        double[] b = new double[]{
            3, 2, 1
        };

        double[] x0 = new double[]{1, 1, 1};

        JacobiVerfahren jv = new JacobiVerfahren(A, b);
        jv.run(x0, 100);
    }
}

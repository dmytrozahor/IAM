package com.dmytrozah.iam.b6;

import java.util.Scanner;

/**
 * stationärer Zustand:
 * u_n = (1/6, 1/3, 1/2)
 *
 * Fragen:
 * 1. Nennen Sie zwei iterative Verfahren zum Finden von Nullstellen von Funktionen und erklären Sie diese!
 *  a) Bisektionsverfahren ([a, b] mit f(a)*f(b) < 0, m = (a+b)/2, f(a)*f(m) < 0 => [a, m] sonst [m, b])
 *  b) Newton-Raphson-Verfahren (f - differenzierbar, x_0 - Startwert, f(x+1) = f(x) - f(x)/f'(x))
 *     Dafuer f'(x) ~ f(x+h)-f(x) / h (f muss nicht ~ 0 sein!)
 */

public class Praktikum6 {
    static final VektorIteration iteration = new VektorIteration();
    static final int DIM = 3;

    static void main(){
        final Scanner scanner = new Scanner(System.in);
        double[][] A = iteration.readMat(DIM);
        int n = 1;

        while (n >= 0){
            double[] u0 = iteration.readVec(DIM);

            n = scanner.nextInt();

            if (n > 0){
                double[][] A_n = iteration.matPot(A, DIM, n);
                double[] u = iteration.matVecMult(A_n, u0, DIM);
                iteration.writeVec(u);
            }
        }
    }
}

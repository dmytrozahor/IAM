package com.dmytrozah.iam.b3;

import java.util.Scanner;

public class P3 {

    static void main() {
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the upper limit: ");
        int n = scanner.nextInt();

/*        for (int c = 1; c <= n; c++) { //  1 <= c <= n
            for (int b = 1; b <= c; b++) { // 1 <= b <= c <= n
                for (int a = 1; a <= b; a++) { // 1 <= a <= b <= c <= n
                    if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)){
                        System.out.printf("(%d, %d, %d)\n", a, b, c);
                    }
                }
            }
        }*/

        for (int a = 1; a <= n; a++) {
            for (int b = a; b <= n; b++) {
                for (int c = b; c <= n; c++) {
                    if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)){
                        System.out.printf("(%d, %d, %d)\n", a, b, c);
                    }
                }
            }
        }

        System.out.println("The cycle is over.");
    }

}

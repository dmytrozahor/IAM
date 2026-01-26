package com.dmytrozah.iam.b9.a1;

public class Quicksort {

    public static void sortieren(final int[] a, int links, int rechts){
        if (links < rechts) {
            int m = a[links];

            int i = links;
            int j = rechts;

            while (i <= j){
                while (i <= j && a[i] < m){
                    i += 1;
                }

                while (i <= j && a[j] > m){
                    j -= 1;
                }

                if (i <= j){
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;

                    i += 1;
                    j -= 1;
                }
            }

            sortieren(a, links, j);
            sortieren(a, i, rechts);
        }
    }
}

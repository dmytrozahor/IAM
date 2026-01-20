package com.dmytrozah.iam.kl.ss25.isotope;

import java.util.Arrays;

public class Main {

    static void main() {
        Isotop i1 = new Isotop("Kohlenstoff-12", 12, 98.89, 0);
        Isotop i2 = new Isotop("Kohlenstoff-13", 12.003, 1.11, 0);
        Isotop i3 = new Isotop("Kohlenstoff-14", 14.003, Math.pow(10, -9), 5730);

        Isotop[] isotops = new Isotop[]{i1, i2, i3};

        i2.ausgeben();

        System.out.printf("\nKohlenstoff-14 nach dem Zerfall in %d Jahren ist: %e\n", 10_000, i3.zerfall(1, 10_000));
        i3.ausgeben();

        double summe = 0;

        for (Isotop isotop : isotops){
            summe += isotop.getAtommasse() * isotop.getHaeufigkeit();
        }

        System.out.printf("Durchschnitt ist gleich %.30e\n", summe / 100);
    }
}

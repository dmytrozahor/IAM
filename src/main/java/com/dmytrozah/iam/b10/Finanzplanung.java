package com.dmytrozah.iam.b10;

public class Finanzplanung {

    static void main(String[] args) {
        Portfolio portfolio = new Portfolio();
        Geldanlage[] anlagen = new Geldanlage[]{
                new Geldanlage(100, 2, 5, (double) 3 / 100),
                new Geldanlage(200, 4, 8, 2.5 / 100),
                new Geldanlage(150, 6, 9, 1.7 / 100)
        };

        for (Geldanlage geldanlage : anlagen){
            portfolio.add(geldanlage);
        }

        System.out.print("Jahr \t | Summe der Auszahlungen \n");
        for (int i = 1; i <= 10; i++){
            System.out.printf("%d \t " + portfolio.gesamtAuszahlung(i) + " \n", i);
        }
    }
}

package com.dmytrozah.iam.kl.ws19.em;

public class Hauptprogramm {

    public static void main(String... args) {
        Gruppenphase gruppenphase = new Gruppenphase(); // WHY CONSTRUCTOR IF ALL METHODS STATIC

        for (int i = 0; i < 6; i++){
            Team[] gruppe = gruppenphase.teilnehmer[i];

            for (int j = 0; j < 4; j++){
                for (int k = j+1; k < 4; k++){ // j+1 prevent spiel gg. sich selbst lol
                    gruppenphase.spiel(gruppe[j], gruppe[k]); // WHAT FOR did we make it static
                }
            }

            for (int j = 0; j < 4; j++){
                gruppe[j].punktezahlAusgeben();
            }
        }
    }
}

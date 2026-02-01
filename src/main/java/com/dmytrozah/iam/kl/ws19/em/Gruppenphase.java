package com.dmytrozah.iam.kl.ws19.em;

import java.security.SecureRandom;
import java.util.Scanner;

public class Gruppenphase {

    // Klassenvariable -> static (again what for but ok)
    public static Team[][] teilnehmer;

    static SecureRandom _random = new SecureRandom();
    static Scanner _scanner = new Scanner(System.in);

    public Gruppenphase(){
        this.teilnehmer = new Team[6][4];
        int teamNr = 1;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                teilnehmer[i][j] = new Team("Team " + teamNr);
                teamNr++;
            }
        }
    }

    // Klassenmethode -> static (what for, but ok)
    public static void spiel(Team TeamA, Team TeamB){
        // randomNumberBound 5 -> Ausgabe <= 4
        int toreTeamA = _random.ints(0, 5).findFirst().orElse(1);
        int toreTeamB = _random.ints(0, 5).findFirst().orElse(1);

        if (toreTeamA > toreTeamB){
            TeamA.punktezahlErhoehen(3);
        } else if (toreTeamA < toreTeamB) { // else-if!
            TeamB.punktezahlErhoehen(3);
        }

        if (toreTeamA == toreTeamB){
            TeamA.punktezahlErhoehen(1);
            TeamB.punktezahlErhoehen(1);
        }

        System.out.printf("Team A [%s] gg. Team B [%s] %d - %d \n", TeamA.name, TeamB.name, toreTeamA, toreTeamB);
    }
}

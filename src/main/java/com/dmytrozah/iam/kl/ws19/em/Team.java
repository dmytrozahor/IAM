package com.dmytrozah.iam.kl.ws19.em;

public class Team {

    public String name;

    private int punkte;

    public Team(String name){
        this.name = name;
        this.punkte = 0;
    }

    public void punktezahlAusgeben(){
        System.out.printf("Team %s [punkte=%d]\n", this.name, this.punkte);
    }

    public void punktezahlErhoehen(int n){
        this.punkte += n;
    }
}

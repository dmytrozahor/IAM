package com.dmytrozah.iam.kl.ss25.isotope;

public class Isotop {

    private String name;

    private double atommasse;

    private double haeufigkeit;

    private double haltwertszeit;

    public Isotop(String name, double atommasse, double haeufigkeit, double haltwertszeit){
        this.name = name;
        this.atommasse = atommasse;
        this.haeufigkeit = haeufigkeit;
        this.haltwertszeit = haltwertszeit;
    }

    public void ausgeben(){
        System.out.printf("Name %s Atommasse %e Haeufigkeit %e\n", this.name, this.atommasse, this.haeufigkeit);
    }

    public double zerfall(double N0, double t){
      return N(N0, t);
    }

    private double N(double N0, double t){
        return N0 * Math.exp(- lambda() * t);
    }

    private double lambda(){
        if (haltwertszeit == 0)
            return 0;

        return Math.log(2) / this.haltwertszeit;
    }

    public double getAtommasse() {
        return atommasse;
    }

    public double getHaeufigkeit() {
        return haeufigkeit;
    }

}

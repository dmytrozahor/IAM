package com.dmytrozah.iam.b10;

import java.util.Arrays;

public class Portfolio {

    private Geldanlage[] geldAnlagen;

    public Portfolio(Geldanlage... geldAnlagen) {
        this.geldAnlagen = geldAnlagen;
    }

    public void add(Geldanlage geldanlage) {
        Geldanlage[] neueAnlagen = new Geldanlage[this.geldAnlagen.length + 1];

        System.arraycopy(this.geldAnlagen, 0, neueAnlagen, 0, this.geldAnlagen.length);

        neueAnlagen[neueAnlagen.length - 1] = geldanlage;

        this.geldAnlagen = neueAnlagen;
    }

    public double gesamtAuszahlung(int t){
        return Arrays.stream(this.geldAnlagen)
                .mapToDouble(anlage -> anlage.auszahlung(t))
                .reduce(0, Double::sum);
    }
}

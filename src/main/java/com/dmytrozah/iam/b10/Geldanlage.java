package com.dmytrozah.iam.b10;

public class Geldanlage {
    private final long B;
    private final int t0, tEnd;
    private final double E;

    public Geldanlage(long b, int t0, int tEnd, double z) {
        this.B = b;
        this.t0 = t0;
        this.tEnd = tEnd;

        this.E = Math.pow((1 + z), tEnd - t0) * B;
    }

    public double auszahlung(int t){
        if (t == t0)
            return -B;

        return t == tEnd ? E : 0;
    }
}

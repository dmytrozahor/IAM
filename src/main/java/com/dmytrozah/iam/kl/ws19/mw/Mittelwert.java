package com.dmytrozah.iam.kl.ws19.mw;

public class Mittelwert {

    public static double mittelwertIterativ(int[] feld){
        double zRes = 0;

        for (int i = 0; i < feld.length; i++){
            zRes += feld[i];
        }

        return zRes / feld.length;
    }

    public static double mittelwertRekursiv(int[] feld, int n){
        if (n == 0){
            return feld[0];
        }

        double prevMittel = mittelwertRekursiv(feld, n-1);
        return prevMittel * ((n - 1.0) / n) + (double) feld[n - 1] / (n);
    }

}

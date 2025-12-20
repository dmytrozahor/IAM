package com.dmytrozah.iam.b2;

import java.util.Scanner;

public class P2 {

    static void main() {
        final Scanner scanner = new Scanner(System.in);

        final int travellers, daysBefore, kilometer;

        System.out.println("Fahrpreisermittlung");

        System.out.println("Wie viele Reisende?");
        travellers = validate(scanner.nextInt(), "Reisenden");

        System.out.println("Wie viele Tage bis zum Fahrtantritt?");
        daysBefore = validate(scanner.nextInt(), "Tagen von Fahrantritt");

        System.out.println("Wie viele Kilometer?");
        kilometer = validate(scanner.nextInt(), "Kilometer");

        final double price = calculatePrice(travellers, kilometer, daysBefore);

        System.out.println("Der Fahrpreis betraegt " + price + " Taler");
    }

    static int validate(final int kilometer, String type){
        if (kilometer <= 0 || kilometer >= Integer.MAX_VALUE-1) {
            System.err.println("ERROR: Ungueltige Zahl an " + type + "!");
            System.exit(1);
        }

        return kilometer;
    }

    static double calculatePrice(int travellers, int kilometer, int daysBefore){
        double price = 0.3*kilometer;
        double d1 = 0;

        if (daysBefore >= 1 && daysBefore < 3){
            d1 = 0.1;
        }

        if (daysBefore >= 3 && daysBefore < 7){
            d1 = 0.25;
        }

        if (daysBefore >= 7){
            d1 = 0.4;
        }

        if (travellers >= 1) {
            return price * (1 - d1) * (1.7 + (travellers - 2) * 0.5);
        }

        return price * (1 - d1);
    }
}

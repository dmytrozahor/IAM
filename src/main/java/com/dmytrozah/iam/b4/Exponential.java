/**
 * P4
 * F1. Welche Indizes besitzen das erste und das letzte Element eines Feldes in Java?
 * 0 und length-1
 * F2. Wieso ist das Verfahren für negative x-Werte ungeeignet? Erklären Sie.
 * Es haufen sich Fehler durch negative Ausdruecke an, die Formel funktioniert einfach nicht
 */

void main() {
    final Scanner sc = new Scanner(System.in);

    IO.print("Gib den Wert fuer x ein: ");
    final double x = sc.nextDouble();

    IO.print("Gib die obere Grenze ein: ");
    final long N = sc.nextLong();

    exp(x, N);
    expAbbruch(x, false);
    expAbbruch(x, true);

    System.out.printf("Wert der Math-Bibliothek: %e\n", Math.exp(x));
}

static void exp(double x, long N) {
    double summe = 0;

    for (long i = 0; i <= N; i++) {
        summe += expSummand(i, x, false);
    }

    System.out.printf("Der berechnete Wert der Exponenzfunktion nach %d Schritten: %.16e\n", N, summe);
}

static void expAbbruch(double x, boolean absolute) {
    double summeAlt, summe = 0;
    int i = 0;

    do {
        summeAlt = summe;
        summe += expSummand(i, x, absolute);
        i++;
    } while (Math.abs(summeAlt - summe) > 10E-13);

    if (absolute) {
        summe = x >= 0 ? summe : 1 / summe;

        System.out.printf("Verbesserter Wert der Exponenzfunktion fuer x-Werte " +
                        "nach %d Schritten mit Abbruch nach Genauigkeit: %.16e\n",
                i+1,
                summe
        );
    } else {
        System.out.printf("Der Wert der Exponenzfunktion nach %d Schritten mit " +
                        "Abbruch nach Genauigkeit: %.16e\n",
                i+1,
                summe
        );
    }
}


static double expSummand(long i, double x, boolean absolute) {
    if (i == 0)
        return 1;

    double canX = absolute ? Math.abs(x) : x;

    return (canX / i) * expSummand(i - 1, canX, absolute);
}

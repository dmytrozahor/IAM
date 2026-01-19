### IAM

#### English

This repository contains solutions to the assignments that arose from participation in the compulsory module IAM
(`Introduction to Computer Science & Algorithmic Mathematics`) at KIT (Karlsruhe Institute of Technology) in 2025.

The basic structure is organized as follows:

1. Each package `com.dmytrozah.iam.**` contains a Java class with the corresponding assignment description and its implementation.

2. Each package also includes a `README.md` file with a detailed description of the goals and, if applicable, the implementation steps.

#### Deutsch

Dieses Repository beinhaltet die Lösungen zu den Aufgaben, die sich aus der Teilnahme am Pflichtmodul IAM
(`Einstieg in die Informatik & algorithmische Mathematik`) an der Universität KIT im Jahr 2025
ergeben haben.

Die grundlegende Struktur ist wie folgt eingehalten:

1. Jeder Package `com.dmytrozah.iam.**` beinhaltet eine Java-Klasse mit der jeweiligen Aufgabestellung und der Implementation.
2. In jedem Package ist auch eine Datei `README.md` mit der detaillierten Beschreibung von Zielen und ggf. Implementierungsschritten eingeführt.

---

#### IAM-Finanzwesen (Geldanlage)

Im Finanzwesen versteht man unter einer Geldanlage eine Investition von Geldbeträgen, die nach einer gewissen Zeitspanne einen bestimmten Ertrag erzeulen soll. Wenn geeignete Anlageportfolios verglichen werden sollen, so spricht man von der übergeordneten Aufgabe es ist, ein objekt-orientiertes Java-Programm zu erstellen, mit dem die Auswirkung eines Anlageportfolios über einen Zeitraum von 10 Jahren verglichen werden kann.

##### Aufgabe (a): Geldanlage-Klasse

Erstellen Sie eine Objektklasse `Geldanlage`. Wir gehen davon aus, dass eine Anlage mit dem Startkapital $B$ in dem Anfangsjahr $t_0$ getätigt wird und danach bis zum Endjahr $t_{\text{end}}$ läuft. Der Ertrag über die gesamte Laufzeit $E$ der Geldanlage wird durch den Zinssatz $z$ bestimmt. Es gilt:

$$
E = (1 + z)^{t_{\text{end}} - t_0} B.
$$

Definieren Sie in der Klasse `Geldanlage` geeignete Instanzvariablen für diese Größen. Erstellen Sie einen Konstruktor, welcher Werte für die Instanzvariablen übergeben werden können.

##### Aufgabe (b): Auszahlungsfunktion

Die Auswirkung einer Geldanlage kann durch eine Auszahlungsfunktion $a(t)$ beschrieben werden, die für jedes Jahr $t$ die Kosten bzw. Auszahlung der Geldanlage zurückliefert. Es gilt:

$$
a(t) =
\begin{cases}
-B, & t = t_0, \\
E, & t = t_{\text{end}}, \\
0, & \text{sonst.}
\end{cases}
$$

Implementieren Sie eine solche Auszahlfunktion `auszahlung` in `Geldanlage`.

##### Aufgabe (c): Portfolio-Klasse

Erstellen Sie eine Objektklasse `Portfolio`, welche Ihre verschiedenen Geldanlagen bündelt und eine Auszahlfunktion über alle Anlagen bietet. Verwenden Sie zur Speicherung ein Array vom Typ `Geldanlage`. Initialisieren Sie im Konstruktor dieses Array durch geeignete Übergabeparameter. Implementieren Sie das Weiteren eine Funktion `add`, um weitere Geldanlagen diesem Array hinzuzufügen. Verwenden Sie dafür `System.arraycopy`. Schreiben Sie eine Methode `gesamtAuszahlung`, welche die Summe aller Auszahlungen über Ihre Geldanlagen für ein Jahr $t$ zurückgibt.

##### Aufgabe (d): Finanzplanung-Programm

Erstellen Sie ein Java-Programm mit dem Namen `Finanzplanung`. Erstellen Sie in der `main`-Methode Ihr Portfolio mit drei Geldanlagen mit folgenden Parametern:

| Anfangsjahr | Endjahr | Betrag | Zinssatz |
|-------------|---------|--------|----------|
| 2           | 5       | 100    | 3.0 %    |
| 4           | 8       | 200    | 2.5 %    |
| 6           | 9       | 150    | 1.7 %    |

Berechnen Sie anschließend für die Jahre $1, 2, 3, \ldots, 10$ die gesamten Auszahlungen Ihres Portfolios und geben diese aus. Sie sollten folgendes Ergebnis erhalten:

| Jahr | Summe der Auszahlungen |
|------|------------------------|
| 1    | 0.00                   |
| 2    | -100.00                |
| 3    | 0.00                   |
| 4    | -200.00                |
| 5    | 109.27                 |
| 6    | -150.00                |
| 7    | 0.00                   |
| 8    | 220.76                 |
| 9    | 157.78                 |
| 10   | 0.00                   |
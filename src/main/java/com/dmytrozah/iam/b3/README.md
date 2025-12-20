### IAM

#### English

This repository contains solutions to the assignments that arose from participation in the compulsory module IAM
(`Introduction to Computer Science & Algorithmic Mathematics`) at KIT (Karlsruhe Institute of Technology) in 2025.

The basic structure is organized as follows:

Each package `com.dmytrozah.iam.**` contains a Java class with the corresponding assignment description and its implementation.

Each package also includes a README.md file with a detailed description of the goals and, if applicable, the implementation steps.

#### Deutsch

Dieses Repository beinhaltet die Lösungen zu den Aufgaben, die sich aus der Teilnahme am Pflichtmodul IAM
(`Einstieg in die Informatik & algorithmische Mathematik`) an der Universität KIT im Jahr 2025
ergeben haben.

Die grundlegende Struktur ist wie folgt eingehalten:

1. Jeder Package `com.dmytrozah.iam.**` beinhaltet eine Java-Klasse mit der jeweiligen Aufgabestellung und der Implementation.
2. In jedem Package ist auch eine Datei README.md mit der detaillierten Beschreibung von Zielen und ggf. Implementierungsschritten eingeführt.

#### IAM-PB3 (Pythagoräische Tripel)

Ein Tripel (a, b, c), welches aus drei natürlichen Zahlen a, b und c besteht, wird ein pythagoräisches Tripel genannt, falls
`a^2 + b^2 = c^2`

(1) gilt. Schreiben Sie ein Java-Programm mit dem Namen PythagTripel, welches durch reines
Ausprobieren alle pythagoräischen Tripel bis zu einer oberen Grenze n findet. Gesucht sind also
alle Tripel (a, b, c), mit 1 ≤ a ≤ b ≤ c ≤ n, so dass die Gleichung (1) gilt. Gehen Sie beim Lösen
dieser Aufgabe wie folgt vor:

• Erstellen Sie in der Programmklasse zunächst eine main–Methode. Lesen Sie in dieser
Methode eine Zahl n vom Typ int von der Konsole ein und speichern Sie diese ab.

• Verwenden Sie drei ineinander geschachtelte for–Schleifen, um alle möglichen Werte für 
a, b und c zu durchlaufen. Prüfen Sie in der innersten Schleife mit einer if-Anweisung
jeweils nach, ob die Gleichung (1) erfüllt ist. Wenn ja, so geben Sie a, b und c auf der Konsole aus.

• Testen Sie Ihr Programm für verschiedene Werte von n.
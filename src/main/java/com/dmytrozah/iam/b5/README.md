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

#### IAM-PB5 (Statistik)

Erstellen Sie mit Java ein Programm mit dem Namen `Statistik`, welches für eine Folge von $n$ reellen Zahlen $x_0, \ldots, x_{n-1}$ das *Minimum*

$$
x_{\min} := \min\{x_0, x_1, \ldots, x_{n-1}\}, \tag{1}
$$

das *Maximum*

$$
x_{\max} := \max\{x_0, x_1, \ldots, x_{n-1}\}, \tag{2}
$$

den *Mittelwert*

$$
\overline{x} = \sum_{i=0}^{n-1} \frac{x_i}{n} \tag{3}
$$

sowie die *Streuung*

$$
s = \sqrt{\sum_{i=0}^{n-1} \frac{(x_i - \overline{x})^2}{n-1}} \tag{4}
$$

berechnet.
#### IAM

#### English

This repository contains the assignments that arose from participation in the compulsory module IAM
(`Introduction to Computer Science & Algorithmic Mathematics`) at KIT (Karlsruhe Institute of Technology) in 2025.

The basic structure is organized as follows:

Each package `com.dmytrozah.iam.**` contains a Java class with the corresponding assignment description and its implementation.

Each package also includes a README.md file with a detailed description of the goals and, if applicable, the implementation steps.

#### Deutsch

Dieses Repository beinhaltet die Aufgaben, die sich aus der Teilnahme am Pflichtmodul IAM 
(Einstieg in die Informatik & algorithmische Mathematik) an der Universität KIT im Jahr 2025 
ergeben haben.

Die grundlegende Struktur ist wie folgt eingehalten:

1. Jeder Package `com.dmytrozah.iam.**` beinhaltet eine Java-Klasse mit der jeweiligen Aufgabestellung und der Implementation.
2. In jedem Package ist auch eine Datei README.md mit der detaillierten Beschreibung von Zielen und ggf. Implementierungsschritten eingeführt.

#### IAM-PB4 (Berechnung der Exponentialfunktion)

In dieser Aufgabe sehen Sie am Beispiel der Exponentialfunktion, dass es schon bei der Umsetzung einfacher mathematischer Formeln erhebliche Genauigkeitsprobleme geben kann. Die Funktionswerte der Exponentialfunktion $e^x$ können aus der Reihendarstellung

$$
e^x = \sum_{i=0}^{\infty} \frac{x^i}{i!} = 1 + x + \frac{x^2}{2} + \frac{x^3}{6} + \ldots
$$

berechnet werden. Die Funktionswerte sollen durch endliche Summen

$$
e^x \approx S(N) := \sum_{i=0}^{N} \frac{x^i}{i!} = 1 + x + \frac{x^2}{2} + \frac{x^3}{6} + \ldots + \frac{x^N}{N!}
$$

angenähert werden. Die einzelnen Summanden $y_i := x^i/i!$ lassen sich dabei wie folgt berechnen:

$$
\begin{align}
y_0 &:= 1 \\
y_i &:= \frac{x}{i} y_{i-1} \quad, \quad i = 1, 2, \ldots
\end{align}
$$

Schreiben Sie ein Java-Programm, welches die Werte der Exponentialfunktion nach obigen Formeln berechnet. Legen Sie Ihren Berechnungen Variablen, welche Gleitkommazahlen speichern, zugrunde.
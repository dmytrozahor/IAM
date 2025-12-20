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

#### IAM-PB6 (Logarithmusberechnung)

###### Verfahren 1 (Rekursive Formeln)

Für einen reellen Wert $x > 1$ ergeben die mit der Rekursionsvorschrift

$$
\begin{align}
x_0 &:= x - 1, \\
z_0 &:= 1, \\
x_{n+1} &:= \frac{2 \cdot x_n}{1 + \sqrt{1 + z_n \cdot x_n}}, \\
z_{n+1} &:= \frac{z_n}{2}, \quad n = 0, 1, 2, \ldots
\end{align}
$$

berechneten $x_n$ eine monoton fallende Folge von Näherungswerten für $\ln x$, d. h. es gilt

$$
x_0 > x_1 > x_2 > \ldots \quad \text{mit} \quad \lim_{n \to \infty} x_n = \ln x.
$$

###### Verfahren 2 (Polynomapproximation)

Gegeben ist das Polynom

$$
p(t) = p_0 + p_1 \cdot t + p_2 \cdot t^2 + p_3 \cdot t^3
$$

mit den Koeffizienten

$$
p_0 = 2, \quad p_1 = 0.6704, \quad p_2 = 0.35370773 \quad \text{und} \quad p_3 = 0.48674609.
$$

Eine Approximation für $\ln x$ lässt sich dann durch den Ausdruck $w \cdot p(w^2)$ mit $w = \frac{x-1}{x+1}$ berechnen.
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

#### IAM-PB6 (Collatz-Problem)

Gegeben sei die Funktion
$$( g : \mathbb{N} \to \mathbb{N} )$$ mit

$$
g(n) =
\begin{cases}
\dfrac{n}{2}, & \text{für } n \text{ gerade}, \
3n + 1, & \text{für } n \text{ ungerade}.
\end{cases}
$$

Wir betrachten zu einem gegebenen Startwert ( N \in \mathbb{N} ) die Folge

$$
a_0 = N, \qquad
a_i = g(a_{i-1}) \quad \text{für } i = 1, 2, \ldots
\tag{1}
$$

Der Mathematiker **Lothar Collatz** (1910–1990) äußerte die Vermutung,
dass die Folge ( {a_i}_i ) immer in dem Zyklus

$$
4 ;\to; 2 ;\to; 1
$$

endet, unabhängig davon, mit welcher positiven natürlichen Zahl ( N ) man beginnt.

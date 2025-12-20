### IAM

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

#### IAM-PB6 (Populationsdynamik-Modell)

In einem Land haben alle Familien genau einen Sohn und eine Tochter, und jeder heiratet genau einmal. Ferner lässt sich die Bevölkerung in Generationen aufteilen. In der $n$-ten Generation gibt es $x_n$ Funktionäre, $y_n$ Arbeiter und $z_n$ Bauern. Ehefrauen gehören dem Stand ihres Mannes an. Funktionssöhne lehnen den Beruf ihres Vaters strikt ab und werden Arbeiter. Söhne von Arbeitern werden Bauern, während Bauernsöhne zu je einem Drittel den genannten drei Bevölkerungsgruppen angehören. Ist dieses System über viele Generationen hinweg stabil? Die mathematische Formulierung dieses einfachen Modells aus der Populationstheorie lautet wie folgt:

$$
u^{[n+1]} := \begin{pmatrix} x_{n+1} \\ y_{n+1} \\ z_{n+1} \end{pmatrix} = \begin{pmatrix} 0 & 0 & 1/3 \\ 1 & 0 & 1/3 \\ 0 & 1 & 1/3 \end{pmatrix} \begin{pmatrix} x_n \\ y_n \\ z_n \end{pmatrix} =: Au^{[n]}, \quad n = 0, 1, 2, \ldots
$$

Der Vektor $u^{[n]}$ repräsentiert hierbei die $n$-te Generation mit den Bevölkerungsgruppen $x_n$, $y_n$ und $z_n$. Die Matrix $A$ stellt die Umstrukturierung in der Gesellschaft dar. Die $n$-te Generation ergibt sich demnach durch $n$-maliges Multiplizieren der Matrix $A$ mit sich selbst und dem Produkt dieser Matrix mit dem Startvektor gemäß

$$
u^{[n]} = A^n u^{[0]}.
$$

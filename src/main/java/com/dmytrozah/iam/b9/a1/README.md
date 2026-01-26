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

#### IAM-Quicksort (Sortieralgorithmus)

Wir möchten eine $n$-elementige Menge ganzer Zahlen $\{a_1, \ldots, a_n\}$ der Größe nach sortieren. Das Grundprinzip des Verfahrens besteht darin, aus der gegebenen Menge ein geeignetes Element $m$ (den sog. *Pivot*) auszuwählen und anschließend mittels $m$ die ursprüngliche Menge in zwei Teilmengen $M_1$ und $M_2$ zu zerlegen, so dass

$$
x \leq m \text{ für alle } x \in M_1 \text{ und } m \leq y \text{ für alle } y \in M_2 \text{ gilt.}
$$

Nach dieser „Vorsortierung" lässt sich das ursprüngliche Problem auf das Sortieren der Teilmengen $M_1$ und $M_2$ reduzieren. Zusammengefügt er sortiert Teilmengen ergibt dann die gesamt sortierte Menge $(a_1, \ldots, a_n)$. Da beide Teilmengen auf dieselbe Art sortiert werden können, ergibt sich ein **rekursives** Sortierverfahren.

Ist eine unsortierte Folge $a_{links}, \ldots, a_{rechts}$ gegeben, so beschreibt folgendes Verfahren den Quicksort-Algorithmus mit deterministischem Pivot $m$:

##### Quicksort-Algorithmus (Pseudocode)

Falls $links < rechts$

```
Setze m := a_{links}

Setze i := links und j := rechts

Führe die folgenden Schritte durch, solange i ≤ j gilt
    - Solange a_i < m ist, erhöhe i um 1
    - Solange a_j > m ist, erniedrige j um 1
    - Falls i ≤ j gilt, vertausche a_i und a_j, erhöhe i und erniedrige j um 1

Sortiere a_{links}, ..., a_j
Sortiere a_i, ..., a_{rechts}
```

##### Implementierung in Java

Schreiben Sie ein Java-Programm welches die hier vorgestellte Form des quicksort-Algorithmus implementiert. Gehen Sie dazu folgendermaßen vor:

**1. Klasse `Quicksort` mit Hauptmethode:**

Erstellen Sie in einer öffentlichen Klasse `Quicksort` eine Methode `sortieren` ohne Rückgabewert, welcher als Argumente das zu sortierende Feld `a` vom Typ `int` und zwei Indizes `links` und `rechts` übergeben werden. Diese Methode soll nach oben Schema die Feldelemente `a[links], ..., a[rechts]` durch Vertauschungen der Größe nach sortieren. Dabei wird das Sortieren der beiden neuen Feldbeschnitte durch einen rekursiven Aufruf von `sortieren` erreicht.

**Hinweis:** In Java können die Elemente zusammengesetzter Datentypen (wie Felder oder Klassen) innerhalb einer Methode dauerhaft verändert werden, wenn sie als Argument übergeben würden – bei einfachen Datentypen wie `int` oder `double` ist dies nicht der Fall!

**2. Lesen und Sortieren der Elemente:**

Lesen Sie in der `main`-Methode der Klasse die Anzahl der zu sortierenden Elemente $n$ ein und legen Sie danach ein Feld `a` vom Typ `int` an. Füllen Sie das Feld mittels Benutzereingabe über die Konsole. Sortieren Sie das Feld mittels `sortieren` und geben Sie es anschließend auf der Konsole aus.
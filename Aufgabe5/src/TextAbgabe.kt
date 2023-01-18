/*
Schreibe hier deine Antwort hin.

Es gibt eine MutableListe namens fruechteListe mit 4 Früchten und eine Variable lieblingsFrucht welches den String Erdbeere abspeichert.
Die For-In-Schleife hat ein Iterator mit den Datentyp Int, dieser geht den Index 3,2,1,0 runter.
Wenn der Iterator in der FruechteListe auf die Banane trifft, dann wird die Variable Lieblingsfrucht zu Banane geändert.
Sobald die Schleife fertig durchlaufen ist, kommt danach eine println.

Output
Banane

 */


fun main() {
    val fruechteListe: MutableList<String> = mutableListOf("Zitrone", "Banane", "Ananas", "Trauben")
    var lieblingsFrucht: String = "Erdbeere"

    for (i in 3 downTo 0) {
        if (fruechteListe[i] == "Banane") {
            lieblingsFrucht = "Banane"
        }
    }
    println(lieblingsFrucht)
}
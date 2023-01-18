/*
Schreibe hier deine Antwort hin.

Es gibt eine Liste names guests, welches Strings beinhalten (6 Namen).
Die For-In-Schleife hat ein Iterator namens 'i' und den Datentyp Int und eine Range 0 bis 5 (guest.size ist 6 minus1 = 5).
Wenn der Iterator auf Lukas trifft wird 'Hey Lukas kommt!' geprinted.
Wenn der Iterator auf Keanu trifft wird 'Oh cool, Keanu ist auch dabei!' geprinted.
Wenn der Iterator auf Michael trifft wird 'Wie es Michael wohl geht?' geprinted.
Wichtig hierbei ist, dass der Iterator die Liste nacheinander geht und sich nicht nach der if funktion richtet.
Die If funktion spielt nur eine Rolle, sobald der Iterator die If Funktion erfüllt.

Output:
Oh cool, Keanu ist auch dabei!
Wie es Michael wohl geht?
Hey Lukas kommt!

 */

fun main() {
    val guests = listOf<String>("Paul", "Keanu", "Michael", "Hans", "Lukas", "Marko")
    for (i in 0..guests.size - 1) {
        if (guests[i] == "Lukas") {
            println("Hey Lukas kommt!")
        }
        if (guests[i] == "Keanu") {
            println("Oh cool, Keanu ist auch dabei!")
        }
        if (guests[i] == "Michael") {
            println("Wie es Michael wohl geht?")
        }
    }
}

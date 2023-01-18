/*
Schreibe hier deine Antwort hin.

In der Aufgabendatei befindet sich eine Liste mit den Namen books, die 4 Bücher enthält.
In der For-Schelife ist ein Iterator mit dem Datentyp Int, der in einer Range von 0 bis 3 (index) schaut.
Dann kommt eine Variable welches das Buch abspeichert
println Das buch an der stelle 0 bis 3 ist das Buch so und so

Output:
Das Buch an der Stelle 0 ist Harry Potter
Das Buch an der Stelle 1 ist Herr der Ringe
Das Buch an der Stelle 2 ist Dune
Das Buch an der Stelle 3 ist Eragon
println Das waren alle Buecher

 */

fun main() {
    val books: List<String> = listOf("Harry Potter", "Herr der Ringe", "Dune", "Eragon")
    for(i in 0..books.size-1) {
        val book = books[i]
        println("Das Buch an der Stelle $i ist $book.")
    }
    println("Das waren alle Buecher")
}
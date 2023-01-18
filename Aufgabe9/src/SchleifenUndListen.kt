fun main() {
    val satz: List<String> = listOf("Tag ", "schöner ", "sehr ", "ein ", "ist ", "Heute ")

    // Aufgabe 9a: Gib den Inhalt der Liste rückwärts in der Konsole aus. 👍🏻

//    for (i in satz.size-1 downTo 0)
//        println(satz[i])
//
//    for (i in satz.reversed())
//        println(i)

    // Aufgabe 9b: Gib den Inhalt der Liste noch einmal rückwärts in der Konsole aus. Diesmal allerdings nur jedes zweite Wort.
    // noch nicht richtig gelöst ( Heute ein schöner - ist sehr Tag)

//    for (i in satz.size-1 downTo 0 step 2)
//        println(satz[i])

    // Aufgabe 9c: Gib den Inhalt der Liste noch einmal rückwärts in der Konsole aus. Allerdings nur die ersten 3 Wörter. 👍🏻

    for (i in satz.size-1 downTo 3)
        println(satz[i])



}
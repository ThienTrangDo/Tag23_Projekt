/*
Schreibe hier deine Antwort hin.

Es gibt eine Liste namens weekDays und sie beinhaltet die Tage Montag bis Sonntag.
Dann kommt eine For-In-Schleife welches den Iterator day hat, dieser Iterator schaut sich alle Wörter in der Liste weekDays an.
Wenn der Iterator day Samstag findet ODER den Sonntag dann println am day hab ich frei.
Andernfalls wenn der Iterator nicht Sáuf Samstag oder Sonntag trifft println am day muss ich arbeiten

Output:
am Montag muss ich arbeiten.
am Dienstag muss ich arbeiten.
am Mittwoch muss ich arbeiten.
am Donnerstag muss ich arbeiten.
am Freitag muss ich arbeiten.
am Samstag hab ich frei.
am Sonntag hab ich frei.

 */

fun main() {
    val weekDays: List<String> = listOf(
        "Montag", "Dienstag", "Mittwoch",
        "Donnerstag", "Freitag", "Samstag", "Sonntag"
    )
    for (day in weekDays) {
        if (day == "Samstag" || day == "Sonntag") {
            println("am $day hab ich frei.");
        } else {
            println("am $day muss ich arbeiten.");
        }
    }
}
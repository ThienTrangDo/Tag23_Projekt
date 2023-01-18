import kotlin.random.Random


fun main() {
    var computerGuess = Random.nextInt(1, 100)


    do {
        println("Errate welche Zahl der Computerspieler hat:")
        var meineZahl = readln().toInt()
        if (computerGuess < meineZahl) {
            println("Zu groß!")
        } else if (computerGuess > meineZahl){
            println("Zu klein!")
        } else if (computerGuess == meineZahl){
            println("Du hast gewonnen. Die Zahl vom Computer war die $computerGuess")
        }
    } while (computerGuess != meineZahl)

}

/*
b)

Zähle jetzt zusätzlich auch die Anzahl an Versuche, die der Spieler gebraucht hat,
bis er die Zahl des Computers erraten konnte.

c)

Sei kreativ und erweitere dein Spiel wie du möchtest und mach es somit einzigartig.

 */
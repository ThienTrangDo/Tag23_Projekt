/*
Schreibe hier deine Antwort hin.

Es gibt eine Liste namens 'speedLimits' und es hat 5 Integer-Zahlen.
Die For-In-Schleife hat ein Iterator namens 'i' vom Datentyp Inter, und geht eine Range durch von 0 bis 4. (speedLimits.size = 5 - 1 = 4)
Wenn der 'i' die 30 trifft dann kommt prinln: auf der 0. Strasse kann man 30 km/h fahren.
Wenn der 'i' die 80 trifft dann kommt prinln: auf der 2. Strasse kann man 80 km/h fahren.
Wenn der 'i' die 120 trifft dann kommt prinln: auf der 4. Strasse kann man 120 km/h fahren.
Der Iterator geht nun in der For-In-Schleife jeden Index von 0 bis 4 durch.

Output:
auf der 0. Strasse kann man 30km/h fahren.
auf der 2. Strasse kann man 80km/h fahren.
auf der 4. Strasse kann man 120km/h fahren.

 */

fun main() {
    val speedLimits: List<Int> = listOf(30, 50, 80, 100, 120)
    for (i in 0..speedLimits.size - 1) {
        if (speedLimits[i] == 30) {
            println("auf der " + i + ". Strasse kann man " + speedLimits[i] + "km/h fahren.")
        } else if (speedLimits[i] == 80) {
            println("auf der " + i + ". Strasse kann man " + speedLimits[i] + "km/h fahren.")
        } else if (speedLimits[i] == 120) {
            println("auf der " + i + ". Strasse kann man " + speedLimits[i] + "km/h fahren.")
        }
    }
}
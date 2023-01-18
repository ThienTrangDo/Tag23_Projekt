/*
Schreibe hier deine Antwort hin.

Es gibt eine Liste namens brands, welches 4 Marken enthält.
In der For-In-Schleife ist der Iterator ein Int und der gehte eine Range von 2 bis 3 durch von der Liste brands.
    (brands.size-1 ist 3, denn die size von der Liste ist 4)

Output:
PH
Microsoft

 */

fun main() {
    val brands: List<String> = listOf("Samsung", "Apple", "PH", "Microsoft")
    for (i in 2..brands.size - 1) {
        println(brands[i])
    }
}

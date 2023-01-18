fun main() {
    val shoppingList: MutableList<String> = mutableListOf(
        "Reis", "Tofu", "Brokkoli", "Nudeln", "Apfelsaft",
        "Zitronen", "Eis", "Erdbeeren", "Torte"
    )

/*    // Erster Versuch:
    for (i in 0 until shoppingList.size)
        println("$i. ${shoppingList[i]}")

    // Zweiter Versuch:
    for (i in 0 until shoppingList.size){
        if (shoppingList[i] == "Reis") {shoppingList[i]= "1. Reis"}
        if (shoppingList[i] == "Tofu") {shoppingList[i]= "2. Tofu"}
        if (shoppingList[i] == "Brokkoli") {shoppingList[i]= "3. Brokkoli"}
        if (shoppingList[i] == "Nudeln") {shoppingList[i]= "4. Nudeln"}
        if (shoppingList[i] == "Apfelsaft") {shoppingList[i]= "5. Apfelsaft"}
        if (shoppingList[i] == "Zitronen") {shoppingList[i]= "6. Zitronen"}
        if (shoppingList[i] == "Eis") {shoppingList[i]= "7. Eis"}
        if (shoppingList[i] == "Erdbeeren") {shoppingList[i]= "8. Erdbeeren"}
        if (shoppingList[i] == "Torte") {shoppingList[i]= "9. Torte"}
    }
    println(shoppingList)*/

    // Dritter Versuch - immer noch nicht richtig.

    for (essen in 0 until shoppingList.size) {
        var name = shoppingList[essen]
        var indexZuString = essen.toString()
        shoppingList[essen] = indexZuString + name
        //println("${essen.toString()}. $name")

    }
    println(shoppingList)

}

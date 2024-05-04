package programmingLogic/*
 val = imutavel
 var = mutável
 */

fun main() {
    var name = "João"
    name = "$name Marcos"
    val age = 30
    val pib = 1869000000000
    val pop = 211000000

    println("$name $age")
    println("Total PIB per Capita: ${pibPerCapta(pib, pop)}")

    println("Média total = ${media(5, 5, 5, 5)}")

}

fun media(vararg nota: Int): Float {
    var total = 0f
    for (n in nota) {
        total += n
    }
    return total / nota.size
}

fun pibPerCapta(pib: Long, pop: Int): Long = pib / pop




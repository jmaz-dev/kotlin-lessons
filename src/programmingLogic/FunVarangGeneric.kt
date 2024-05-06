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

    println("Média total = ${media(5, 5f, 5f, 5f, false, "Yes")}")

}

fun <J, T> media(abc: J, cdb: Float = 0f, vararg nota: T): Float {
    var total = 0f
    var totalMedia = 0
    for (n in nota) {
        if (n is Float) {
            total += n
            totalMedia++
        }
    }
    return total / totalMedia
}

fun pibPerCapta(pib: Long, pop: Int): Long = pib / pop




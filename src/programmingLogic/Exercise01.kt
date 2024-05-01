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

}

fun pibPerCapta(pib: Long, pop: Int): Long = pib / pop




package listAndCollections
//Não permite valores duplicados

fun main() {
    val set1: Set<String> = setOf<String>("Paris", "Berlim", "Madrid", "Madrid")
    val set2: MutableSet<String> = mutableSetOf<String>()

    println(set1)
    set2.add("Paris")
    set2.remove("Paris")
    set2.contains("Paris")
    set2.size
    set2.clear()
}

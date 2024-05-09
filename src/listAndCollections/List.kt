package listAndCollections

fun main() {
    val lst1: List<Int> = listOf(1, 2, 3, 4, 5)
    val lst2: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

    lst2.set(0, 0)
    lst2.add(6)
}
package listAndCollections

fun main() {
    val map1: Map<String, String> = mapOf<String, String>(Pair("França", "Paris"), Pair("Alemanha", "Berlim"))
    val map2: MutableMap<String, String> =
        mutableMapOf<String, String>(Pair("França", "Paris"), Pair("Alemanha", "Berlim"))

    println(map1.size)
    println(map1.entries)
    println(map1.values)

    map2.put("Brasil", "Brasilia")
    map2.remove("Brasil")
    map2.containsKey("Brasil")
    map2.clear()
    map2.replace("Fraça", "Paris", "París")

}
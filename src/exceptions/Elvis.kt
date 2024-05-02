package exceptions

fun main() {
    var str: String? = null

    // Verificação padrão
    if (str == null) println("Nulo") else println(str)

    println(str ?: "NULO")


    // TODO Não existe operador ternário em Kotlin

}
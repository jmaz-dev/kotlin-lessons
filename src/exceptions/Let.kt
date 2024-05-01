package exceptions

fun main() {

    var str: String? = null

    // O bloco dentro do let só é executado se o valor é diferente de nulo
    // O bloco let cria algo chamado "scope function" que é basicamente um escopo específico
    // para o objeto referenciado, no caso "str".
    // Dentro do bloco let, a referência ao objeto passa a ser "it".
    str?.let {
        println("Scope function")
        str = it.uppercase()
        it.length
        println(str)
    }
}
fun main() {
    val nome = "son"
    val sobrenome = "goku"

    val name = fun() {
        println("Olá world!${Double.MAX_VALUE}, ${Double.MIN_VALUE}")
        println("Olá $nome $sobrenome")
    }

    name.invoke()
}
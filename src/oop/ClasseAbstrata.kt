package oop

abstract class Selvagem {
    abstract fun atacar()
}

abstract class Mamiferos(nome: String) {
    fun comer() {}
    fun dormir() {}

    abstract fun falar()
}

class Cachorro(nome: String) : Mamiferos(nome) {
    override fun falar() {
        println("au")
    }

}

fun main() {
    val c: Cachorro = Cachorro("Caramelo")
    c.falar()
}
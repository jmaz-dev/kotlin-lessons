package oop

open class Eletronico(var marca: String) {
    private fun corrente(ativo: Boolean) {}

    fun ligar() {
        corrente(true)
    }

    open fun desligar() {
        corrente(false)
    }
}

/* Resumindo, o comportamento do eletrônico é
mantido e o computador vai adicionar o save antes de desligar */

class Computador(marca: String) : Eletronico(marca) {
    fun save() {}

    override fun desligar() {
        save()
        super.desligar()
    }

    //    overload(sobrecarga)
    fun save(a: Int) {}
    fun save(a: Float) {}
    fun save(a: Double) {}
    fun save(a: String) {}
    fun save(a: Int, b: Float) {}
}

fun main() {
    val c: Computador = Computador("DELL")

    c.save()
    c.ligar()
    c.desligar()
}
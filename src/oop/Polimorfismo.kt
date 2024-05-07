package oop

interface Funcionario {
    var salario: Float
    fun bonus(): Float
}

class Gerente(override var salario: Float) : Funcionario {
    override fun bonus(): Float {
        return salario * 0.4f
    }
}

class Analista(override var salario: Float) : Funcionario {
    override fun bonus(): Float {
        return salario * 0.2f
    }
}

fun mostrarBonus(f: Funcionario) {
    println(f.bonus())
}

fun main() {

    mostrarBonus(Analista(5000f))
    mostrarBonus(Gerente(10000f))
}
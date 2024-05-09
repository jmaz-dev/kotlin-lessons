package oop

fun main() {
    val f1: Forma = Forma(5, 10)
    val f2: Forma = Forma(5, 10)

    val fd1: FormaData = FormaData(5, 10)
    val fd2: FormaData = FormaData(5, 10)

//    Classe não consegue igualar valores, apenas editando o retorno de equals
    println(f1.equals(f2))
    println(fd1.equals(fd2))

    println(f1.hashCode())
    println(fd1.hashCode())

    endereco(Endereco("Venezuela", 22345854, "RJ"))
}

class Forma(val a: Int, val b: Int) {
    override fun equals(other: Any?): Boolean {
        return if (other is Forma) {
            (other.a == this.a && other.b == this.b)
        } else false
    }

    override fun hashCode(): Int {
        var result = a
        result = 31 * result + b
        return result
    }

}

data class FormaData(val a: Int, val b: Int)
data class Endereco(val street: String, val zipcode: Int, val city: String)

fun endereco(e: Endereco) {}
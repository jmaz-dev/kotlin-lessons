package oop

class Pessoa(val anoNascimento: Int, var name: String) {
    private var publico = ""

    init {
        publico = if (anoNascimento > 2000) {
            "Jovem"
        } else if (anoNascimento < 2000 && anoNascimento > 1980) {
            "Adulto"
        } else {
            "Maduro"
        }
    }

    fun tipoDePublico() {
        println(publico)
    }


    private var doc: String? = null

    constructor(anoNascimento: Int, name: String, doc: String) : this(anoNascimento, name) {
        this.doc = this.doc ?: doc
    }

    var olhos: String = ""

    fun dormir() {
        olhos = "fechados"
        println(olhos)
    }

    fun acordar() {
        println(doc)
    }
}

fun main() {
    Pessoa(1995, "Ciclano").tipoDePublico()


    val pessoa = Pessoa(2000, "Fulano", "322123")

    println(pessoa.anoNascimento)

    pessoa.name

    pessoa.dormir()

    pessoa.acordar()

//    println(pessoa.olhos)


}
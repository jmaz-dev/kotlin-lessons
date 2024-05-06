package oop

enum class Prioridades(val nivel: Int) {
    baixa(1) {
        override fun toString(): String {
            return "Nível baixo: $nivel"
        }
    },
    media(5),
    alta(15)
}

fun main() {

    for (p in Prioridades.values()) {
        println(p)
    }
}
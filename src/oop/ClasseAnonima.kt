package oop

interface Event {
    fun OnSuccess()
}

class Programa {
    fun salvar(e: Event) {
        println("Abrir conexões")
        println("Salvar dados")
        println("Sucesso. Fechar conexões")
        e.OnSuccess()
    }
}

/*class Evento : Event {
    override fun OnSuccess() {
        println("Sucesso.")
    }
}*/

fun main() {
    val p = Programa()
//    val e = Evento()
    p.salvar(object : Event {
        override fun OnSuccess() {
            println("Sucesso.")
        }

    })
}
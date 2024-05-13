package ClasseAnonimaLambida

interface EventListener {
    fun click()
}

class Form {
    fun clickJava(e: EventListenerJava) {}
    fun clickKotlin(e: EventListener) {}
}

class Main {
    private val name = ""

    fun main() {
        /*Lambda*/
        Form().clickJava { TODO("Not yet implemented") }
        /*Classe Anonima*/
        Form().clickKotlin(object : EventListener {
            override fun click() {
                TODO("Not yet implemented")
            }

        })
    }
}
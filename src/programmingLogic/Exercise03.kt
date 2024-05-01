package programmingLogic

fun main() {
    /*setBonus(4000.32F, "Gerente", 2)*/
    /* operations()*/

    val cargo = readln()

    if (cargo != null && cargo != "")
        println(bonusWhen(cargo))
}

fun setBonus(sal: Float, ocpt: String, exp: Int) {
    var bonus: Float = 0.0f


    bonus = if (ocpt == "Estagiário") {
        (sal + 500.00).toFloat()
    } else if (ocpt == "Engenheiro de software")
        (sal + 1000.00).toFloat()
    else if (ocpt == "Coordenador")
        if (exp < 1) {
            (sal + 1500.00).toFloat()
        } else (sal + 1800.00).toFloat()
    else if (ocpt == "Gerente")
        if (exp < 2) {
            (sal + 2000.00).toFloat()
        } else (sal + 3000.00).toFloat()
    else return println("Cargo não encontrado")

    println("Seu salario com o bonus anual é de: ${String.format("%.2f", bonus)}")
}

fun bonusWhen(cargo: String): Float {
    return when (cargo) {
        "Gerente" -> 2000f
        "Coordenador" -> 1800f
        "Engenheiro de software" -> 1000f
        "Estagiário" -> 500f

        else -> 0f
    }

}


fun operations() {
    val a: Boolean = false
    val b: Boolean = false
    val c: Boolean = true
    val d: Boolean = true

    fun a() {
        if (a && b && c && d)
            return println("a: true") else println("a: false")
    }

    fun b() {

        if (!a && !b && (c && d))
            return println("b: true") else println("b: false")
    }

    fun c() {

        if (a && ((b || c) || d))
            return println("c: true") else println("c: false")
    }

    fun d() {

        if (a || ((!b && c) || !d))
            return println("d: true") else println("d: false")
    }
    a()
    b()
    c()
    d()
}
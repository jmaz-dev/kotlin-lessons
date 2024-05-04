package programmingLogic

import java.util.*

fun main() {
    /*isTriangle()*/
    smartDoor()
}

fun isSquare() {
    println("Digite a altura do quadrilátero:")
    val altura = readln()
    println("Digite a largura do quadrilátero:")
    val largura = readln()

    /*blank = " " (whitespace)*/
    if (altura.isNotBlank() && largura.isNotBlank()) {
        largura.toInt()
        altura.toInt()
        if (altura == largura)
            println("Sou um quadrado!")
        else println("Sou um retângulo!")
    }
}

fun isTriangle() {
    println("Digite o valor lado esquerdo do triângulo:")
    val esquerdo = readln()
    println("Digite o valor lado direito do triângulo:")
    val direito = readln()
    println("Digite o valor lado direito do triângulo:")
    val base = readln()

    /*blank = " " (whitespace)*/
    if (esquerdo.isNotBlank() && direito.isNotBlank() && base.isNotBlank()) {
        val x = esquerdo.toInt()
        val y = direito.toInt()
        val z = base.toInt()

        if (x == y && y == z)
            println("Sou um triângulo equilátero")
        else println("Sou um triângulo")
    }
}

fun smartDoor() {
    println("Digite sua idade:")
    val idade = readln()
    if (idade.isNotBlank()) {
        if (idade.toInt() >= 18) {
            println("Digite o tipo de cupom:")
            var cupom = readln()

            if (cupom.isNotBlank()) {
                cupom = cupom.uppercase(Locale.getDefault())

                if (cupom == "COMUM" || cupom == "PREMIUM" || cupom == "LUXO") {
                    println("Digite o código do cupom:")
                    var codigo = readln()

                    if (codigo.isNotBlank()) {
                        codigo = codigo.uppercase(Locale.getDefault())

                        if ((cupom == "PREMIUM" || cupom == "LUXO" && codigo.startsWith("XL")) ||
                            (cupom == "COMUM" && codigo.startsWith("XT"))
                        ) {
                            println("Welcome :)")
                        } else println("Negado. Código do convite inválido")
                    } else println("Negado. Digite um código válido")
                } else println("Negado. Convite inválido")
            } else println("Negado. Digite um valor válido")
        } else println("Negado. Menores de idade não são permitidos")
    } else println("Negado. Digite uma idade válida")
}
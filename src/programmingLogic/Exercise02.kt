package programmingLogic

import java.util.*
import kotlin.math.pow

fun main() {
    getYear(1)
    getLength("Jose Claudio")
    getCubed(3)
    toKm(132f)
    getLetterChange("aAaAAAaaaAA not null")
}

fun getYear(y: Int) {
    val t1: String
    t1 = if (y > 1) "anos equivalem" else "ano equivale"
    println("$y $t1 a: ")
    println("${getFullYear(y)[0]} meses ")
    println("${getFullYear(y)[1]} dias ")
    println("${getFullYear(y)[2]} horas ")
    println("${getFullYear(y)[3]} minutos ")
    println("${getFullYear(y)[4]} segundos ")
    getFullYear(y)
}

fun getFullYear(y: Int): IntArray {
    val month = y * 12
    val day = y * 30
    val hour = day * 24
    val minute = hour * 60
    val second = minute * 60

    return intArrayOf(month, day, hour, minute, second)
}

fun getLength(value: String) = println("Total de caracteres em $value: ${value.length.toInt()}")


fun getCubed(value: Int) =
    println("O quadrado de $value é: ${value.toDouble().pow(3.0).toInt()} ou ${value * value * value}")


fun toKm(miles: Float) =
    println("Em kilômetros: ${String.format("%.3f", miles * 1.6)}")

fun getLetterChange(value: String) {
    val replaceTxt = value.lowercase(Locale.getDefault()).trim().replace('a', 'x')

    println("Novos caracteres: ${replaceTxt.uppercase(Locale.getDefault())}")

}
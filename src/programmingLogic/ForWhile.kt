package programmingLogic

import java.util.*

fun main() {
    /*   var str = "qwdwqwafddwad"
       var i = 0
           while (i < str.length) {
               println("${str[i]}")
               i++
           }


           do {
               println("$i ")
               i += 2
           } while (i < 10)

           do {
               println("Qual o seu nome?")
              var value = readln()
           } while (value.isNullOrBlank())

       /   while (i < 20) {

               if (i < 8) {
                   i++
                   continue
               }
               println("$i")
               i++
           }
         while (i < str.length) {

               println("${str[i]}")
               if (str[i] == 'f') {
                   break
               }
               i++
           }*/

    challenge()
}

//Exercises FOR
fun contaCrescente() {
//     1
//     for (i in 1..50) println(i)
//     3
    for (i in 1..50) {
        if (i % 5 == 0) {
            continue
        }
        print("$i ")
    }
}

fun contaDecrescente() {
//    2
    for (soma in 50 downTo 1) println(soma)
}

fun somaUmQuinhetos() {
//    4
    var soma = 0
    for (i in 1..500) {
        soma += i
    }
    println(soma)
}

fun escadaDeHash(n: Int) {
//    5
    var hash = ""
    for (i in 1..n) {
        hash += "#"
        println(hash)
    }
}

//Exercises WHILE
fun cxDagua() {
    val capCaixa = 2000
    val capBalao = 7
    var cont = 0
    var numBaloes = 0

    while (capCaixa > cont + capBalao) {
        cont += capBalao
        numBaloes++
    }
    println(numBaloes)
}

fun fizzBuzz() {
    var i = 1
    while (i < 51) {
//        pode ser simplificado multiplicando os números divisíveis
//        if (i % 3 == 0 && i % 5 == 0)
        if (i % 15 == 0) {
            println("FizzBuzz")
        } else if (i % 3 == 0) {
            println("Buzz")
        } else if (i % 5 == 0) {
            println("Fizz")
        } else
            println("$i")
        i++
    }
}

fun reverseName(name: String) {
    var i = name.length - 1

    do {
        print(name[i])

        i--
    } while (i != -1)
}

fun isXO(s: String) {
    val str = s.lowercase(Locale.getDefault())
    println(str)
    var i = 0
    var countX: Int = 0
    var countO: Int = 0

    if (str.isBlank()) {
        return println(false)
    }

    while (i < str.length) {
        if (str[i] == 'x') {
            countX++
        } else if (str[i] == 'o') {
            countO++
        } else {
            return println(false)
        }

        i++
    }
    val result = countX == countO
    println(result)
}

//CHALLENGE
fun challenge() {
    var patAna: Double = 0.0
    var patPaula: Double = 0.0
    var i = 0
    do {
        patAna += 500 * 2 + patAna * 0.002
        patPaula += 500 + patPaula * 0.008
        i++
    } while (patAna > patPaula)
    println("Rendimentos: ANA: ${patAna * 0.008} ----------------- PAULA:${patPaula * 0.002} ")
    println(
        "ANA(Empresa): ${String.format("%.2f", patAna)} , PAULA(Próprio): ${
            String.format(
                "%.2f",
                patPaula
            )
        }, Meses: $i"
    )
}
package oop

class Animal(var especie: String) {
    var fala: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
        }


}

fun main() {
    var a = Animal("cachorro")
    a.fala = "auuu"
    println(a.fala)

}
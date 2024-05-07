package oop

class Matt {
    companion object Meths {
        val PI = 3.14f
        fun teste() {}
    }

    object obj1 {
        val PI = 3.14f
        fun teste() {}
    }

    object obj2 {
        val PI = 3.14f
        fun teste() {}
    }

    val Longitude = 0.0000
}

fun main() {
    Matt.PI
    Matt.teste()

    val m: Matt = Matt()
    
    Matt.obj1.PI
    Matt.obj2.PI

    m.Longitude
}
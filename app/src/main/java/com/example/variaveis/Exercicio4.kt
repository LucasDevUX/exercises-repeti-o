package com.example.variaveis

class Exercicio4 {
}

fun main() {
    var array: IntArray = IntArray(40)
    var i = 0

    for (i in array.indices)
        println(i)

    // Exercicio 5
    val lista = mutableListOf<Int>()

    for (i in 1..99) {
        lista.add(i)
    }
    println(lista)

    // Exercicio 6
    var soma = 0
    while (soma < 99){
println("soma: $soma")
        soma = soma + 1
    }


}

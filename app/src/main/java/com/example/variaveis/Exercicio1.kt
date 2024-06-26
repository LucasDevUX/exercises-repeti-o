package com.example.variaveis

class Exercicio1 {
}

fun main() {
    var numero = 6
    val numero2 = 5

    if (numero > numero2) {
        println(numero2)
    }


    // Exercicio 2
    val number = 6
    val number2 = 7

    println(number + number2)


    //Exercicio 3
    val par = 8
    var resultado = par / 2

    if (resultado == 4)
    println("Numero Par")

    else if (resultado != 4 ){
        println("Numero Impar")
    }

    when {
        resultado == 4 -> println("numero par")
        resultado != 4 -> println("numer impar")
    }

}
package com.example.variaveis

class Conditionals_2 {
}

fun main() {
    var numero1 = 4
    var numero2 = 10
    var numero3 = 12
                        // && significa e
    if(numero1 > numero2 && numero1 >numero3) {
        println("maior numero")
    }else if(numero1 > numero2){
        println("maior que numero2 e menor que numero1")
        }else if(numero1 > numero3){
            println("maior que numero3 e menor que numero2")
        }else{
            println("menor que todos")
        }

    // segunda forma de resolver
    when{
        numero1 > numero2 && numero1 > numero3 -> println("maior numero")
        numero1 > numero2 -> println("maior que numero2 e menor que numero1")
        numero1 > numero3 -> println("maior que numero3 e menor que numero2")
        else -> println("menor que todos")
    }

    }
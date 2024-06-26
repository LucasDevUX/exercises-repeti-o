package com.example.variaveis

class ParaTreino {
}

fun main() {
    var dia = 14
    var mes = 6
    var ano = 24

    if (dia > mes && dia > ano){
        println("dia maior que todos")}
    else if (dia < mes){
        println("dia menor que mes")
    }
    else if (dia > ano){
        println("dia maior que ano")}

    else{
        println("dia maior que mes e menor que ano")
    }

}
package com.example.variaveis

class Collections {
}

fun main() {
    var array: Array<String> = Array(10) {""}
    var array2: DoubleArray = DoubleArray(2) {i -> 1.0 *i}

    array2[0] = 5.0
    array2.set(1,15.0)

    println(array2[0])
    println(array2.get(1))
}
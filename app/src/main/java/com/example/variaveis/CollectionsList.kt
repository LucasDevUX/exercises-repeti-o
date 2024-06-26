package com.example.variaveis

class CollectionsList {
}

fun main() {
    var mutablelist : MutableList<Int> = mutableListOf()
    var Lista: List<String> = listOf("valor1","valor2")

    mutablelist.add(5)
    mutablelist.add(8)
    println(mutablelist.size)
    mutablelist.remove(0)
    mutablelist[0] = 1
    mutablelist.set(0,7)
    println(mutablelist[0])
    println(Lista.get(0))
}
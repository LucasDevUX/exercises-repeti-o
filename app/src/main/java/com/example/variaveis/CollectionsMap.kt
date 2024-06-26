package com.example.variaveis

class CollectionsMap {
}

fun main() {
    var mutableMap: MutableMap<String,String> = mutableMapOf()
    var map: Map<Int,Int> = mapOf((Pair(5,10)))

    println(mutableMap.contains("Lucas"))
    mutableMap["Lucas"] = "Developer"
    println(mutableMap.contains("Lucas"))
    mutableMap.put("Lucas","Developer")
    println(mutableMap.get("Lucas"))
    println(mutableMap["Hercules"])
}
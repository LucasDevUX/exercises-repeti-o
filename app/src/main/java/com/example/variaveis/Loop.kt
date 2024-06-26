package com.example.variaveis

class Loop {
}

fun main() {
    var array: IntArray = IntArray(20)

    var i = 0
    while (i <= array.size - 1){
        println(array[i])
        i++
    }
// tudo que e criado dentro do FOR so existe dentro do FOR
    for (j in array.indices){
        //println(array[j])
        array[j] = j * 2
        println(array[j])
    }


    // imcompleto ATENCAO TERMINAR EXERCICIO 6
    var k = 0;
    var resultado = 0.0
    while(k < array.size){
        resultado = resultado + array[k] ++
        k++ // ++ siguinifica que a variavel vai reseber o valor dela mesmo mais um 1
    }
 println("valor soma total dos resultados = $resultado")
}
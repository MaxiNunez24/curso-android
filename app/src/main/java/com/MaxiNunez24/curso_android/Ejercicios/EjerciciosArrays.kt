package com.MaxiNunez24.curso_android.Ejercicios

fun ejercicioArray1(){
    val miArreglo : Array<Int> = arrayOf(1,2,3,4,5)

    // Una manera
    for(num in miArreglo) println(num)

    // Otra manera
    miArreglo.forEach { num -> println(num) }

    // SON EQUIVALENTES!
}

fun ejercicioArray2(){
    val misNumeros : Array<Int> = arrayOf(1,2,3,4,5,6,7,8)
    var sumaParcial : Int = 0
    for(num in misNumeros){
        sumaParcial = sumaParcial + num
    }
    println(sumaParcial)
}

fun ejercicioArray2_0(){
    val misNumeros : Array<Int> = arrayOf(1,2,3,4,5,6,7,8)
    var sumaTotal : Int = misNumeros.sum()
    println("La suma total es: $sumaTotal")
}

fun main(){
    ejercicioArray2_0()
}
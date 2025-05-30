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

fun ejercicioArray3(){
    val numeros : Array<Int> =
        arrayOf(5,2,3,24,55,1,35,-3,33,3,24,12,4)
    var minimo : Int = Int.MAX_VALUE
    var maximo : Int = Int.MIN_VALUE

    for(num in numeros){
        if(num < minimo) minimo = num
        if(num > maximo) maximo = num
    }
    println("El mínimo número es: $minimo")
    println("El máximo número es: $maximo")
}

fun ejercicioArray3_0(){
    val numeros : Array<Int> =
        arrayOf(5,2,3,24,55,1,35,-3,33,3,24,12,4)
    var minimo : Int = numeros.min()
    var maximo : Int = numeros.max()
    println("El mínimo número es: $minimo")
    println("El máximo número es: $maximo")
}



fun main(){
    ejercicioArray3_0()
}
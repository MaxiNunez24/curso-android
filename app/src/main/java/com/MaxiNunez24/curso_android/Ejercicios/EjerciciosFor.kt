package com.MaxiNunez24.curso_android.Ejercicios

import kotlin.random.Random

fun ejercicio1(){
    for(i in 1..10) print("$i ")
}

fun ejercicio2(){
    var i: Int = 15
    while(i <= 15){
        print("$i ")
        i++
    }
}

fun ejercicio3() {
    var i: Int = 1
    do{
        print("¡Hola! ")
        i++
    } while(i <= 3)
}

fun ejercicio4(){
    val arr : Array<String> =
        arrayOf("Pepe","Carla","Pedro","Pablo","María","Juan","Lucas")
    // 7 elementos (size)
    // 0 .. n-1 indices (indices)

    for(i in arr.indices){
        println("arr[$i] -> ${arr[i]}")
    }
}

fun ejercicio5(){
    val numeros : Array<Int> = arrayOf(1,2,3,4,5,6) // Array(6){it + 1} <- Otra forma de crear Arrays
    val totalParcial : MutableList<Int> = mutableListOf(0)

    var parcial : Int = 0
    for(num in numeros){
        parcial += num
        totalParcial.add(parcial) // (totalParcial[i] + numeros[i])
    }

    println(totalParcial)
}

fun ejercicio6(){
    for(i in 1..5){
        print("Tabla de $i: ")
        for(j in 1..10){
            print("$i x $j = ${i*j} | ")
        }
        println()
    }
}

fun ejercicio7(){
    var opcion : Int
    do{
        println("Ingrese una opción:")
        println("1 - Saludar")
        println("2 - Despedir")
        println("0 - Salir")
        opcion = readln().toInt()
        when(opcion){
            1 -> println("Holaaaaa!")
            2 -> println("Chauuuu!")
            0 -> println("Gracias por usar el sistema!")
            else -> println("Ingrese una opción válida")
        }
    }while(opcion != 0)
}

fun ejercicio8(miString: String){
    for(i in miString.length-1 downTo 0)
        print(miString[i])
}

fun ejercicio9(){
    val adivinalo : Int = Random.nextInt(1,50) //25
    println("Adivine el número entre 1 y 50 -> ")
    var input : Int = readln().toInt() // 10
    while(adivinalo != input){
        if(input < adivinalo) println("el número ingresado es menor")
        else println("el número ingresado es mayor")
        input = readln().toInt()
    }
    println("¡¡¡Felicitaciones ganaste!!!")
}

fun ejercicio10(){
    var contador : Int = 10
    while(contador >= 0){
        println(contador)
        contador--
    }
    println("¡¡Despegué!!")
}

fun main(){
    ejercicio10()
}
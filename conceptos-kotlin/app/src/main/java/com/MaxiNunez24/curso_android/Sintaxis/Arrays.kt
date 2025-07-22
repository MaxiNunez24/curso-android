package com.MaxiNunez24.curso_android.Sintaxis

fun main() {
    val arrayDeAmigos: Array<String> = arrayOf("Pepe", "Pedro", "Paola", "Pablito")
    // println(arrayDeAmigos.size) // Tamaño del Array
    // println("Mi primer amigo es: ${arrayDeAmigos[0]}")
    arrayDeAmigos[3] = "Clavito"
    // println(arrayDeAmigos[3])

    // Bucles For
    for (amigo in arrayDeAmigos) { // For Each
        //println(amigo)
    }

    //for(index in arrayDeAmigos.indices)
        //println(arrayDeAmigos[index])

    //for((index, amigo) in arrayDeAmigos.withIndex())
        //println("Mi amigo número ${index + 1} es $amigo")


}
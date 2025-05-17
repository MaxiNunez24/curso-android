package com.MaxiNunez24.curso_android.Sintaxis

fun main() {
    doWhile()
}

fun doWhile(){
    // Bucle do-while

    var i: Int = 5
    do{
        println("Bucle do-while -> $i")
        i++
    }while(i < 5)
}


fun ejemploWhile(){
    // Bucle While
    var i: Int = 5
    while(i < 5){ // Ejecuta el código MIENTRAS la condición sea true
        println("Bucle While -> $i")
        i++
    }
}


fun sumaDeNumerosConCorte(){
    var numero: Int
    var suma: Int = 0
    do {
        println("Ingrese un número para sumar (corta con -1)")
        numero = readln().toInt()
        suma += numero
    }while (numero != -1)
    println("La suma total es: $suma")
}

fun invitados(){
    val personas : List<String> = listOf("Pedro", "Maria", "Clara", "Pablo", "Gastón", "Juancito", "Laura")
    val invitados: MutableList<String> = mutableListOf()

    var indice: Int = 0
    while(indice < personas.size && personas[indice] != "Juancito"){
        invitados.add(personas[indice])
        indice ++
    }

    println(invitados)
}
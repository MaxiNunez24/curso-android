package com.MaxiNunez24.curso_android.Sintaxis

import kotlin.random.Random

fun main(){
    val lista1 : List<Int> = (1..30).map{
        Random.nextInt(1, 100) }.toList()
    // Crear listas con 30 números aleatorios entre 1 y 100
    val lista2 : List<Int> = (1..30).map{
        Random.nextInt(1, 100) }.toList()

    val lista3 : List<Int> = lista1.intersect(lista2).toList()
    println(lista3)
}
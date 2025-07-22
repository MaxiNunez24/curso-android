package com.MaxiNunez24.curso_android.POO

class InterfazPrueba(var prueba: String) : Cuadrupedo {

    override fun correr(){
        println("Hola")
    }
}

fun main(){
    var miPrueba = InterfazPrueba("Hola")
    miPrueba.correr()
    println(miPrueba.prueba)
    miPrueba.prueba()
}
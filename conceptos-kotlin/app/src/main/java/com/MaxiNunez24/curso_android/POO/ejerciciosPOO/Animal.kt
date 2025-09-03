package com.MaxiNunez24.curso_android.POO.ejerciciosPOO

abstract class Animal(val nombre: String,val raza: String,val edad: Int) {
    var energia = 0.0
    abstract fun emitirSonido()

    fun respirar(){ println("Respirando...") }
}
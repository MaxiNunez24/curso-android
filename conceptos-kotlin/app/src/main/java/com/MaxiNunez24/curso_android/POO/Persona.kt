package com.MaxiNunez24.curso_android.POO

open class Persona (val nombre: String, var edad: Int, var altura: Float) {

    open fun saludar(){
        println("Hola soy $nombre y tengo $edad años")
    }
    open fun cumplirAños(){
        edad ++
        println("¡Feliz Cumpleaños $nombre!")
    }
}
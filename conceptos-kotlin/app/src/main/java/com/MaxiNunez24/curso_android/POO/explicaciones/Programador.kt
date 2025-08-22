package com.MaxiNunez24.curso_android.POO.explicaciones

class Programador {
    // Atributos -> Variables
    var nombre = ""
    var lenguaje = ""

    // Métodos -> Funciones
   fun inicializar(nombre: String, lenguaje: String) {
        this.nombre = nombre
        this.lenguaje = lenguaje
    }

   fun inicializarPorTeclado(){
        println("Ingrese el nombre del programador:")
        this.nombre = readln()
        println("Ingrese el lenguaje del programador:")
        this.lenguaje = readln()
    }

   fun presentarse(): String = "Hola soy $nombre y programo en $lenguaje"
}

fun main() {
    var maxi = Programador()
    maxi.inicializar("Maximiliano", "Kotlin")
    println(maxi.presentarse())
    var thiago = Programador()
    thiago.inicializarPorTeclado()
    println(thiago.presentarse())
}
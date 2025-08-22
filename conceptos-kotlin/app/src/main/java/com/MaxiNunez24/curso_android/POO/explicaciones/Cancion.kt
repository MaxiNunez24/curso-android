package com.MaxiNunez24.curso_android.POO.explicaciones

class Cancion(val titulo: String, val artista: String, val duracion: Float, val genero: String) {
    var letra = ""

   fun promt() : String = "$artista - $titulo  (duración: $duracion mins)"

   fun reproducir(){
        println("Reproduciendo ${promt()}")
    }

   fun pausar (){
        println("Pausando ${promt()}")
    }

   fun reanudar(){
        println("Reanudando ${promt()}")
    }
}

fun main(){
    val cancion1 = Cancion("POO", "Kotlinianos", 3.5f, "Pop")
    cancion1.reproducir()
    cancion1.pausar()
    cancion1.reanudar()
}
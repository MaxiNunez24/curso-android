package com.MaxiNunez24.curso_android.POO.ejerciciosPOO

import com.MaxiNunez24.curso_android.POO.explicaciones.Cuadrupedo

abstract class Animal(val nombre: String, val raza: String, var edad: Int) : Cuadrupedo {
    var energia = 100


    init { // Es un método que se ejecuta cuando se instancia el objeto
        if(edad < 0){
            edad = 0
        }
    }

    abstract fun emitirSonido()

   fun comer(){
        if(energia < 100) {
            energia = energia + 10
            println("$nombre está comiendo... Yum!")
        } else println("$nombre está lleno..")
    }

   fun dormir(){
        if(energia == 100) println("$nombre no está cansado aún!")
        else {
            energia = 100
            println("$nombre está durmiendo.... zZzZzZzZz")
        }
    }

   fun tomarAgua(){
        if(energia < 100){
            energia += 5
            println("$nombre está tomando agua... Surp")
        } else println("$nombre no quiere tomar agua de momento...")
    }

    override fun correr(){
        if(energia >= 30){
            energia -= 30
            println("$nombre está corriendo... Que no se te escape!")
        } else {
            println("$nombre está muy cansado para correr...")
        }
    }

   fun imprimir(){
        println("Nombre: $nombre")
        println("Raza: $raza")
        println("Edad: $edad años")
        println("Energía restante: $energia%")
    }
}














package com.MaxiNunez24.curso_android.POO

class Empleado(nombre: String, edad: Int, altura: Float, var trabajo: String) : Persona(nombre, edad, altura){

    override fun saludar(){
        super.saludar()
        super.nombre
        println("Trabajo como $trabajo")
    }
}
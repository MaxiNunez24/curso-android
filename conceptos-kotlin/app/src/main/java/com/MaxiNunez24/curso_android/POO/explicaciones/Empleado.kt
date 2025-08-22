package com.MaxiNunez24.curso_android.POO.explicaciones

class Empleado(nombre: String, edad: Int, altura: Float, var trabajo: String) : Persona(nombre, edad, altura){

    override fun saludar(){
        super.saludar()
        super.nombre
        println("Trabajo como $trabajo")
    }
}
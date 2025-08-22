package com.MaxiNunez24.curso_android.POO.ejerciciosPOO

open class Empleado(val nombre: String, val sueldo: Float) {

    open fun mostrarDatos(){
        println("El empleado se llama $nombre y tiene un sueldo de $$sueldo")
    }

}
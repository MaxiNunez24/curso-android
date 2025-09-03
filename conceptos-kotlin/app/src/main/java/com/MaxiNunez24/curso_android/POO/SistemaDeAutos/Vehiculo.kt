package com.MaxiNunez24.curso_android.POO.SistemaDeAutos

abstract class Vehiculo(val marca: String, val modelo: String) {

    abstract fun calcularAutonomia(): Float
    fun arrancar(): Boolean {
        return if (calcularAutonomia() > 0) {
            println("El vehículo ha arrancado. Brrrumm")
            true
        } else {
            println("El vehículo no tiene suficiente autonomía para arrancar.")
            false
        }
    }

    fun detenerse() = println("El vehículo se ha detenido.")
}
package com.MaxiNunez24.curso_android.POO.ejerciciosPOO

class CuentaBancaria(val titular: String, var saldo: Double) {

    fun depositar(cantidad: Double) {
        saldo = saldo + cantidad
    }

    fun extraer(cantidad: Double): Double {
        return if(saldo >= cantidad) {
            saldo = saldo - cantidad
            cantidad
        }
        else {
            println("No tiene suficiente saldo para extraer $$cantidad")
            mostrarSaldo()
            0.0
        }

    }

    fun mostrarSaldo() {
        println("Saldo actual de $titular: $$saldo")
    }

}
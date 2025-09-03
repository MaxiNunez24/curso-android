package com.MaxiNunez24.curso_android.POO.SistemaDeAutos

fun main(){
    val tesla = AutoElectrico("Tesla", "Model S", 80f, 11f)
    val mustang = AutoCombustion("Ford", "Mustang", 60f, 9.2f)

    println("Autonomía de Tesla: ${tesla.calcularAutonomia()}km")
    println("Autonomía de Mustang: ${mustang.calcularAutonomia()}km")
    println("Conexión a internet de Tesla: ${tesla.conectarRed()}")
    // El mustang no puede conectarse a internet

}
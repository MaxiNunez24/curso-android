package com.MaxiNunez24.curso_android.POO.SistemaDeAutos

class AutoCombustion(marca: String, modelo: String, val capacidadTotalTanqueEnLitros: Float, val consumoLitrosCada100Km: Float): Vehiculo(marca, modelo) {
    /* Se calcula cuántas veces puedo recorrer 100km con un tanque lleno.
        Por lo que después se multiplica por la cantidad de km para obtener
        la distancia máxima que puedo recorrer.
        */
    override fun calcularAutonomia() = (capacidadTotalTanqueEnLitros / consumoLitrosCada100Km) * 100

}
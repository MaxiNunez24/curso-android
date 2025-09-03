package com.MaxiNunez24.curso_android.POO.SistemaDeAutos

class AutoElectrico(marca: String, modelo: String, val capacidadTotalBateriaEnKWh: Float, val consumoKWhCada80Km: Float): Vehiculo(marca, modelo), Conectividad {

    /* Se calcula cuántas veces alcanza la batería para recorrer
    80km dado cuántos kWh se gastan para recorrer 80km (consumo).
    Por lo que después se multiplica por la cantidad de km para obtener
    la distancia máxima que puedo recorrer.
    */
    override fun calcularAutonomia() = (capacidadTotalBateriaEnKWh / consumoKWhCada80Km) * 80

}
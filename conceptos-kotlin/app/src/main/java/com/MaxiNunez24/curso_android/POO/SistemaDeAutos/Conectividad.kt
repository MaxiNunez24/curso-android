package com.MaxiNunez24.curso_android.POO.SistemaDeAutos

interface Conectividad {
    fun conectarRed(): Boolean {
        println("""
        Seleccione una red para conectarse:
                    1. PepitoWifi
                    2. Un wifi para gobernarlos a todos
                    3. Luke, yo soy tu wifi
                    4. Más Lento que la Tortuga
                    5. El Señor Voldemodem
        """.trimIndent())
        val opcion = readln().toInt()
        val nombre = when(opcion){
            1 -> "PepitoWifi"
            2 -> "Un wifi para gobernarlos a todos"
            3 -> "Luke, yo soy tu wifi"
            4 -> "Más Lento que la Tortuga"
            5 -> "El Señor Voldemodem"
            else -> ""
        }
        return if(nombre != ""){
            println("Se ha conectado exitosamente a la red '$nombre'")
            true
        } else {
            println("Se ha producido un error al conectarse a la red.")
            false
        }
    }
}
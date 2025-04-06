package com.MaxiNunez24.curso_android

fun main() {

    //print("Hola mundo")

    //Esto es un comentario de una línea

    /*
        Este es un comentario
        de varias líneas
     */

    /**
     * 1) Saludar con su nombre
     */

    // La función println() imprime en pantalla lo que está entre paréntesis
    println("Hola soy Maxi")
    println("Dale que se puede!")

    /**
     * Variables
     */

    // Valores
    /*
        Int puede representar
        desde: -2,147,483,648 (-2^31)
        hasta: 2,147,483,647 (2^31 - 1)
     */
    val edad: Int = 20
    /*
        Long puede representar
        desde: -9,223,372,036,854,775,808 (-2^63)
        hasta: 9,223,372,036,854,775,807 (2^63 - 1)
     */
    val cantidadDeEstrellasEnElUniverso: Long = 30000000000000
    /*
        Float utiliza 32 bits para los decimales

        Double utiliza 64 bits para los decimales
     */
    val altura: Float = 1.84f

    /*
        Los String son cadenas de texto van con ""
     */
    val nombre: String = "Maximiliano"
    /*
        Char es un sólo caracter y va con ''
     */
    val miInicial: Char = 'M'

    /**
     * 2) Imprimir un saludo con todos sus datos en las variables
     */

    println("Hola soy $nombre, empieza con $miInicial, tengo $edad años y mido $altura metros")





}


package com.MaxiNunez24.curso_android.Sintaxis

import kotlin.math.pow


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

    // Variables inmutables: Valores / Constantes

    // Sintaxis:
    // val NombreDeVariable:Tipo = valor


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
    val cantidadDeEstrellasEnElUniverso: Long = 3000000000000
    /*
        Float utiliza 32 bits para los decimales (6-7)

        Double utiliza 64 bits para los decimales (15-16)
     */
    val altura: Float = 1.84f

    /*
        Los String son cadenas de texto van con ""
     */
    val nombre: String = "Maximiliano"
    /*
        Char es un sólo caracter y va con ''
     */
    val miInicial: Char // Declarar la variable
    miInicial = 'M' // Inicializar la variable

    /**
     * 2) Imprimir un saludo con todos sus datos en las variables
     */

    println("Hola soy $nombre, empieza con $miInicial, tengo $edad años y mido $altura metros")



    // Variables mutables: Variables

    var cantAlumnos: Int // <-- Declarar
    cantAlumnos = 6 // <-- Inicializar

    println("Hasta ahora llegaron $cantAlumnos")

    cantAlumnos = cantAlumnos + 1 // actualiza a 7
    cantAlumnos += 1 // es igual a lo de arriba

    cantAlumnos *= 2

    println("Ahora son $cantAlumnos")

    /*
    Operadores
       Aritméticos
     */

    var num1: Int = 5
    var num2: Int = 2
    var num3: Float = 3.14f
    var resultado: Int

    // Suma +
    resultado = num1 + num2
    println("Suma: $resultado")

    // Resta -
    resultado = num1 - num2

    // Multiplicacion *
    resultado = num1 * num2

    // Division /
    resultado = num1 / num2
    println("División Entera: $resultado")

    // Módulo %
    resultado = num1 % num2 // el resto de la división
    println("Módulo de $num1 / $num2: $resultado")

    // Potenciacion .pow(n)
    num3.pow(2)

    /*
        Operadores de
            Comparación
     */

    // Mayor que >
    println( num1 > num2 ) // 5 > 2? true

    // Mayor o Igual que >=
    println( num2 >= num1 ) // 2 >= 5? false

    // Menor que <
    println( num1 < num2 ) // false

    // Menor o Igual que <=
    println( num2 <= num1 ) // true

    // Igual ==
    println( num1 == num2 ) // false

    // Distinto !=
    println( num1 != num2 ) // true

    /*
        Operadores
            Lógicos
     */

    var resultadoLogico: Boolean

    // AND  &&
    print("AND: ")
    println( (num1 < num2) && (num2 != num1) )
    // true cuando todas sean true
    // false con que una sea false

    // OR   ||
    print("OR: ")
    println( (num1 >= num2) || (num1 == num2) )
    // true con que una sea verdadera
    // false cuando todas sean false

    // NOT  !
    resultadoLogico = !(num1 > num2)
    println( "NOT: $resultadoLogico" )
    // Niega el valor que tenía

    

}
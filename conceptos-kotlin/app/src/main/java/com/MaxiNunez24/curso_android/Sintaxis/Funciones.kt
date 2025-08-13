package com.MaxiNunez24.curso_android.Sintaxis
/*
    Una función es una caja negra que
    realiza una acción y nos devuelve,
    o no, un resultado.

    Se utiliza para modularizar y
    hacer código reutilizable

    No nos interesa cómo está hecha,
    sólo lo que hace y qué tiene que recibir.

    Esas "cajas negras" son también pequeños programas

 */

// Sintaxis

fun nombreDeLaFuncion(){
    // Código de la función
}

// Ejemplo de definición de una función simple:
fun saludaPepe(){
    println("Hola soy Pepe")
}
/*  Esto sólo declara la función saludaPepe(), pero no la ejecuta.
    Para ejecutar la función hay que "llamarla" primero, en este
    caso vamos a llamarla desde el programa principal (nuestra
    función main())
*/

fun main(){
    saludaPepe()



}

/**
 * 1) Crear una función miSaludo() que imprima "Hola soy *su nombre*"
 */

// Una posible resolución:
fun miSaludo(){
    println("Hola soy Maxi")
}

/*
    Dentro de una función se puede hacer lo mismo que se hace
    en un programa normal, como crear variables, etc. Por ejemplo:
*/

fun ejemplo(){
    val principio: String = "Este es "
    val fin: String = "un ejemplo"
    println(principio + fin)
}

/*
    No sólo se puede imprimir en las funciones, sino que
    también se puede retornar un valor del tipo especificado
    después de los paréntesis:

   private fun mainnombreDeFuncion(): Tipo { código }

    para retornar un valor (que puede ser una variable o
    calculado en la misma línea) se utiliza la palabra
    reservada return
*/

fun ejemploReturn(): String {
    return "Esto devolvió la función"
}

fun ejemploReturn2(): Int {
    val num1: Int = 6
    val num2: Int = 14
    return num1 + num2
}

/*
    Para poder comunicar nuestros programas, y para no tener
    que repetir una función si sólo cambian pocos valores,
    se utilizan los parámetros. Estos van entre los paréntesis
    que antes mencionamos con la siguiente sintaxis:
    (nombre: Tipo, nombre2: Tipo)
*/
fun saludoParametros(nombre: String, apellido: String): String {
    return "Hola soy $nombre $apellido"
}

/*
    Se le llama "firma" de una función al nombre, parámetros y su
    valor de retorno. Ej:

   private fun maincalcularCredito(monto: Double, interes: Double): Double


    Y se le llaman parámetros formales a los parámetros de la firma
    y argumentos o parámetros reales a los valores que se le pasa a
    la función cuando esta es llamada. Por ej:

   private fun mainsaludoFormal(nombre: String, firma: String): String
                         ↑            ↑
    parámetros formales: ↑            ↑

    parámetros reales o argumentos:
                           ↓              ↓
    fun main(){            ↓              ↓
        saludoFormal("Maximiliano", "Maximiliano Nuñez.")
    }

 */
package com.MaxiNunez24.curso_android.Modulo1

private fun ejercicio1y2() {
    /*
    1. Ingreso de datos básicos
        Enunciado: Pedir al usuario su nombre, edad y altura.

        Luego imprimir un mensaje como:
         "Hola nombre, tenés edad años y medís altura metros."

        Pista: recordá que los valores ingresados son String.
        Usá toInt() y toFloat() si necesitás convertirlos.
     */

    fun leerNombre(): String {
        println("Ingrese su nombre:")
        return readln()
    }

    fun leerEdad(): Int {
        println("Ingrese su edad:")
        return readln().toInt()
    }

    fun leerAltura(): Float {
        println("Ingrese su altura:")
        return readln().toFloat()
    }

    /*
    2. Mayoría de edad
        Enunciado: A partir de la edad ingresada,
        imprimir si es mayor o menor de edad.

        Pista: si la edad es mayor o igual a 18
     */

    fun esMayorDeEdad(edad: Int): String {
        return if (edad >= 18) "mayor de edad" else "menor de edad."
    }

    val nombre = leerNombre()
    val edad = leerEdad()
    val altura = leerAltura()
    println("Hola $nombre, medís $altura metros y tenés $edad años.")
    println("Por lo tanto sos ${esMayorDeEdad(edad)}!")
}

private fun ejercicio3(nota: Int){
    /*
    3. Clasificación de nota
        Enunciado: Ingresar una nota del 0 al 10
        y mostrar el resultado con when:
            10: Excelente
            7 a 9: Aprobado
            0 a 6: Desaprobado

        Pista: podés usar rangos como in 7..9
     */

    println(
        when(nota){
            10 -> "Excelente"
            in 7..9 -> "Aprobado"
            in 0..6 -> "Desaprobado"
            else -> "Nota inválida"
        }
    )

    // Para probar el ejercicio con varios valores ingresados:
    // for(i in 1..4) ejercicio3(readln().toInt())
}

private fun ejercicio4(){
    /*
    4. Contador ascendente
        Enunciado: Usar un for que imprima los números del 1 al 10.
     */
    for(i in 1..10) println(i)
}

private fun ejercicio5(){
    /*
    5. Contador descendente
        Enunciado: Usar while para imprimir desde 5 hasta 1.

        Pista: inicializá una variable con 5 y restale 1 en cada iteración.
     */
    var i = 5
    while(i >= 1){ // o while(i > 0)
        println(i)
        i-- // i = i - 1
    }
}

private fun ejercicio6(notas: List<Int>){
    /*
    6. Promedio de notas
        Enunciado: Ingresar 3 notas (pueden tener decimales),
        calcular el promedio y mostrarlo Pista
        : recordá que el promedio es la suma de los valores dividido la cantidad de valores
     */
}

fun main() {

}


package com.MaxiNunez24.curso_android.Ejercicios

/* Ejercicio 1:
    Retornar "Niño" si la edad es
    menor a 13, "Adolescente" si es
    entre 13 y 17, "Adulto" si es
    entre 18 y 64, y "Adulto mayor"
    si tiene 65 o más.
*/

fun clasificarEdadWhen(edad: Int){
    when(edad){
        in 0..12 -> println("Niño")
        in 13..17 -> println("Adolescente")
        in 18..64 -> println("Adulto")
        in 65..300 -> println("Adulto mayor")
        else -> println("Edad no clasificable")
    }
}


fun clasificarEdadIf(edad: Int){
    if(edad >= 0 && edad < 13) println("Niño")
    else if(edad >= 13 && edad <= 17) println("Adolescente")
    else if(edad >= 18 && edad <= 64) println("Adulto")
    else if(edad >= 65 && edad <= 140) println("Adulto mayor")
    else println("Edad no clasificable")
}


/* Ejercicio 2
    Dado un número del 1 al 7, devolver el
    nombre del día de la semana (1 = "Lunes",
    ..., 7 = "Domingo"). Si no está en ese
    rango, devolver "Número inválido".
 */
fun nombreDelDia(numero: Int): String{
    return when(numero){
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miércoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6 -> "Sábado"
        7 -> "Domingo"
        else -> "Día no válido"
    }
}

/*
    Ejercicio 3) Calculadora simple
 */



fun calcularIf(a: Double, b: Double, operador: Char){
    if(operador == '+') println(a + b)
    else if(operador == '-') println(a - b)
    else if(operador == '*') println(a * b)
    else if(operador == '/'){
        if(b != 0.0) println(a / b)
        else println(0.0)
    }
    else println("SINTAX ERROR")
}

fun calcularWhen(a: Double, b: Double, operador: Char){
    when( operador ){
        '+' -> println(a + b)
        '-' -> println(a - b)
        '*' -> println(a * b)
        '/' -> if(b != 0.0) println(a / b) else println(0.0)
        else -> "Operador no válido"
    }
}


fun esBiciesto(anio: Int) : Boolean{
    return if((anio % 4) == 0 && (anio % 100) != 0) true
        else if((anio % 400) == 0) true
        else false
}

fun describirClima(temperatura: Int, estaLloviendo: Boolean){
    when (temperatura){
        in Int.MIN_VALUE until 0 -> if(estaLloviendo) println("Nieve")
                        else println("Muy Frío")
        in 0..15->{
            if (estaLloviendo) println("Frío y lluvioso")
            else println("Frío")
        }
        in 16..25 ->
            if (estaLloviendo) println("Templado con lluvia")
            else println("Templado")
        in 26..30 -> if(estaLloviendo) println("Calor húmedo")
                            else println("Caluroso")
        else -> println("Temperatura imposible de describir")
    }
}

fun calificarEnLetras(nota: Int){
    when(nota){
        in 90..100 -> println("A")
        in 80..89 -> println("B")
        in 70..79 -> println("C")
        in 60..69 -> println("D")
        in 0..59 -> println("F")
        else -> println("Nota inválida")
    }
}


fun main(){
}



package com.MaxiNunez24.curso_android.Ejercicios

fun main(){
    println("La suma de dos números es " + (5 + 2)) // Concatenación
    println(areaRectangulo(2.5, 5.0))
    println("Ingrese una temperatura en Celsius: ")
    println(convertirCelsiusAFahrenheit(readln().toDouble()))
}

fun areaRectangulo(base: Double, altura: Double): String{
    return "El área del rectángulo es: ${base * altura}" // Expresión dentro de un String
}

fun convertirCelsiusAFahrenheit(celsius: Double = 1.0): String{
    return "La temperatura en Fahrenheit es: ${(celsius * 9/5) + 32}"
}



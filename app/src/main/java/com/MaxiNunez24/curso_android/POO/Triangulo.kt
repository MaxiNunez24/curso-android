package com.MaxiNunez24.curso_android.POO

/*
    Implementar una clase que cargue los lados de un triángulo e implemente los siguientes métodos: inicializar las propiedades, imprimir el valor del lado mayor y otro método que muestre si es equilátero o no.
 */

class Triangulo {
    // Atributos
    var lado1 = 0.0
    var lado2 = 0.0
    var lado3 = 0.0

    // Métodos
    fun inicializar(lado1: Double, lado2: Double, lado3: Double){
        this.lado1 = lado1
        this.lado2 = lado2
        this.lado3 = lado3
    }
}

fun main(){
    var triangulo1 = Triangulo()
    triangulo1.inicializar(1.2, 2.3, 3.4)
    var trianguloEquilatero = Triangulo()
    triangulo1.inicializar(0.5, 0.5, 0.5)
}
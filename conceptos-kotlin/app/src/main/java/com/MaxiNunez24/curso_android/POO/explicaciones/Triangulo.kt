package com.MaxiNunez24.curso_android.POO.explicaciones

/*
    Implementar una clase que cargue los lados de un triángulo e implemente los siguientes métodos: inicializar las propiedades, imprimir el valor del lado mayor y otro método que muestre si es equilátero o no.
 */

class Triangulo {
    // Atributos
    var lado1 = 0
    var lado2 = 0
    var lado3 = 0

    // Métodos -> Funciones
   fun inicializar(lado1: Int, lado2: Int, lado3: Int) {
        this.lado1 = lado1
        this.lado2 = lado2
        this.lado3 = lado3
    }

   fun inicializarPorTeclado() {
        println("Ingrese el lado 1:")
        this.lado1 = readln().toInt()
        println("Ingrese el lado 2:")
        this.lado2 = readln().toInt()
        println("Ingrese el lado 3:")
        this.lado3 = readln().toInt()
    }

   fun imprimir() {
        println("Triángulo con lados: $lado1 $lado2 $lado3 ")
    }

   fun ladoMayor(){
        if(lado1 > lado2){
            if(lado1 > lado3) println("El lado 1 es el mayor")
            else println("El lado 3 es el mayor")
        } else{
            if(lado2 > lado3) println("El lado 2 es el mayor")
            else println("El lado 3 es el mayor")
        }
    }

}

fun main() {
    val triangulo1 = Triangulo()
    triangulo1.inicializar(5,3,2)
    triangulo1.ladoMayor()
}
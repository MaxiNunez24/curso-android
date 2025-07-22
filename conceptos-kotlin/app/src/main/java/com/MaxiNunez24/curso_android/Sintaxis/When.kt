package com.MaxiNunez24.curso_android.Sintaxis

fun main() {

}

fun result(dato : Any){
    when(dato){
        is Int -> println(dato * 2)
        is String -> println("Hola $dato!")
        is Boolean -> println(!dato)
    }
}

fun getSemester(month : Int) {
    when (month) {
        in 1..6 -> println("Primer Semestre")
        in 7..12 -> println("Segundo Semestre")
        !in 1..12-> println("Ingrese un mes válido")
    }
}

fun getTrimester(month : Int) {
    when (month) {
        in 1..6 -> println("Primer Semestre")
        in 7..12 -> println("Segundo Semestre")
        !in 1..12-> println("Ingrese un mes válido")
    }
}

fun getMonth(){

}
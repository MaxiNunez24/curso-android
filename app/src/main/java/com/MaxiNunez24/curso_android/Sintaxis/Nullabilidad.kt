package com.MaxiNunez24.curso_android.Sintaxis

fun main(){
    val nombre:String? = null // ? Variable Nullable
    val inicial: Char? = nombre?.get(0) ?: ' '
    val apellido: String? = "Perez"
    println(nombreCompleto(nombre, apellido) ?: "Ingrese valores válidos")

}

fun nombreCompleto(nombre: String?, apellido: String?): String? {
    if (nombre != null && apellido != null) {
        return "$nombre $apellido"
    }else
        return null
}
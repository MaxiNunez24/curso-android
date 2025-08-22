package com.MaxiNunez24.curso_android.POO.ejerciciosPOO

class Alumno(val nombre: String, val notas: List<Float>) {

    fun promedio() = notas.average().toFloat()

    fun aprobo() = promedio() >= 6


}
package com.MaxiNunez24.curso_android.POO

class Alumno(val nombre: String, val curso: String){
    var promedio = 0.0f
    val notas = mutableListOf<Int>()

    fun rendirExamen(nota: Int){
        notas.add(nota)
    }

    fun promedio(): Float {
        /* var promedio = 0
        var suma = 0
        var cantidad = 0
        // Sumar las notas y Contar la cantidad de notas
        for(nota in notas){
            suma = suma + nota
            cantidad = cantidad + 1
        }
        // Dividir la suma por la cantidad
            promedio = suma / cantidad--|
                                        |-->return (notas.sum() / notas.size).toFloat()
            return promedio.toFloat()---|
       */
        return if(notas.isNotEmpty()) notas.average().toFloat()
        else 0.0f
    }

}

fun main() {
    val alumno1 = Alumno("Maxi", "Programación 1")
    println(alumno1.promedio())
    alumno1.rendirExamen(9)
    alumno1.rendirExamen(8)
    alumno1.rendirExamen(10)
    println(alumno1.promedio())
}

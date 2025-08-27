package com.MaxiNunez24.curso_android.POO.ejerciciosPOO

open class Persona(val nombre: String, var edad: Int){
    var altura = 0.0f
    val nacionalidad = ""

    init {
        if(edad < 0) edad = 0
        this.cumplirAños()
    }

    fun cumplirAños(){
        edad = edad + 1
    }

    open fun presentarse(): String{
        var texto = "Hola, soy $nombre y tengo $edad años"
        if(altura != 0.0f) texto += " y mido $altura metros."
        return texto
    }
}

class Alumno(nombre: String, edad: Int, var grado: Int): Persona(nombre, edad){

    val notas = mutableListOf<Int>()

    fun pasarDeAño(){
        grado = grado + 1
    }

    fun rendirExamen(nota: Int){
        notas.add(nota)
    }

    fun promedio() = notas.average().toFloat()

    override fun presentarse(): String{
        var texto = super.presentarse()
        texto += " está en el $grado grado y tiene promedio ${this.promedio()}"
        return texto
    }
}


fun main(){
    val brandon = Alumno("Brandon", 20, 5)
    brandon.rendirExamen(10)
    println(brandon.presentarse())

}
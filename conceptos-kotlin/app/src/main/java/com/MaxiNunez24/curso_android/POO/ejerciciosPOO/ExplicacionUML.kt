package com.MaxiNunez24.curso_android.POO.ejerciciosPOO

abstract class Persona(val nombre: String){
    fun presentarse(){
        println("Hola soy $nombre")
    }
}
class Alumno(nombre: String): Persona(nombre){
    private val notas: MutableList<Int> = mutableListOf()

    fun rendirExamen(nota: Int) {
        notas.add(nota)
    }
    fun promedio(): Double {
        return notas.average()
    }
}
class Docente(nombre: String): Persona(nombre), administrativo{
    fun darClase(){
        println("Hoy vamos a dar....")
    }
    override fun firmar(): String = this.nombre
}
class Preceptora(nombre: String): Persona(nombre), administrativo{
    fun pasarAsistencia(){
        println("Hoy vinieron...")
    }
    override fun firmar(): String = this.nombre
}
interface administrativo {
    fun firmar(): String
}
class Curso(val nombre: String, val docente: Docente, val preceptora: Preceptora, val alumnos: MutableList<Alumno>){
    fun mejorPromedio(): Double{
        var mejorActual: Double = 0.0
        for(alumno in alumnos){
            val promActual = alumno.promedio()
            if(promActual > mejorActual) mejorActual = promActual
        }
        return mejorActual
    }
}
package com.MaxiNunez24.curso_android.POO.ejerciciosPOO

class Gerente(nombre: String, sueldo: Float, var departamento: String): Empleado(nombre, sueldo) {

    override fun mostrarDatos(){
        println("El gerente se llama $nombre, tiene un sueldo de $$sueldo y trabaja en el departamento de $departamento")
    }

}
package com.MaxiNunez24.curso_android.POO

class Perro(nombre: String, raza: String, edad: Int) : Animal(nombre, raza, edad), Cuadrupedo {

    override fun emitirSonido(){
        ladrar()
    }

    fun ladrar(){
        if(energia < 5) println("$nombre está demasiado cansado para ladrar... ¡¡¡AL FINN!!!")
        else{
            energia -= 5
            println("$nombre dice: ¡GUAU!")
        }
    }
}








/*



: Animal(nombre,raza,edad)


*/
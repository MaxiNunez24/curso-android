package com.MaxiNunez24.curso_android.POO.ejerciciosPOO

class Gato(nombre: String, raza: String, edad: Int) : Animal(nombre, raza, edad) {
   fun arañar(){
        if(energia < 10) println("$nombre está muy cansado para arañarte... ¡Te salvaste!")
        else{
            energia -= 5
            println("¡$nombre te arañó! Va a arder por unos días... ")
        }
    }


    override fun emitirSonido() {
        maullar()
    }

   private fun maullar(){
        if(energia < 5) println("$nombre está muy cansado para maullar...")
        else {
            energia -= 5
            println("$nombre dice: ¡MIAU!")
        }
    }
}
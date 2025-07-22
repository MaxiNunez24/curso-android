package com.MaxiNunez24.curso_android.POO

fun accionesToby(){
    val toby = Perro("Toby", "Cuchuflito", 5)
    toby.emitirSonido()
    toby.correr()
    toby.comer()
    toby.tomarAgua()
    toby.comer()
    toby.dormir()
    toby.dormir()
}

fun accionesMittens(){
    val mittens = Gato("Mittens", "Siamés", 4)
    mittens.arañar()
    mittens.arañar()
    mittens.emitirSonido()

}

fun main(){
    accionesToby()
    accionesMittens()

}
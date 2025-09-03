package com.MaxiNunez24.curso_android.POO.ejerciciosPOO
interface Instrumento {
    fun tocar()
    fun afinar(){ println("El instrumento se está afinando") }
}
interface InstrumentoDePercusion : Instrumento {
    fun golpear()
}
class Bateria : Instrumento, InstrumentoDePercusion {
    override fun tocar(){
        println("Ba tums")
    }

    override fun golpear(){
        println("¡Tum!")
    }

}
class Bombo : Instrumento, InstrumentoDePercusion {
    override fun tocar(){
        println("TUM")
    }

    override fun golpear(){
        println("¡PUM!")
    }
}
class Timbales : Instrumento, InstrumentoDePercusion {
    override fun tocar(){
        println("Tun")
    }

    override fun golpear(){
        println("¡Tim!")
    }
}
class Guitarra(val afinacion: String): Instrumento {
    override fun tocar() {
        println("Tururururuuuuu.")
    }

}

fun main(){
    val banda: MutableList<InstrumentoDePercusion> = mutableListOf(
        Bateria(),
        Bombo(),
        Timbales()
    )

    for (instrumento in banda) {
        instrumento.afinar()
        instrumento.tocar()
        instrumento.golpear()
    }

}
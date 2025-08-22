class Auto(val marca: String, val modelo: String, var color: String) {
    var velocidad = 0

    // Métodos
   fun acelerar() {
        velocidad = velocidad + 10
        println("$marca $modelo Aceleró!")
        println("Velocidad actual: $velocidad km/h")
    }

   fun frenar() {
        velocidad = 0
        println("$marca $modelo Frenó!")
        println("Auto detenido.")
    }
}

fun main(){

    var num: Int = Int.MIN_VALUE

    val prueba : Auto = Auto("Volkswagen", "Gol", "Gris")

    val bumblebee = Auto("Chevrolet", "Camaro", "Amarillo")
    bumblebee.acelerar()
    bumblebee.frenar()


    val chata = Auto("Ford","150", "Roja")

    chata.acelerar()
}
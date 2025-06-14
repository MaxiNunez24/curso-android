package com.MaxiNunez24.curso_android.Modulo1

fun ejercicio1() {
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")
}

fun ejercicio2(){
    fun main() {
        println("New chat message from a friend")
    }
}

fun ejercicio3(){
    fun main() {
        var discountPercentage: Int = 0
        var offer: String = ""
        val item = "Google Chromecast"
        discountPercentage = 20
        offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

        println(offer)
    }
}

fun ejercicio4(){
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}

fun ejercicio5(){
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}

fun ejercicio6(){
    val firstNumber = 10
    val secondNumber = 5
    val result = firstNumber + secondNumber
    println("$firstNumber + $secondNumber = $result")
}




fun potencia(base: Int, exponente: Int) : Int {
    var resultado = 2
    var contador = 1
    while(contador < exponente) {
        contador = contador + 1
        resultado = resultado * base

    }
    return resultado
}

fun main(){
    // eleve 4 al cuadrado (4²)
    var resultado: Int = potencia(2,5)
    println(resultado)
}
package com.MaxiNunez24.curso_android.Modulo1

private fun ejercicio1() {
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")
}

private fun ejercicio2(){
    fun main() {
        println("New chat message from a friend")
    }
}

private fun ejercicio3(){
    fun main() {
        var discountPercentage: Int = 0
        var offer: String = ""
        val item = "Google Chromecast"
        discountPercentage = 20
        offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

        println(offer)
    }
}

private fun ejercicio4(){
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}

private fun ejercicio5(){
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}

private fun ejercicio6(){
    val firstNumber = 10
    val secondNumber = 5
    val result = firstNumber + secondNumber
    println("$firstNumber + $secondNumber = $result")
}

fun potencia(base: Int, exponente: Int) : Int {
    var result : Int = 1
    for(i in 1..exponente) result = result * base
    return result
}

private fun ejercicio7() {
   fun add(num1: Int, num2: Int) : Int {
        return num1 + num2
    }

   fun substract(num1: Int, num2: Int) : Int{
        return num1 - num2
    }

    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = substract(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")
}

private fun ejercicio8(){
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}

private fun ejercicio81(){
    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId. 
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(email = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}

fun displayAlertMessage(os: String = "Unknown OS", email: String): String =
    "There's a new sign-in request on $os for your Google Account $email."


fun main(){

   fun pepe(dato: Int, otroDato: String): Int{
        println(otroDato)
        return dato + 5
    }

    println(pepe(otroDato = "Hola",dato = 5))
}

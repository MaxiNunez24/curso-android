package com.MaxiNunez24.curso_android.Ejercicios

fun ejercicioArray1(){
    val miArreglo : Array<Int> = arrayOf(1,2,3,4,5)

    // Una manera
    for(num in miArreglo) println(num)

    // Otra manera
    miArreglo.forEach { num -> println(num) }

    // SON EQUIVALENTES!
}

fun ejercicioArray2(){
    val misNumeros : Array<Int> = arrayOf(1,2,3,4,5,6,7,8)
    var sumaParcial : Int = 0
    for(num in misNumeros){
        sumaParcial = sumaParcial + num
    }
    println(sumaParcial)
}

fun ejercicioArray2_0(){
    val misNumeros : Array<Int> = arrayOf(1,2,3,4,5,6,7,8)
    var sumaTotal : Int = misNumeros.sum()
    println("La suma total es: $sumaTotal")
}

fun ejercicioArray3(){
    val numeros : Array<Int> =
        arrayOf(5,2,3,24,55,1,35,-3,33,3,24,12,4)
    var minimo : Int = Int.MAX_VALUE
    var maximo : Int = Int.MIN_VALUE

    for(num in numeros){
        if(num < minimo) minimo = num
        if(num > maximo) maximo = num
    }
    println("El mínimo número es: $minimo")
    println("El máximo número es: $maximo")
}

fun ejercicioArray3_0(){
    val numeros : Array<Int> =
        arrayOf(5,2,3,24,55,1,35,-3,33,3,24,12,4)
    var minimo : Int = numeros.min()
    var maximo : Int = numeros.max()
    println("El mínimo número es: $minimo")
    println("El máximo número es: $maximo")
}

/** Contar pares
Cuenta cuántos elementos pares
hay en un array de enteros.
 */
/**
 * TODO:
 * 1. Recibir el array por parámetro
 * 2. Inicializar un contador en 0
 * 3. Mientras recorro el arreglo
 * 3.1. Si el módulo de un elem por 2 es = 0
 * 3.2. Entonces incremento el cont de pares
 * 4. Imprimo el contador
 */
fun ejercicioArray4(numeros : Array<Int>) {
    var contador: Int = 0
    val pares : ArrayList<Int> = arrayListOf()
    for(num in numeros) {
        if(num % 2 == 0){
            contador++
            pares.add(num)
        }
    }
    println("Los pares son $pares y en total son: $contador")
}


/* Reemplazo simple
    En un array de Strings con nombres de colores, reemplaza las ocurrencias de "rojo" por "ROJO".
 */
/**
 * TODO:
 * 1. Recibir arreglo por parámetro
 * 2. Recorrer el arreglo.withIndex()
 * 3. Si el elem actual es == "rojo"
 * 3.1. arreglo[indice] = elem.toUpperCase()
 * 4. imprimir el arreglo
 */
fun ejercicioArray5(colores : ArrayList<String>){
    for((indice, color) in colores.withIndex()){
        if(color == "rojo") colores[indice] = color.uppercase()
    }
    println(colores)
}

fun ejercicioArray6(gradosCelsius : Array<Double>) : List<Double> {
    val gradosFahrenheit : List<Double> = gradosCelsius.map{(it * 9/5) + 32}
    return gradosFahrenheit
}




fun main() {

    fun birthdayGreeting(name: String, age: Int = 18, height: Double = 1.60) : String {
        val nameGreeting = "Happy Birthday, $name!"
        val ageGreeting = "You are now $age years old!"
        return "$nameGreeting\n$ageGreeting"
    }

    println(message = birthdayGreeting(age = 21, name = "Maxi"))
    println(birthdayGreeting(name = "Ramiro", height = 1.84))

}

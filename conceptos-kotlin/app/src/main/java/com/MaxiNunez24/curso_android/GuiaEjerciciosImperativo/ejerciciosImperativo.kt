import com.MaxiNunez24.curso_android.Sintaxis.mutableList
import kotlin.random.Random
import kotlin.random.nextInt

private fun ejercicio1Heladero() { // La calculadora del heladero

    // Pedir al usuario la cantidad de bochas de helado
    fun leerCantBochas(): Int {
        println("Ingrese la cantidad de bochas de helado:")
        return readln().toInt()
    }

    // Pedir al usuario el precio por bocha
    fun leerPrecio(): Float {
        println("Ingrese el precio por bocha:")
        return readln().toFloat()
    }

    // Calcular el importe total a pagar
    fun aplicarDescuento(cantidad: Int, precio: Float): Float {
        var total = cantidad * precio
        // Decidir si aplicar descuento del 10% (cantBochas > 3)
        if (cantidad > 3) total = total * 0.9f
        return total
    }

    // Mostrar el importe total a pagar
    fun mostrarImporte(importe: Float) {
        println("El importe total es: $importe")
    }

    // Llamado a los módulos
    val cantBochas = leerCantBochas()
    val precioPorBocha = leerPrecio()
    val importeTotal = aplicarDescuento(cantBochas, precioPorBocha)
    mostrarImporte(importeTotal)
}

private fun ejercicio2Colectivo() { // El viaje en colectivo

    // Pedir la cantidad de kilometros a recorrer
    fun obtenerDistancia(): Float {
        println("Ingrese la cantidad de km a recorrer:")
        return readln().toFloat()
    }

    // Calcular costo por km ($120 o $100 según km)
    fun calcularCosto(km: Float): Float {
        var precio = 120f
        if (km > 50) precio = 100f
        return km * precio
    }

    //Imprimir ticket
    fun imprimirTicket(km: Float, importe: Float) {
        println("El importe total a pagar para recorrer $km km es de $$importe")
    }
    // Llamar a los módulos
    val km = obtenerDistancia()
    val costo = calcularCosto(km)
    imprimirTicket(km, costo)

}

private fun ejercicio3Dado() {

    // Simular un lanzamiento de dado
    fun lanzarDado(): Int {
        return Random.nextInt(1, 7)
    }

    // Determinar si el número es par
    fun esPar(numero: Int): Boolean {
        return numero % 2 == 0
    }

    // Imprimir la cantidad de pares e impares y los números que salieron
    fun mostrarEstadisticas(pares: List<Int>, impares: List<Int>) {
        println("Salieron ${pares.size} números pares y ${impares.size} números impares")
        println("Los pares que salieron son: $pares")
        println("Los impares que salieron son: $impares")
    }


    val pares: MutableList<Int> = mutableListOf()
    val impares: MutableList<Int> = mutableListOf()

    for (i in 1..10) {
        val tirada = lanzarDado()
        if (esPar(tirada)) pares.add(tirada)
        else impares.add(tirada)
    }

    mostrarEstadisticas(pares, impares)

}

private fun ejercicio4Videojuego() {

    fun mostrarMenu() {
        print(
            """
-----------------------------------------------------
|      ¡Bienvenido a la tienda!                     |
|                                                   |
|      ¿Qué desea comprar hoy joven aventurero?     |
|     ___________________________________           |       
|     |  1* ESPADA: 20 monedas          |           |
|     |  2* POCIÓN DE VIDA: 15 monedas  |           |
|     |  3: ARMADURA: 30 monedas        |           |
|     |_________________________________|           |
|      0* Para salir.                               |   
|                                                   |
|      Ingrese el número de la opción deseada:      |
|___________________________________________________|
""".trimIndent()
        )
    }

    fun puedeComprar(opcion: Int, monedas: Int, precios: Array<Int>): Boolean {
        return (monedas >= precios[opcion - 1])
    }

    // Un jugador empieza con 1000 monedas
    val monedasIniciales = 1000
    var monedas = monedasIniciales

    // Variable booleana auxiliar para salir del bucle
    var salir = false

    // Arreglo de productos y sus precios para facilitar el acceso por índices
    val productos = arrayOf("ESPADA", "POCIÓN DE VIDA", "ARMADURA")
    val precios = arrayOf(20, 15, 30)

    // Repetir hasta que se quede sin monedas o decida salir
    do {
        mostrarMenu()
        // Se lee la opción ingresada por el usuario
        val opcion = readln().toInt()

        // Se ingreso una opción válida?
        if (opcion in 0..3) {
            // Si decide salir se termina el programa
            if (opcion != 0) {
                // Si se queda sin monedas se termina el programa
                if (monedas > 15) {
                    // Puede comprar lo que quiere?
                    if (puedeComprar(opcion, monedas, precios)) {
                        println("Ha comprado ${productos[opcion - 1]} por ${precios[opcion - 1]} monedas!")
                        monedas = monedas - precios[opcion - 1]
                        println("Le quedan $monedas monedas.")
                    } else {
                        println("No tiene las monedas suficientes para comprar la ${productos[opcion - 1]}!")
                    }
                } else {
                    println("¡No tiene monedas suficientes para comprar los objetos, vuelva mañana!")
                    salir = true
                }
            } else {
                println("¡Gracias por su visita!")
                salir = true
            }
        } else {
            println("¡Opción inválida!")
        }

    } while (!salir)

}

private fun ejercicio5Tortugas() {
    // Simular un lanzamiento de dado
    fun lanzarDado(): Int {
        return Random.nextInt(1, 7)
    }

    fun mostrarPosiciones(posicion1: Int, posicion2: Int) {
        // Mostrar quién ganó
        if(posicion1 >= 20){
            println("______________________")
            println("¡¡La tortuga 1 ganó!!")
            println("|* ||  |")
        } else if(posicion2 >= 20){
            println("______________________")
            println("¡¡La tortuga 2 ganó!!")
            println("|  || *|")
        }
        // Dibujar pista y posiciones de las tortugas
        println("======== FINISH")
        for (i in 19 downTo 0) {
            if (i == posicion1) print("|* |")
            else print("|  |")
            if (i == posicion2) print("| *| $i")
            else print("|  | $i")
            println()
        }
        println("|__||__| START")
    }

    // Variable auxilar para saber si hay ganador
    var hayGanador = false

    // Posiciones de las tortugas
    var tortuga1 = 0
    var tortuga2 = 0

    // Mientras no haya ganador, se lanzan los dados
    do {
        tortuga1 = tortuga1 + lanzarDado()
        if (tortuga1 >= 20) hayGanador = true

        tortuga2 = tortuga2 + lanzarDado()
        if (!hayGanador && tortuga2 >= 20) hayGanador = true

        mostrarPosiciones(tortuga1, tortuga2)

    } while (!hayGanador)
}

fun main() {
    
}
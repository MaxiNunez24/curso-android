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
        var tirada = lanzarDado()
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
"""
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

fun main() {
    ejercicio4Videojuego()
}
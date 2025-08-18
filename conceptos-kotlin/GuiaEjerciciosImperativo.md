# 🖥️ Guía de Ejercicios Imperativos en Kotlin

Esta guía contiene 7 ejercicios **imperativos** pensados para practicar programación paso a paso antes de introducir Programación Orientada a Objetos (POO).  
Cada ejercicio incluye:
- Enunciado.
- Análisis del problema.
- Pseudocódigo.
- Implementación en Kotlin con funciones y modularización.

Y al final un **menú único** para ejecutar todos.

---

## Ejercicios
Antes de meternos en el mundo de clases y objetos, lo ideal es que se sientan **cómodos** pensando de forma *imperativa* —es decir, **paso a paso**, con **variables**, **estructuras de control**, **funciones** y una buena dosis de **descomposición de problemas**.

Por eso estos ejercicios están pensados para practicar **imperatividad y modularización** antes de pasar a Programación Orientada a Objetos. Cada problema es sencillo pero lo suficientemente interesante como para **descomponerlo** en **funciones** y **pseudocódigo**.

---

### Ej. 1) La calculadora del heladero

* Pide al usuario cuántas bochas de helado quiere y el precio por bocha.
* Si pide más de 3 bochas, aplica un 10% de descuento.
* Mostrar el total a pagar.
* **Módulos sugeridos**: leerCantBochas(), leerPrecio(), aplicarDescuento(), mostrarImporte().

---

### Ej. 2) El viaje en colectivo

* Pide la cantidad de kilómetros a recorrer.
* El costo por km es \$120, pero si son más de 50 km el precio por km baja a \$100.
* Mostrar el precio final.
* **Módulos sugeridos**: obtenerDistancia(), calcularCosto(), imprimirTicket().

---

### Ej. 3) El dado tramposo

* Simular que se lanza un dado 10 veces. (utilizar `Random.nextInt(1,7)`)
* Contar cuántas veces salió un número par y cuántas un impar.
* **Módulos sugeridos**: lanzarDado(), esPar(numero), mostrarEstadisticas().

---

### Ej. 4) El cajero del videojuego

* Un jugador empieza con 1000 monedas.
* Puede “comprar” 3 tipos de objetos con precios distintos (elegidos por ustedes).
* Repetir hasta que se quede sin monedas o decida salir.
* **Módulos sugeridos**: mostrarMenu(), puedeComprar()

---

### Ej. 5) Carrera de tortugas

* Dos tortugas avanzan por turnos tirando un dado (1 a 6 pasos).
* La primera que llegue o supere 20 pasos gana.
* Mostrar paso a paso el avance de cada una.
* **Módulos sugeridos**: lanzarDado(), mostrarPosiciones()

---

### Ej. 6) El acertijo del número secreto

* Generar un número aleatorio del 1 al 100.
* El usuario intenta adivinarlo.
* El programa indica “mayor” o “menor” hasta acertar.
* **Módulos sugeridos**: generarNumeroSecreto(), leerIntento(), verificarIntento().

---

### Ej. 7) La caja registradora

* Permitir ingresar productos con nombre y precio hasta que se ingrese “fin”.
* Calcular total y cantidad de productos.
* Si el total supera cierto monto, aplicar descuento.
* **Módulos sugeridos**: leerProducto(), sumarPrecio(), aplicarDescuento(), mostrarTicket().

---

## 📋 Índice de análisis y pseudocódigo

1. [La calculadora del heladero](#1-la-calculadora-del-heladero)
2. [El viaje en colectivo](#2-el-viaje-en-colectivo)
3. [El dado tramposo](#3-el-dado-tramposo)
4. [El cajero del videojuego](#4-el-cajero-del-videojuego)
5. [Carrera de tortugas](#5-carrera-de-tortugas)
6. [El acertijo del número secreto](#6-el-acertijo-del-número-secreto)
7. [La caja registradora](#7-la-caja-registradora)

---

### 1. La calculadora del heladero

**Análisis**

* **Entrada**: Pedir cantidad de bochas (`Int`), pedir precio por bocha (`Float`).
* **Proceso**: si bochas > 3 → descuento del 10% (`precio * 0.9f`).
* **Salida**: total a pagar (`Float`).

**Pseudocódigo**

```
función ejercicio1Heladero(){

    función leerCantBochas(): Entero
        imprimir mensaje
        leer cantidad
        retornar cantidad
    
    función leerPrecio(): Decimal
        imprimir mensaje
        leer precio
        retornar precio
    
    función aplicarDescuento(cantidad, precio): ??
        total = cantidad * precio
        si cantidad > 3:
            total = total - total * 0.10
        retornar total
    
    función mostrarImporte(importe):
        imprimir importe
    
    
    cantBochas = leerCantBochas()
    precio = leerPrecio()
    total = aplicarDescuento(cantBochas, precio)
    mostrarImporte(total)
    
}
```

---

### 2. El viaje en colectivo

**Análisis**

* **Entrada**: distancia en km (`Float`), precio por km (`Float`).
* **Proceso**: si la distancia > 50 km → precio = $100, sino -> precio = $120  
* **Salida**: costo total (`Float`).

**Pseudocódigo**

```
función ejercicio2Colectivo(){
    
    función obtenerDistancia():
        imprimir mensaje
        leer distancia
        retornar distancia
    
    función calcularCosto(distancia): 
        costo = 120
        si distancia > 50:
            costo = 100
        retornar costo * distancia
    
    función imprimirTicket(distancia, costo):
        imprimir costo para tal distancia
    
    
    km = obtenerDistancia()
    costo = calcularCosto(km)
    imprimirTicket(km, costo)

}
```

---

### 3. El dado tramposo

**Análisis**

* **Entrada**: `for` para simular los 10 lanzamientos
* **Proceso**: generar números entre 1 y 6 con `Random.nextInt(1,7)`
* **Salida**: lista de cantidad de pares y cantidad de impares (opcional con los números que salieron)

**Pseudocódigo**

```
función ejercicio3Dado(){
    
    función lanzarDado():
        generar número aleatorio entre 1 y 6
        retornar número aleatorio
    
    función esPar(numero):
        si numero es divisible por 2:
            retornar verdadero
        sino
            retornar falso
        
    función mostrarEstadisticas(pares, impares):
        imprimir la cantidad de pares (opcional los números)
        imprimir la cantidad de impares (opcional los números)
    
    
    pares = 0 (o lista vacía)
    impares = 0 (o lista vacía)
    
    repetir 10:
        tirada = lanzarDado()
        si esPar(tirada):
            agregar a pares
        sino:
            agregar a impares
            
    mostrarEstadisticas(pares, impares)
                    
}
```

---

### 4. El cajero del videojuego

**Análisis**

* **Mostrar**: productos y sus precios
* **Entrada**: item a comprar (`Int`)
* **Proceso**: ver que se haya ingresado una opción válida, calcular si el jugador puede comprar el ítem, o si desea salir.
* **Salida**: mensaje de compra exitosa o insuficiente, o mensaje de salida.

**Pseudocódigo**

```
función ejercicio4Videojuego() {

    función mostrarMenu:
        imprimir un menú con nombre y precio de los productos

    función puedeComprar(opcion, monedas, precios):
        retornar monedas >= precios[opcion - 1]

    // Un jugador empieza con 1000 monedas
    val monedasIniciales = 1000
    var monedas = monedasIniciales

    // Variable auxiliar para salir del bucle
    var salir = false

    // Productos y Precios que tengan acceso por índices
    productos = ("ESPADA", "POCIÓN DE VIDA", "ARMADURA")
    precios = (20, 15, 30)

    // Repetir hasta que se quede sin monedas o decida salir
    Hacer:
        mostrarMenu()
        leer la opción ingresada

        Si ingreso una opción válida:
            Si decide salir se termina el programa:
                Si se queda sin monedas se termina el programa:
                    Si puede comprar lo que quiere:
                        imprimir mensaje de compra exitosa
                        imprimir cantidad de monedas restantes
                    Sino:
                        imprimir mensaje de monedas insuficientes
                Sino:
                    imprimir mensaje de monedas insuficientes para todos los productos
                    salir = true
            Sino:
                Imprimir mensaje de despedida
                salir = true
        Sino: 
            Imprimir opción inválida
    Mientras (!salir)

}
```

---

### 5. Carrera de tortugas

**Análisis**

* **Entrada**: ninguna
* **Proceso**: simular una carrera de 20 metros por turnos de dos tortugas donde al tirar un dado indique cuánto se van a mover en ese turno (`Int`)
* **Salida**: posición de las tortugas actualmente o tortuga ganadora.

**Pseudocódigo**

```
función ejercicio5Tortugas() {
    
    función lanzarDado:
        Simular un lanzamiento de dado

    función mostrarPosiciones(posicion1, posicion2):
        Mostrar quién ganó
        Dibujar pista y posiciones de las tortugas

    // Variable auxilar para saber si hay ganador
    hayGanador = false

    // Posiciones de las tortugas
    tortuga1 = 0
    tortuga2 = 0

    // Mientras no haya ganador, se lanzan los dados
    Hacer:
        tortuga1 = tortuga1 + lanzarDado()
        Si ganó la tortuga1:
            hayGanador = true

        tortuga2 = tortuga2 + lanzarDado()
        Si !hayGanador y ganó la tortuga2:
            hayGanador = true

        mostrarPosiciones(tortuga1, tortuga2)

    Mientras (!hayGanador)
}
```

---

### 6. El acertijo del número secreto

**Análisis**

* **Entrada**: número secreto (generado aleatoriamente), intentos del usuario.
* **Proceso**: indicar si el número ingresado es mayor o menor que el secreto.
* **Salida**: mensaje de acierto

**Pseudocódigo**

```
función ejercicio6NumeroSecreto() {

    función generarNumeroSecreto():
        retornar generar un número entre 1 y 100 aleatoriamente

    función leerIntento():
        imprimir mensaje para que el usuario ingrese un número
        retornar leer número
    

    función verificarIntento(intento, solucion):
        retornar Si intento es mayor a solucion:
            imprimir que el intento es mayor al número secreto
            falso
        Sino si intento es menor a solucion:
            imprimir que el intento es menor al número secreto
            falso
        Sino: 
            imprimir que adivinó
            verdadero

    numeroSecreto = generarNumeroSecreto()

    // Variable auxiliar para salir del bucle
    haGanado = falso

    Hacer:
        haGanado = verificarIntento(leerIntento(), numeroSecreto)
    Mientras (!haGanado)
}
```

---

### 7. La caja registradora

**Análisis**

* **Entrada**: precios de productos hasta que el usuario ingrese 0.
* **Proceso**: sumar precios y calcular IVA (21%).
* **Salida**: total final con IVA.

**Pseudocódigo**

```
funcion leerPrecios():
    total = 0
    repetir:
        leer precio
        si precio != 0:
            total += precio
    hasta que precio == 0
    retornar total

funcion calcularIVA(total):
    retornar total * 1.21

funcion mostrarTotal(total):
    imprimir total

principal:
    total = leerPrecios()
    totalIVA = calcularIVA(total)
    mostrarTotal(totalIVA)
```

---

## 💻 Índice de resoluciones en Kotlin
Las resoluciones a continuación son una posible solución a los problemas, esto quiere decir que no son las únicas. Así que intenten resolver los ejercicios por su cuenta antes de leerlas. Lo importante es que devuelvan los mismos resultados.
1. [La calculadora del heladero](#resolución-1-la-calculadora-del-heladero)
2. [El viaje en colectivo](#resolución-2-el-viaje-en-colectivo)
3. [El dado tramposo](#resolución-3-el-dado-tramposo)
4. [El cajero del videojuego](#resolución-4-el-cajero-del-videojuego)
5. [Carrera de tortugas](#resolución-5-carrera-de-tortugas)
6. [El acertijo del número secreto](#resolución-6-el-acertijo-del-número-secreto)
7. [La caja registradora](#resolución-7-la-caja-registradora)
8. [Menú único para todos los ejercicios](#resolución-8-menú-único-para-todos-los-ejercicios)

---

### Resolución 1: La calculadora del heladero

```kotlin
private fun ejercicio1Heladero(){ // La calculadora del heladero

    // Pedir al usuario la cantidad de bochas de helado
    fun leerCantBochas(): Int {
        println("Ingrese la cantidad de bochas de helado:")
        return readln().toInt()
    }

    // Pedir al usuario el precio por bocha
    fun leerPrecio(): Float{
        println("Ingrese el precio por bocha:")
        return readln().toFloat()
    }

    // Calcular el importe total a pagar
    fun aplicarDescuento(cantidad: Int, precio: Float): Float{
        var total = cantidad * precio
        // Decidir si aplicar descuento del 10% (cantBochas > 3)
        if(cantidad > 3) total = total * 0.9f
        return total
    }

    // Mostrar el importe total a pagar
    fun mostrarImporte(importe: Float){
        println("El importe total es: $importe")
    }

    // Llamado a los módulos
    val cantBochas = leerCantBochas()
    val precioPorBocha = leerPrecio()
    val importeTotal = aplicarDescuento(cantBochas, precioPorBocha)
    mostrarImporte(importeTotal)
}
```

---

### Resolución 2: El viaje en colectivo

```kotlin
private fun ejercicio2Colectivo(){ // El viaje en colectivo

    // Pedir la cantidad de kilometros a recorrer
    fun obtenerDistancia(): Float {
        println("Ingrese la cantidad de km a recorrer:")
        return readln().toFloat()
    }
    // Calcular costo por km ($120 o $100 según km)
    fun calcularCosto(km: Float): Float{
        var precio = 120f
        if(km > 50) precio = 100f
        return km * precio
    }
    //Imprimir ticket
    fun imprimirTicket(km: Float, importe: Float){
        println("El importe total a pagar para recorrer $km km es de $$importe")
    }
    // Llamar a los módulos
    val km = obtenerDistancia()
    val costo = calcularCosto(km)
    imprimirTicket(km, costo)

}
```

---

### Resolución 3: El dado tramposo

```kotlin
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
```

---

### Resolución 4: El cajero del videojuego

```kotlin
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
```

---

### Resolución 5: Carrera de tortugas

```kotlin
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
```

---

### Resolución 6: El acertijo del número secreto

```kotlin
fun ejercicio6NumeroSecreto() {

    fun generarNumeroSecreto(): Int {
        return Random.nextInt(1, 100)
    }

    fun leerIntento(): Int {
        println("Intente adivinar el número secreto (entre 1 y 100):")
        return readln().toInt()
    }

    fun verificarIntento(intento: Int, solucion: Int): Boolean {
        return if (intento > solucion) {
            println("El número secreto es menor al número ingresado")
            false
        } else if (intento < solucion) {
            println("El número secreto es mayor al número ingresado")
            false
        } else {
            println("¡Adivinaste! El número secreto era $solucion")
            true
        }
    }

    val numeroSecreto = generarNumeroSecreto()

    // Variable auxiliar para salir del bucle
    var haGanado = false

    do {
        haGanado = verificarIntento(leerIntento(), numeroSecreto)
    } while (!haGanado)
}
```

---

### Resolución 7: La caja registradora

```kotlin
fun ejercicioCajaRegistradora() {
    val precios = leerPrecios()
    val total = calcularTotalCaja(precios)
    mostrarTotalCaja(total)
}

fun leerPrecios(): List<Double> {
    val lista = mutableListOf<Double>()
    var precio: Double
    do {
        print("Ingrese precio (0 para terminar): ")
        precio = readln().toDouble()
        if (precio > 0) lista.add(precio)
    } while (precio > 0)
    return lista
}

fun calcularTotalCaja(precios: List<Double>): Double {
    return precios.sum()
}

fun mostrarTotalCaja(total: Double) {
    println("Total de ventas: $${"%.2f".format(total)}")
}
```

---

### Resolución 8: Menú único para todos los ejercicios

```kotlin
fun main() {
    var opcion: Int
    do {
        println(
            """
            === Menú de ejercicios ===
            1. Calculadora del heladero
            2. Viaje en colectivo
            3. Dado tramposo
            4. Cajero del videojuego
            5. Carrera de tortugas
            6. Número secreto
            7. Caja registradora
            0. Salir
            """.trimIndent()
        )
        print("Opción: ")
        opcion = readln().toInt()
        when (opcion) {
            1 -> ejercicioHeladero()
            2 -> ejercicioColectivo()
            3 -> ejercicioDadoTramposo()
            4 -> ejercicioCajero()
            5 -> ejercicioTortugas()
            6 -> ejercicioNumeroSecreto()
            7 -> ejercicioCajaRegistradora()
            0 -> println("Saliendo...")
            else -> println("Opción inválida")
        }
    } while (opcion != 0)
}
```

---

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

* Simular que se lanza un dado 10 veces.
* Contar cuántas veces salió un número par y cuántas un impar.
* **Módulos sugeridos**: lanzarDado(), esPar(numero), mostrarEstadisticas().

---

### Ej. 4) El cajero del videojuego

* Un jugador empieza con 1000 monedas.
* Puede “comprar” 3 tipos de objetos con precios distintos (elegidos por el profe o por el alumno).
* Repetir hasta que se quede sin monedas o decida salir.
* **Módulos sugeridos**: mostrarMenu(), comprarObjeto(opcion), mostrarSaldo().

---

### Ej. 5) Carrera de tortugas

* Dos tortugas avanzan por turnos tirando un dado (1 a 6 pasos).
* La primera que llegue o supere 20 pasos gana.
* Mostrar paso a paso el avance de cada una.
* **Módulos sugeridos**: tirarDado(), avanzarTortuga(), mostrarPosiciones(), verificarGanador().

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

* **Entrada**: cantidad de lanzamientos (`Int`).
* **Proceso**: generar números entre 1 y 6, pero con probabilidad mayor para el 6.
* **Salida**: lista de resultados y cuántas veces salió el 6.

**Pseudocódigo**

```
funcion lanzarDado():
    generar aleatorio entre 1 y 10
    si numero >= 8:
        retornar 6
    sino:
        retornar aleatorio entre 1 y 5

funcion jugar(cantidad):
    contador6 = 0
    repetir cantidad veces:
        resultado = lanzarDado()
        mostrar resultado
        si resultado == 6:
            contador6++
    mostrar contador6
```

---

### 4. El cajero del videojuego

**Análisis**

* **Entrada**: precio de un ítem (`Double`), cantidad de monedas (`Int`).
* **Proceso**: calcular si el jugador puede comprar el ítem.
* **Salida**: mensaje de compra exitosa o insuficiente.

**Pseudocódigo**

```
funcion leerDatos():
    leer precio
    leer monedas
    retornar precio, monedas

funcion verificarCompra(precio, monedas):
    si monedas >= precio:
        mostrar "Compra exitosa"
    sino:
        mostrar "Monedas insuficientes"

principal:
    precio, monedas = leerDatos()
    verificarCompra(precio, monedas)
```

---

### 5. Carrera de tortugas

**Análisis**

* **Entrada**: nombres y velocidades de 2 tortugas (`String`, `Double`).
* **Proceso**: simular avance en una carrera de 10 metros, avanzan según su velocidad por turno.
* **Salida**: tortuga ganadora.

**Pseudocódigo**

```
funcion leerDatos():
    leer nombre1, vel1
    leer nombre2, vel2
    retornar nombre1, vel1, nombre2, vel2

funcion simularCarrera(nombre1, vel1, nombre2, vel2):
    dist1 = 0
    dist2 = 0
    mientras dist1 < 10 y dist2 < 10:
        dist1 += vel1
        dist2 += vel2
    si dist1 >= 10 y dist2 >= 10:
        mostrar "Empate"
    sino si dist1 >= 10:
        mostrar nombre1
    sino:
        mostrar nombre2

principal:
    datos = leerDatos()
    simularCarrera(datos)
```

---

### 6. El acertijo del número secreto

**Análisis**

* **Entrada**: número secreto (generado aleatoriamente), intentos del usuario.
* **Proceso**: indicar si el número ingresado es mayor o menor que el secreto.
* **Salida**: mensaje de acierto o agotamiento de intentos.

**Pseudocódigo**

```
funcion generarSecreto():
    retornar aleatorio entre 1 y 100

funcion jugar():
    secreto = generarSecreto()
    intentos = 0
    repetir mientras intentos < 5:
        leer numero
        intentos++
        si numero == secreto:
            mostrar "Adivinaste"
            salir
        sino si numero < secreto:
            mostrar "Mayor"
        sino:
            mostrar "Menor"
    si no adivinó:
        mostrar "Perdiste"
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
fun ejercicioDadoTramposo() {
    val cantidad = leerCantidadTiros()
    val resultados = tirarDadoTramposo(cantidad)
    mostrarResultadosDado(resultados)
}

fun leerCantidadTiros(): Int {
    print("Ingrese cantidad de lanzamientos: ")
    return readln().toInt()
}

fun tirarDadoTramposo(cantidad: Int): List<Int> {
    val lista = mutableListOf<Int>()
    repeat(cantidad) {
        // import kotlin.random.Random <- al comienzo del archivo
        val numero = if (Random.nextDouble() < 0.2) 6 else Random.nextInt(1, 7)
        lista.add(numero)
    }
    return lista
}

fun mostrarResultadosDado(resultados: List<Int>) {
    println("Resultados: ${resultados.joinToString(", ")}")
}
```

---

### Resolución 4: El cajero del videojuego

```kotlin
fun ejercicioCajero() {
    var saldo = leerSaldoInicial()
    saldo = realizarCompra(saldo)
    mostrarSaldoFinal(saldo)
}

fun leerSaldoInicial(): Int {
    print("Ingrese saldo inicial de monedas: ")
    return readln().toInt()
}

fun realizarCompra(saldo: Int): Int {
    print("Ingrese costo del objeto: ")
    val costo = readln().toInt()
    return if (saldo >= costo) saldo - costo else saldo
}

fun mostrarSaldoFinal(saldo: Int) {
    println("Saldo final: $saldo monedas")
}
```

---

### Resolución 5: Carrera de tortugas

```kotlin
fun ejercicioTortugas() {
    val (distancia1, distancia2) = leerDistanciasTortugas()
    val ganador = determinarGanador(distancia1, distancia2)
    mostrarGanador(ganador)
}

fun leerDistanciasTortugas(): Pair<Int, Int> {
    print("Distancia tortuga 1: ")
    val d1 = readln().toInt()
    print("Distancia tortuga 2: ")
    val d2 = readln().toInt()
    return d1 to d2
}

fun determinarGanador(d1: Int, d2: Int): String {
    return when {
        d1 > d2 -> "Tortuga 1"
        d2 > d1 -> "Tortuga 2"
        else -> "Empate"
    }
}

fun mostrarGanador(ganador: String) {
    println("Ganador: $ganador")
}
```

---

### Resolución 6: El acertijo del número secreto

```kotlin
fun ejercicioNumeroSecreto() {
    val secreto = (1..10).random()
    var intento: Int
    do {
        print("Adivina el número (1-10): ")
        intento = readln().toInt()
    } while (intento != secreto)
    println("¡Correcto! El número era $secreto.")
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

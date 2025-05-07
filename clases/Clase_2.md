## 1. Programa Principal y Uso de `println`

### Ejemplo Pedagógico
Inicia mostrando cómo se define la función `main` y cómo se utiliza `println` para mostrar mensajes en pantalla.

```kotlin
fun main() {
    println("¡Bienvenidos a Kotlin!")
}
```

*Puntos a destacar:*
- La función `main` es el punto de entrada.
- `println` se usa para imprimir mensajes y añadir un salto de línea.

### Ejercicio 1
*Objetivo:* Practicar la estructura básica del programa.

**Enunciado:**  
Crea un programa que imprima en pantalla:
1. Un saludo personal (por ejemplo, "Hola, soy [Tu Nombre]").
2. Un mensaje motivador (por ejemplo, "¡Hoy aprenderemos Kotlin!").

---

## 2. Variables y Tipos de Datos

### Ejemplo Pedagógico
Muestra la diferencia entre variables inmutables (`val`) y mutables (`var`), y cómo declarar diferentes tipos de datos.

```kotlin
fun main() {
    // Variable inmutable
    val nombre: String = "Kotlin"
    // Variable mutable
    var edad: Int = 5
    // Cambio de valor en la variable mutable
    edad = 6

    println("El lenguaje $nombre tiene $edad años.")
}
```

*Puntos a destacar:*
- Uso de `val` para valores constantes y `var` para valores que pueden cambiar.
- Declaración explícita de tipos (aunque Kotlin permite inferencia de tipos).

### Ejercicio 2
*Objetivo:* Reforzar la declaración y uso de variables.

**Enunciado:**  
Crea un programa que declare:
1. Una variable `nombre` (String) para almacenar el nombre de una persona.
2. Una variable `edad` (Int) para almacenar su edad.
3. Una variable `altura` (Double) para almacenar su altura en metros.  
Luego, imprime una oración que combine estas variables, por ejemplo:  
*"Mi nombre es [nombre], tengo [edad] años y mido [estatura] metros."*

---

## 3. Operadores y Expresiones

### Ejemplo Pedagógico
Utiliza operadores aritméticos y muestra cómo combinar expresiones con la interpolación de strings.

```kotlin
fun main() {
    val a = 10
    val b = 3
    val suma = a + b
    val resta = a - b
    val producto = a * b
    val division = a / b  // División entera

    println("Suma: $suma")
    println("Resta: $resta")
    println("Producto: $producto")
    println("División (entera): $division")
}
```

*Puntos a destacar:*
- Operadores básicos: suma, resta, multiplicación y división.
- Uso de interpolación de strings para mostrar resultados.

### Ejercicio 3
*Objetivo:* Aplicar operadores y practicar la interpolación.

**Enunciado:**  
Escribe un programa que defina dos números. Calcula y muestra:
- La suma
- La resta
- El producto
- La división (como número decimal, puedes convertir los valores a Double si lo deseas)

---

## 4. Funciones

### Ejemplo Pedagógico
Explica cómo se definen funciones en Kotlin y cómo se pueden llamar desde `main`.

```kotlin
// Función que imprime un mensaje de saludo
fun printHelloWorld() {
    println("Hello, World!")
}

// Función que suma dos números y devuelve el resultado
fun sumar(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    printHelloWorld()
    val resultado = sumar(5, 7)
    println("El resultado de la suma es: $resultado")
}
```

*Puntos a destacar:*
- Separación de la lógica en funciones para modularizar el código.
- Uso de funciones que no retornan valor (Unit) y funciones que retornan un resultado.

### Ejercicio 4
*Objetivo:* Crear y utilizar funciones.

**Enunciado:**  
1. Crea una función `multiplicar` que reciba dos parámetros enteros y retorne su producto.  
2. En la función `main`, llama a `multiplicar` con diferentes valores y muestra los resultados.

---

## 5. Estructuras de Control: Condicionales (`if` y `when`)

### Ejemplo con `if`
Un ejemplo clásico para verificar si un número es positivo, negativo o cero.

```kotlin
fun main() {
    val numero = 0
    if (numero > 0) {
        println("El número es positivo")
    } else if (numero < 0) {
        println("El número es negativo")
    } else {
        println("El número es cero")
    }
}
```

### Ejemplo con `when`
Muestra cómo utilizar `when` para asignar calificaciones según rangos numéricos.

```kotlin
fun main() {
    val score = 75
    val calificacion = when(score) {
        in 90..100 -> "A"
        in 80..89  -> "B"
        in 70..79  -> "C"
        in 60..69  -> "D"
        else       -> "F"
    }
    println("La calificación es: $calificacion")
}
```

*Puntos a destacar:*
- La estructura `if-else` es útil para decisiones simples.
- `when` es más legible para múltiples condiciones y permite trabajar con rangos y tipos.

### Ejercicio 5
*Objetivo:* Practicar el uso de condicionales.

**Enunciado:**  
1. Escribe un programa que reciba un número (puedes usar un valor predefinido) y determine si es par o impar utilizando `if`.  
2. Crea una función que, dado un número, devuelva un mensaje usando `when` para:
   - Imprimir "Muy alto" si el número es mayor o igual a 100.
   - Imprimir "Alto" si el número está entre 50 y 99.
   - Imprimir "Medio" si el número está entre 20 y 49.
   - Imprimir "Bajo" si el número es menor de 20.

---

## 6. Uso Avanzado de `when` con `is` y Rangos

### Ejemplo Pedagógico: Uso de `is`
Una función que describe el tipo de un objeto.

```kotlin
fun describir(obj: Any): String =
    when (obj) {
        is Int    -> "Es un entero"
        is String -> "Es una cadena de texto"
        is Boolean-> "Es un valor booleano"
        else      -> "Tipo desconocido"
    }

fun main() {
    println(describir(123))
    println(describir("Kotlin"))
    println(describir(true))
}
```

### Ejercicio 6
*Objetivo:* Profundizar en el uso de `when` con `is` y rangos.

**Enunciado:**  
1. Crea una función `evaluarObjeto` que reciba un parámetro de tipo `Any` y, usando `when`, imprima:
   - "Número par" si el parámetro es un entero y es par.
   - "Número impar" si el parámetro es un entero y es impar.
   - "Cadena no vacía" si es un String que contiene texto.
   - "Cadena vacía" si es un String sin contenido.
   - "Otro tipo" para cualquier otro caso.

2. Prueba la función en `main` con diferentes tipos de datos: un entero par, un entero impar, una cadena vacía, una cadena con texto y algún valor booleano.

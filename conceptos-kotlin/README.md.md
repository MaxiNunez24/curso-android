# Resumen general - Kotlin
- [¿Qué es un programa?](#¿Qué%20es%20un%20programa?)
- [🧑🏻‍💻Para empezar a programar](#🧑🏻‍💻Para%20empezar%20a%20programar)
- [▶️​ `fun main()` - Función principal](#▶️​%20`fun%20main()`%20-%20Función%20principal)
- [🖨️​ `println()` - Imprimir por terminal](#🖨️​%20`println()`%20-%20Imprimir%20por%20terminal)
- [🌱 Introducción a las Variables](#🌱%20Introducción%20a%20las%20Variables)
- [🔁 `var` vs `val` — Mutabilidad](#🔁%20`var`%20vs%20`val`%20—%20Mutabilidad)
- [🧠 ¿Por qué necesitamos representar datos?](#🧠%20¿Por%20qué%20necesitamos%20representar%20datos?)
- [🔢 Tipos de Datos Básicos](#🔢%20Tipos%20de%20Datos%20Básicos)
- [🧮 Operadores en Kotlin](#🧮%20Operadores%20en%20Kotlin)
- [🧑‍💻 `readln()` – Leer datos del usuario](#🧑‍💻%20`readln()`%20–%20Leer%20datos%20del%20usuario)
- [🧭 Estructuras de Control](#🧭%20Estructuras%20de%20Control)
- [🛠 Funciones Personalizadas](#🛠%20Funciones%20Personalizadas)
- 

## ¿Qué es un programa?
![](Programa-Algoritmo.png)
![](Intercambio%20CPU%20y%20RAM.png)
Pero... la CPU no entiende lenguaje humano. Por lo que necesitamos escribir instrucciones en un lenguaje que la máquina pueda entender:
![](Introducción%20Código%20Binario.png)
![](Introducción%20Kotlin.png)
## 🧑🏻‍💻Para empezar a programar
### IDE (Entorno de Desarrollo Integrado)
Para compilar y ejecutar nuestro código vamos a utilizar el IDE oficial para Android:
### Android Studio
![](Android%20Studio.png)
[Descargar Android Studio desde su página oficial](https://developer.android.com/studio?hl=es-419)
Una vez descargado se debe de instalar y crear un proyecto de la siguiente forma:
[Crear proyecto y archivos en Android Studio](Crear%20proyecto%20y%20archivos%20en%20Android%20Studio.md)

O en su defecto (también para realizar pruebas rápidas):
### Kotlin Playground
![](Kotlin%20Playground.png)
[Kotlin Playground](https://play.kotlinlang.org/)

Una vez dentro podemos empezar a programar...
## ▶️​ `fun main()` - Función principal
Es donde empieza nuestro programa (Punto de entrada)
![](Punto%20de%20entrada%20al%20programa.png)
> Comentarios: Son líneas que se ignoran / no se ejecutan. Se utilizan para documentar el código. 

## 🖨️​ `println()` - Imprimir por terminal
![](Hola%20Mundo.png)
![](Terminal%20Hola%20Mundo.png)
¡Con esto hicimos nuestro primer programa!

---

## 🌱 Introducción a las Variables

Cuando programamos, muchas veces necesitamos **guardar información** para poder usarla después.  
Esa información puede ser un número, un texto, un resultado de una cuenta, entre otras cosas.

Para **almacenar datos**, usamos **variables**.
- [🧃 ¿Qué es una variable?](#🧃%20¿Qué%20es%20una%20variable?)
- [📝 ¿Cómo se crea una variable?](#📝%20¿Cómo%20se%20crea%20una%20variable?)
- [🧠 ¿Para qué sirven?](#🧠%20¿Para%20qué%20sirven?)
- [🔁 `var` vs `val` — Mutabilidad](#🔁%20`var`%20vs%20`val`%20—%20Mutabilidad)

### 🧃 ¿Qué es una variable?

Una **variable** es como una **caja con nombre**, donde guardamos algo para poder usarlo más adelante.

```kotlin
fun main() {
    var numero = 5
    println(numero)
}
```

📦 En este ejemplo:

- `numero` es el **nombre** de la caja (la variable).
    
- `5` es el **valor** que estamos guardando.
    
- `println(numero)` muestra ese valor en la terminal.

---

### 🔁 Podemos usar la variable en operaciones

```kotlin
fun main() {
    var numero = 5
    println(2 + numero)  // Imprime 7
}
```

La computadora:

1. Ve que `numero` vale `5`
    
2. Suma `2 + 5`
    
3. Muestra el resultado: `7`

---

### 📝 ¿Cómo se crea una variable?

En Kotlin usamos esta forma:

```kotlin
var nombreDeLaVariable = valor
```

✅ `var`: significa que la variable **puede cambiar**  
🧾 `nombreDeLaVariable`: le ponemos un **nombre claro**  
📦 `= valor`: guardamos un **dato** en la variable

---

### ✍️ Otro ejemplo simple:

```kotlin
fun main() {
    var saludo = "Hola"
    println(saludo)
}
```

💡 Esto va a mostrar: `Hola`

---
### 🧠 ¿Para qué sirven?

Las variables nos permiten:

- Guardar datos que se usan muchas veces
    
- Hacer cálculos con esos datos
    
- Organizar mejor nuestro código

---

## 🔁 `var` vs `val` — Mutabilidad

En Kotlin hay **dos formas** de crear variables, y la diferencia es muy importante:

| Palabra clave | ¿Se puede cambiar su valor? | Se usa para...                    |
| ------------- | --------------------------- | --------------------------------- |
| `var`         | ✅ **Sí**                    | Datos que pueden cambiar          |
| `val`         | ❌ **No**                    | Datos que no cambian (constantes) |
- [🎯 ¿Cuándo usar `var` y cuándo `val`?](#🎯%20¿Cuándo%20usar%20`var`%20y%20cuándo%20`val`?)
---

### 🧪 Veamos un ejemplo con `var` (variable que **cambia**):

```kotlin
fun main() {
    var numero = 10
    println(numero)    // Muestra 10
    numero = 20
    println(numero)    // Muestra 20
}
```

📌 Primero guardamos el número `10`, pero **luego lo cambiamos a `20`**.

---

### 🚫 Ahora probemos con `val` (valor **fijo**):

```kotlin
fun main() {
    val nombre = "Maxi"
    println(nombre)
    nombre = "Juan" // ❌ Esto da error
}
```

💥 Este código **no funciona** porque `val` no permite cambiar el valor después de asignarlo.  
Es como una **caja sellada**: podés guardar algo una vez, pero no lo podés cambiar.

---

### 🎯 ¿Cuándo usar `var` y cuándo `val`?

- Usá `val` cuando **sabés que el valor no va a cambiar** (por ejemplo: tu nombre, una fecha de nacimiento).
    
- Usá `var` cuando **el valor puede cambiar** (por ejemplo: la cantidad de puntos en un juego, la edad, un número que se incrementa, etc).

---

✅ **Buenas prácticas**:  
Siempre que puedas, usá `val`. Es más seguro y ayuda a que tu código sea más fácil de entender.

---

## 🧠 ¿Por qué necesitamos representar datos?

Antes de programar, debemos representar la información del mundo real de forma que la computadora pueda entenderla.

Para eso usamos los **tipos de datos**, que nos permiten modelar **números, texto, decisiones, colecciones**, etc.

### 🧰 Kotlin

- Es un lenguaje **fuertemente tipado** (el tipo siempre se respeta)
    
- Puede **inferir automáticamente** el tipo según el valor que le asignamos


---

## 🔢 Tipos de Datos Básicos

En Kotlin existen varios **tipos de datos primitivos**. Vamos a ver los más usados en esta etapa:
- [✅ Boolean (Lógico)](#✅%20Boolean%20(Lógico))
- [🔤 Char y String (Texto)](#🔤%20Char%20y%20String%20(Texto))
- [🔢 Números Enteros](#🔢%20Números%20Enteros)
- [🔢 Números con Decimales (Punto flotante)](#🔢%20Números%20con%20Decimales%20(Punto%20flotante))
- [🎒 Resumen](#🎒%20Resumen)

---

### ✅ Boolean (Lógico)

📦 Representa valores **verdadero o falso**. Solo puede ser:

- `true` (verdadero)
    
- `false` (falso)

```kotlin
fun main() {
    val esMayor = true // Kotlin infiere que la variable es Boolean
    println(esMayor)
    var prendido: Boolean = false // Se utilizan : para indicar el tipo de dato
}
```
![](Boolean.png)

---

### 🔤 Char y String (Texto)

- **Char**: representa **un solo carácter** entre comillas simples (`'A'`, `'%'`)
    
- **String**: representa una **cadena de texto** entre comillas dobles (`"Hola mundo!"`)

```kotlin
fun main() {
    val inicial: Char = 'M'
    val saludo: String = "Hola Maxi"
    println(inicial)
    println(saludo)
}
```
![](Char%20y%20String.png)

---

### 🔢 Números Enteros

Usamos enteros cuando **no necesitamos decimales**. Los más comunes:

| Tipo    | Ejemplo       | Rango aproximado |
| ------- | ------------- | ---------------- |
| `Byte`  | 127           | -128 a 127       |
| `Short` | 32767         | -32.768 a 32.767 |
| `Int`   | 2_147_483_647 | -2³¹ a 2³¹ - 1   |
| `Long`  | 9 trillones   | -2⁶³ a 2⁶³ - 1   |

```kotlin
fun main() {
    val edad: Int = 25
    val año: Short = 2025
    println(edad)
    println(año)
    var numero = 150 // Kotlin infiere que es Int
    println(numero)
}
```

![](Tabla%20Números%20Enteros.png)
![](Representación%20de%20números%20binarios.png)

---

### 🔢 Números con Decimales (Punto flotante)

Cuando necesitamos representar **números con parte decimal**, usamos:

|Tipo|Precisión|Ejemplo|
|---|---|---|
|`Float`|Simple (32 bits)|3.14f|
|`Double`|Alta (64 bits)|3.1415926535|

```kotlin
fun main() {
    val temperatura: Float = 36.6f
    val pi: Double = 3.1415926535
    println(temperatura)
    println(pi)
}
```

⚠️ ¡Ojo! Los `Float` deben terminar en **`f`**.

![](Punto%20Flotante.png)

---

### 🧮 Tip Extra: Notación científica

Los números muy grandes o muy pequeños se representan así:
$$250000 = 2.5 \times 10^{5}$$
$$0.00008 = 8.0 \times 10^{-5}$$

![](Notación%20científica.png)

---

### 🎒 Resumen

|Tipo|¿Qué representa?|Ejemplo|
|---|---|---|
|`Boolean`|Verdadero o falso|`true`|
|`Char`|Un carácter|`'A'`|
|`String`|Texto|`"Hola"`|
|`Int`|Número entero|`42`|
|`Float`|Número decimal (simple)|`3.14f`|
|`Double`|Número decimal (preciso)|`3.1415926535`|

---
## 🧮 Operadores en Kotlin

Los operadores nos permiten **realizar operaciones** con los datos que guardamos en las variables.  
Pueden ser operaciones matemáticas, comparaciones o decisiones lógicas.
- [➕ Operadores Matemáticos](#➕%20Operadores%20Matemáticos)
- [🧪 Operadores de Comparación](#🧪%20Operadores%20de%20Comparación)
- [🔗 Operadores Lógicos](#🔗%20Operadores%20Lógicos)
- [🎓 Ejemplo integrador](#🎓%20Ejemplo%20integrador)
- [🧠 Tip: Evaluación de expresiones](#🧠%20Tip%20Evaluación%20de%20expresiones)

---
### ➕ Operadores Matemáticos

Sirven para **realizar cálculos numéricos**.

|Operador|Significado|Ejemplo|
|---|---|---|
|`+`|Suma|`5 + 3` → `8`|
|`-`|Resta|`10 - 4` → `6`|
|`*`|Multiplicación|`2 * 3` → `6`|
|`/`|División|`10 / 2` → `5`|
|`%`|Módulo (resto)|`7 % 3` → `1`|

```kotlin
fun main() {
    val resultado = 10 % 3
    println(resultado) // Imprime 1
}
```

![](Operadores%20matemáticos.png)

---
### 🧪 Operadores de Comparación

Nos permiten comparar valores.  
**Devuelven siempre un resultado Boolean** (`true` o `false`).

|Operador|Significado|Ejemplo|
|---|---|---|
|`==`|Igualdad|`5 == 5` → `true`|
|`!=`|Desigualdad|`5 != 3` → `true`|
|`>`|Mayor que|`7 > 2` → `true`|
|`<`|Menor que|`3 < 4` → `true`|
|`>=`|Mayor o igual que|`5 >= 5` → `true`|
|`<=`|Menor o igual que|`4 <= 6` → `true`|

```kotlin
fun main() {
    val edad = 18
    println(edad >= 18)  // Imprime true
}
```

![](Operadores%20de%20comparación.png)

---
### 🔗 Operadores Lógicos

Se usan para combinar condiciones.  
También **devuelven un valor boolean** (`true` o `false`).

| Operador  | Nombre  | Ejemplo              | Resultado |
| --------- | ------- | -------------------- | --------- |
| **&&**    | **AND** | **true && false**    | `false`   |
| **\| \|** | **OR**  | **false \| \| true** | `true`    |
| **!**     | **NOT** | **!true**            | `false`   |

```kotlin
fun main() {
    val mayorEdad = true
    val tieneDNI = false
    println(mayorEdad && tieneDNI) // false
}
```

📌 **AND (`&&`)**: Solo da `true` si ambas condiciones son verdaderas  
📌 **OR (`||`)**: Da `true` si **al menos una** es verdadera  
📌 **NOT (`!`)**: Invierte el valor (`true` → `false`, y viceversa)

![](Operadores%20lógicos.png)

---
### 🎓 Ejemplo integrador

```kotlin
fun main() {
    val edad = 20
    val tieneDNI = true
    val puedeEntrar = edad >= 18 && tieneDNI
    println("¿Puede entrar? $puedeEntrar") // Imprime ¿Puede entrar? true
}
```

---
## 🧠 Tip: Evaluación de expresiones

Kotlin **evalúa de izquierda a derecha**, pero respeta **prioridades**:

1. `()` Paréntesis
    
2. `!` Negación lógica
    
3. `*`, `/`, `%`
    
4. `+`, `-`
    
5. Comparaciones (`==`, `<`, etc.)
    
6. Lógicos (`&&`, `||`)

Usá paréntesis para **asegurar el orden** y que el código sea más claro.

---
## 🧑‍💻 `readln()` – Leer datos del usuario

Hasta ahora, los datos los escribíamos directamente en el código.  
Pero muchas veces queremos que el **usuario los escriba en la terminal**. Para eso usamos:

```kotlin
val nombre = readln()
```

🧪 Este comando **lee una línea de texto desde la terminal**. Siempre devuelve un `String`.

```kotlin
fun main() {
    println("¿Cómo te llamás?")
    val nombre = readln()
    println("Hola, $nombre!")
}
```

![](Ejemplo%20readln.png)

---

### 🔄 Casteo de tipos

Como `readln()` devuelve siempre un `String`, si queremos convertir ese texto a número usamos:

|Conversión|Función|
|---|---|
|Texto a `Int`|`.toInt()`|
|Texto a `Float`|`.toFloat()`|
|Texto a `Double`|`.toDouble()`|
|Texto a `Boolean`|`.toBoolean()`|

```kotlin
fun main() {
    println("¿Qué edad tenés?")
    val edad = readln().toInt()
    println("El año que viene tendrás ${edad + 1}")
}
```

⚠️ Si el usuario ingresa un valor no numérico, el programa lanza un error.

---
## 🧭 Estructuras de Control

Nos permiten **tomar decisiones** o **repetir acciones**.
### 📚 Tipos de estructuras

| Tipo                                                                                                                          | ¿Para qué sirve?                |
| ----------------------------------------------------------------------------------------------------------------------------- | ------------------------------- |
| [🔹 Secuencial](#🔹%20Secuencial)                                                                                             | Ejecutar instrucciones en orden |
| [🔸 Condicionales (`if` / `else`) y Selección (`when`)](#🔸%20Condicionales%20(`if`%20/%20`else`)%20y%20Selección%20(`when`)) | Ejecutar según una condición    |
| [🔁 Iteración (`while`) y Repetición (`for`)](#🔁%20Iteración%20(`while`)%20y%20Repetición%20(`for`))                         | Repetir mientras se cumpla algo |

![](Tipos%20de%20estructuras%20de%20control.png)

---

### 🔹 Secuencial

Se ejecutan **una después de la otra**, en orden.

```kotlin
fun main() {
    println("Nombre:")
    val nombre = readln()
    println("Hola, $nombre!")
}
```
![](Ejemplo%20readln.png)

---

### 🔸 Condicionales (`if` / `else`) y Selección (`when`)

Sirven para **tomar decisiones** según una condición.

```kotlin
fun main() {
    val edad = readln().toInt()
    if (edad >= 18) {
        println("Mayor de edad")
    } else {
        println("Menor de edad")
    }
}
```

También podés usar `when`, que reemplaza varios `if` seguidos:

```kotlin
val resultado = when (nota) {
    10 -> "Excelente"
    7,8,9 -> "Muy bien"
    6 -> "Aprobado"
    else -> "Desaprobado"
}
```

![](Condicionales.png)

---
### 🔁 Iteración (`while`) y Repetición (`for`)

#### 🌀 `while`: itera un bloque de código mientras una condición sea verdadera (puede no conocerse la cantidad de iteraciones)

```kotlin
var i = 0
while (i < 3) {
    println(i)
    i++
}
```

#### 📦 `for`: repite un bloque de código las veces que se le indique, por ejemplo: recorrer un rango (se conoce la cantidad de iteraciones)

```kotlin
for (i in 1..5) {
    println(i)
}
```

![](Estructuras%20de%20control%20iterativas.png)

---
## 🛠 Funciones Personalizadas

Hasta ahora usamos funciones pre-definidas como `println()`, `readln()`, etc, pero también podemos **crear nuestras propias funciones** para reutilizar código!

```kotlin
fun saludar(nombre: String): String {
    return "Hola, $nombre!"
}

fun main() {
    val mensaje = saludar("Maxi") //Para llamar a una función nombre(parámetros)
    println(mensaje)
}
```

📦 Una función tiene:

- `fun` + nombre
    
- Parámetros entre `()`
    
- Tipo de retorno (opcional)
    
- Un `return` si queremos devolver un valor

También pueden **no retornar nada**:

```kotlin
fun mostrar() {
    println("Esto no retorna nada")
}
```

![](Sintaxis%20de%20funciones.png)

---


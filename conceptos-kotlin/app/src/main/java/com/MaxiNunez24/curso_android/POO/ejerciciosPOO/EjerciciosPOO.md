# Ejercicios de POO para modelar y resolver

## 🚗 Ejercicio: Sistema de vehículos eléctricos y a combustión

Imaginemos que queremos modelar diferentes tipos de vehículos para una aplicación de gestión de transporte.

### Contexto del problema

* Todos los vehículos tienen **marca**, **modelo** y deben poder **arrancar** y **detenerse**.
* Algunos vehículos son **eléctricos**, otros **a combustión**.
* Queremos calcular la **autonomía estimada** de cada vehículo, pero la forma de hacerlo varía según el tipo.

Además:

* Queremos que ciertos vehículos puedan implementar una interfaz de **Conectividad** para conectarse a internet (por ejemplo, para recibir actualizaciones de software o dar navegación GPS).

### Consigna
  * `AutoElectrico`: calcula autonomía en base a la **capacidad de la batería (kWh)** y el **consumo (kWh cada 100 km)**.
  * `AutoCombustion`: calcula autonomía en base a la **capacidad del tanque (litros)** y el **consumo (litros cada 100 km)**.
3. Crear una **interface** `Conectividad` con la función `conectarRed()`.
4. Hacer que `AutoElectrico` implemente también `Conectividad`.
5. Instanciar ambos tipos de autos en un `main()` y demostrar:

  * cómo arrancan y se detienen,
  * cómo se calcula la autonomía,
  * cómo el auto eléctrico puede conectarse a internet, mientras que el de combustión no.

---

### Objetivo didáctico

* Mostrar que **la clase abstracta unifica lo común** y fuerza a definir lo específico (cómo arranca o calcula autonomía).
* Mostrar que la **interface agrega capacidades adicionales**, sin importar la jerarquía de herencia.
* Que vean que usar esto simplifica el diseño y evita repetir lógica.




























## 1. **Sistema de Vehículos**

**Consigna:**
Queremos modelar distintos tipos de vehículos.

* Todos los vehículos tienen una velocidad máxima y un método `mover()`.
* No tiene sentido instanciar directamente un “Vehículo”, por lo que debe ser **abstracto**.
* Los autos y motos implementan `mover()` de forma distinta.
* Además, algunos vehículos pueden ser eléctricos, por lo que deben implementar una interfaz `Electrico` con el método `cargarBateria()`.

👉 *Análisis previo*:

* `abstract class Vehiculo`
* Subclases: `Auto`, `Moto`
* Interface: `Electrico`
---

## 2. **Animales en un zoológico**

**Consigna:**
Un zoológico quiere modelar animales:

* Todos los animales tienen nombre y edad.
* Existen animales que vuelan (`Volador`) y animales que nadan (`Nadador`), definidos como interfaces.
* Ejemplos: `Aguila` (vuela), `Delfin` (nada), `Pato` (vuela y nada).
* La clase base `Animal` debe ser abstracta y tener un método abstracto `hacerSonido()`.

👉 *Análisis previo*:

* `abstract class Animal`
* Interfaces: `Volador`, `Nadador`
* Subclases: `Aguila`, `Delfin`, `Pato`

---

## 3. **Sistema de pagos**

**Consigna:**
Una aplicación maneja distintos métodos de pago:

* Todos los pagos deben procesarse con un método `procesarPago(monto: Double)`.
* Existen distintos medios: `TarjetaCredito`, `Paypal`, `TransferenciaBancaria`.
* Algunos métodos ofrecen reembolso (`Reembolsable`), como `TarjetaCredito` y `Paypal`.
* Otros no, como `TransferenciaBancaria`.
* La clase `Pago` debe ser abstracta.

👉 *Análisis previo*:

* `abstract class Pago`
* Subclases: `TarjetaCredito`, `Paypal`, `TransferenciaBancaria`
* Interface: `Reembolsable` con método `reembolsar(monto: Double)`

---

## 4. **Sistema de empleados**

**Consigna:**
En una empresa existen diferentes tipos de empleados:

* Todos tienen nombre y salario.
* Se quiere calcular el **bono anual**, pero la forma de hacerlo depende del tipo de empleado, así que debe estar en un método abstracto `calcularBono()`.
* Los empleados pueden ser:

    * `Desarrollador` (bono = 20% del salario)
    * `Gerente` (bono = 50% del salario)
* Algunos empleados pueden trabajar de manera remota, lo que se define con la interfaz `Remoto` con el método `conectarVPN()`.

👉 *Análisis previo*:

* `abstract class Empleado`
* Subclases: `Desarrollador`, `Gerente`
* Interface: `Remoto`

---

## 5. **Videojuego de personajes**

**Consigna:**
En un videojuego hay distintos tipos de personajes:

* Todos tienen nombre, nivel y puntos de vida.
* No tiene sentido un personaje genérico, así que `Personaje` debe ser abstracto.
* Deben implementar el método abstracto `atacar()`.
* Algunos personajes pueden usar magia (`Mago`), otros usan fuerza (`Guerrero`).
* Además, algunos personajes tienen la habilidad de volar, definida en la interfaz `Volador`.

👉 *Análisis previo*:

* `abstract class Personaje`
* Subclases: `Mago`, `Guerrero`
* Interface: `Volador`
* Ejemplo: un `MagoVolador` puede heredar de `Mago` e implementar `Volador`.



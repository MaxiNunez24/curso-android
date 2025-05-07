package com.MaxiNunez24.curso_android

/* Estructura de Control IfElse!
    Es también llamada Condicional

   Sólo if:
   if( CONDICIÓN/ES ) Sentencia

   If de varias sentencias:
   if( CONDICIÓN/ES ) {
        Sentecias
   }

   IfElse:
   if( CONDICIÓN/ES ) Sentencia
   else Sentencia

 */

fun esMayorDeEdad(edad: Int): Boolean {
    return if(edad >= 18) true
    else false
}

fun iniciarSesion(nombre: String, contraseña: String): Boolean {
    return if("Maxi" == nombre){
        if("12345" == contraseña) true
        else false
    }else false
}

fun ifBasico(animal: String){
    if(animal == "perro") println("Es un perro!")
    else if(animal == "gato") println("Es un gato!")
    else if(animal == "caballo") println("Es un caballo")
    else if (animal == "puma") println("CORRAN!")
    else println("No es un perro ni un gato!")
}

/* Para sacar un registro de conducir se necesita:
 ser mayor de edad o, en caso contrario, tener el
 permiso de los padres / tutores
 cree una función que dada una edad y si tiene permiso
 o no, devuelva "Usted puede sacar el registro"
 "Vuelva cuando tenga permiso"
*/

fun sacarRegistro(edad: Int, permiso: Boolean): String{
    return if(edad >= 18){
        "Usted puede sacar el registro"
    } else {
        if(permiso) "Usted puede sacar el registro"
        else "Vuelva cuando tenga permiso"
    }
}

fun sacarRegistro2(edad: Int, permiso: Boolean): String{
    return if(edad >= 18) "Usted puede sacar el registro"
    else if(permiso) "Usted puede sacar el registro"
    else "Vuelva cuando tenga permiso"
}

fun sacarRegistro3(edad: Int, permiso: Boolean): String{
    return if(edad >= 18 || permiso) "Usted puede sacar el registro"
    else "Vuelva cuando tenga permiso"
}

// DRY: Don't Repeat Yourself

fun main() {
    println(sacarRegistro3(18, false))
    println(sacarRegistro3(16, false))
    println(sacarRegistro3(17, true))
}



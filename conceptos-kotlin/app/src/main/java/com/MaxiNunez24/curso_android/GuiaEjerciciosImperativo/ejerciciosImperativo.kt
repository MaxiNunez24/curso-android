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

fun main(){
    ejercicio1Heladero()
}
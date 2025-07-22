package com.MaxiNunez24.curso_android.Sintaxis

fun operacionesConListas(){
    val listaDeAmigos : MutableList<String> = mutableListOf("Pepe", "Pedro", "Paola", "Pablito")

    listaDeAmigos.add("Nestor")

    val listaFiltrada : List<String> = listaDeAmigos.filter { amigo -> amigo.contains("Pe") }

    println(listaFiltrada)

    val listaMapeada : List<Int> = listaDeAmigos.indices.map { index -> index }

    val listaDuplicada : List<Int> = listaMapeada.map {num -> num * 2}

    println(listaDuplicada)
    println(listaMapeada)


    /*if(listaDeAmigos[0].uppercase().equals("PEPE")) println("Son lo mismo!")
    else println("Son distintos!")*/

    /*if(listaDeAmigos.contains("Pepe")) println("Lo tiene! :D")
    else println("No lo tiene :c") */
}

fun list(){
    val diasDeSemana : List<String> = listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    // diasDeSemana[0] = "No Lunes" -> INMUTABLE!
    println(diasDeSemana) // Se imprime bien a diferencia de los Arrays!


    // Mismas operaciones que con MutableList y Arrays!
}


fun mutableList(){

    val listaDeAmigos : MutableList<String> = mutableListOf("Pepe", "Pedro", "Paola", "Pablito")
    listaDeAmigos.add("Lauti")
    //println(listaDeAmigos)
    listaDeAmigos[1] = "Rodolfo"
    // println(listaDeAmigos[1])

    //for(amigo in listaDeAmigos) println(amigo)

    listaDeAmigos.add("Brandon")

    //listaDeAmigos.forEach { amigo -> println(amigo) }

    listaDeAmigos.add("Guada")

    listaDeAmigos.removeAt(0) // Elimina al primer amigo
    // for((index, amigo) in listaDeAmigos.withIndex()) println("$index -> $amigo")

    println(listaDeAmigos.first()) // Trae el primero

    println(listaDeAmigos.last()) // Trae al último

    if(listaDeAmigos.size >= 100) println(listaDeAmigos[99])

}

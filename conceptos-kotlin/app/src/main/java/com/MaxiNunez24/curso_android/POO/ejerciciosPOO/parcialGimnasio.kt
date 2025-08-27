package com.MaxiNunez24.curso_android.POO.ejerciciosPOO

import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalTime
import java.time.temporal.ChronoUnit

// Retorna `true` si fecha es Domingo
fun esDomingo(fecha: LocalDate): Boolean {
    return fecha.dayOfWeek == DayOfWeek.SUNDAY
}

// Calcula la diferencia en años entre inicio y fin
fun calcularDiferenciaEnAnios(inicio: LocalDate, fin: LocalDate): Long {
    return ChronoUnit.YEARS.between(inicio, fin)
}

// Retorna `true` si `hora` es en turno mañana (entre 7:00 y 12:00)
fun iniciaEnManiana(hora: LocalTime): Boolean {
    val inicio = LocalTime.of(7, 0) // 7:00 AM
    val fin = LocalTime.of(12, 0) // 12:00 PM
    return !hora.isBefore(inicio) && !hora.isAfter(fin)
}
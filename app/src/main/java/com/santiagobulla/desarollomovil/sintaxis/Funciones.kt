package com.santiagobulla.desarollomovil.sintaxis

fun main() {
//    variablesNumericas()
    printName();
    showName("David")
    printFullName("Santiago", "bulla")
    println(subtract(100, 98))
    println(subtract2(1000, 928))
}

//funciones basicas
fun printName() {
    println("Mi nombre es santiago")
}

//funcion con parametros de entrada
fun showName(name: String) {
    println("Tu nombres es: $name")
}

//funcion con varios parametros de entrada
fun printFullName(firstName: String, lastName: String) {
    println(firstName + " " + lastName)
}

//funcion con parametros de salida
fun subtract(num1: Int, num2: Int): Int {
    return num1 - num2
}

//funcion con parametros de salida simplificado
fun subtract2(num1: Int, num2: Int): Int = num1 - num2


fun variablesNumericas() {
    //scope de la funcion {alcance de la funcion}
    /*Variables numericas*/

    //numeros enteros Int
    var numeroEntero: Int = 18
    var numeroEntero2: Int = 89

    val sum = numeroEntero + numeroEntero2
    val res = numeroEntero - numeroEntero2
    val mul = numeroEntero * numeroEntero2
    val div = numeroEntero / numeroEntero2
    val module = numeroEntero % numeroEntero2
    println("Suma: ")
    println(sum)
    println("Resta: ")
    println(res)
    println("Multiplicacion: ")
    println(mul)
    println("Division: ")
    println(div)
    println("Modulo: ")
    println(module)

}
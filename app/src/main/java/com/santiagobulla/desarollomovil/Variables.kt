package com.santiagobulla.desarollomovil

fun main() {
    //VARIABLES SE DECLARAN CON VAR Y CONSTANTES CON VAL

    /*Variables numericas*/

    //numeros enteros Int
    var numeroEntero: Int = 18
    var numeroEntero2: Int = 89
    //numeros entero muy grandres
    val enteroGrande: Long = 12345678990
    //numeros decimales Float deben terminar con la letra f minuscula {6 deciamles}
    var decimal: Float = 16.9f
    //numeros decimales grandes Double {14 decimales}
    val decimalGrande: Double = 3.1416//...


    /*variables alfanumericas textos*/

    //Char soporta un caracter y va en comillas simples
    var caracter1: Char = 'p'
    val caracter2: Char = '@'
    var caracter3: Char = '3'

    //textos String con comillas dobles
    var txt: String = "hola mundo"

    /*variables booleamas*/
    val boleano1: Boolean = true //constant
    var boleano2: Boolean = false

    /*FUNCIONES ARITMETICAS*/
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


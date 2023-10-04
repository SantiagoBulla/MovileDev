package com.santiagobulla.desarollomovil

fun main() {
    //OPERADORES DE COMPARACION
    /* > < >= <= == !=*/
    //OPERADORES LOGICOS
    /* && || !*/

    ifBasic()
    ifElse()
    ifAnidados()
    operadorNegacion()
    ifAge()
    condicionesMultiples()
    //WHEN
    getMoth(8)
    getTrimester(10)
    getSemester(3)
    result(true)
    getSemesterReturn(1)
}

//IF-ELSE Y ELSE-IF
fun ifBasic() {
    val name = "David"
    if (name == "David") {
        println("La variable name es David")
    }
}

fun ifElse() {
    val name = "JOse"
    if (name == "David") {
        println("La variable name es David")
    } else {
        println("La variable name no es David")
    }
}

fun ifAnidados() {
    val pet = "cat"
    if (pet == "cat") {
        println("es un gato")
    } else if (pet == "dog") {
        println("es un perro")
    } else if (pet == "bird") {
        println("es un pajaro")
    } else {
        println("el animal no se encuentra ")
    }
}

fun operadorNegacion() {
    val happy = true
    if (!happy) {
        println("Estas feliz")
    } else {
        println("estas triste ")
    }
}

fun ifAge() {
    val age = 29
    if (age >= 18) {
        println("Beber cerveza")
    } else {
        println("Bebe juguito")
    }
}

fun condicionesMultiples() {
    var pet = "cat"
    var color = "black"
    if ((pet == "cat" && color == "black") || (pet == "dog" && color == "brown")) {
        println("Su mascota esta muy severa")
    }

    var num1 = 89
    var num2 = 1228
    if (num1 >= num2 && (pet == "cat")) {
        println("Mera finura")
    } else {
        println("Viva Gsus")
    }
}

//WHEN
fun getMoth(month: Int) {
    when (month) {
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> println("Noviembre")
        12 -> println("Diciembre")
        else -> {
            println("Con llaves se puede usar mas de una linea en un case del when")
            println("Ese mes no existe")
        }
    }
}

fun getTrimester(month: Int) {
    when (month) {
        1, 2, 3 -> println("Primer trimestre")
        4, 5, 6 -> println("Segundo trimestre")
        7, 8, 9 -> println("Tercero trimestre")
        10, 11, 12 -> println("Cuarto trimestre")
        else -> println("Ese mes no existe")
    }
}

fun getSemester(month: Int) {
    when (month) {
        in 1..6 -> println("Primer semestre")
        in 7..12 -> println("Segundo semestre")
        !in 1..12 -> println("Semestre no valido")
    }
}

fun result(value:Any){
    when(value){
        is Int -> value + value
        is String -> println("Kotlin sabe que $value es un string")
        is Boolean -> println(!value)
    }
}

fun getSemesterReturn(month: Int):String {
    return when (month) {//la funcion retornara el string que solucione el when
        in 1..6 -> "Primer semestre"
        in 7..12 -> "Segundo semestre"
        !in 1..12 -> "Semestre no valido"
        else -> {"No sirvio el programa"}
    }
}
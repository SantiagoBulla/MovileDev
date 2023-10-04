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
}

fun ifBasic(){
    val name = "David"
    if(name == "David"){
        println("La variable name es David")
    }
}

fun ifElse(){
    val name = "JOse"
    if(name == "David"){
        println("La variable name es David")
    }else{
        println("La variable name no es David")
    }
}

fun ifAnidados(){
    val pet = "cat"
    if (pet == "cat"){
        println("es un gato")
    }else if(pet == "dog"){
        println("es un perro")
    }else if(pet == "bird"){
        println("es un pajaro")
    }else{
        println("el animal no se encuentra ")
    }
}

fun operadorNegacion(){
    val happy = true
    if (!happy){
        println("Estas feliz")
    }else{
        println("estas triste ")
    }
}

fun ifAge(){
    val age = 29
    if (age >=18){
        println("Beber cerveza")
    }else{
        println("Bebe juguito")
    }
}

fun condicionesMultiples(){
    var pet = "cat"
    var color = "black"
    if ((pet == "cat" && color == "black") || (pet == "dog" && color == "brown")){
        println("Su mascota esta muy severa")
    }

    var num1 = 89
    var num2 = 1228
    if (num1 >= num2 && (pet == "cat") ){
        println("Mera finura")
    }else{
        println("Viva Gsus")
    }
}
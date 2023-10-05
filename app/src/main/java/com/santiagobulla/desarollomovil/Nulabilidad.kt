package com.santiagobulla.desarollomovil

fun main() {
    var name: String? = null //la variable tipo string recibe un valor null

    //COMO MANEJAR LA NULABILIDAD

    //MANERA 1
    println(name!![3])//los !! indican a kotlin que es seguro que la variable name no es null y que acceda a la posicion 3 de la cadena de texto
    //println(name!!.get(3))

    //MANERA 2
    println(name?.get(3))//? indica a kotlin que si la variable no es nula acceda a la posicion 3 del string, si no se cumple imprime null

    //MANERA 3
    println(name?.get(3) ?: "La variable es de tipo null no se puede acceder a la posicion 3")
    //?: indica a kotlin que si la variable name es null, entonces imprima por pantalla el texto que se agrego

}
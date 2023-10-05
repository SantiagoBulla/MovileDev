package com.santiagobulla.desarollomovil.sintaxis

fun main() {
    //inmutableList()
    mutableList()
}

fun inmutableList() {
    val readOnly: List<String> =
        listOf("cat", "dog", "horse", "lion", "bee", "duck", "bird", "beard", "crocodile")
    //metodos de listas
    readOnly.size //muestra el tamaño de la lista
    readOnly[2] // muestra el elemento en la posicion 2
    readOnly.last() // muestra el ultimo elemento de la lista
    readOnly.first() // muestra el primer elemento de la lista
    //println(readOnly.filter { it.contains("a") })// it -> itera los elementos de la lista y filtra los que contengan la letra 'a'
    readOnly.forEach { pet -> println(pet) }//recorre la lista y por cada elemento el iterador 'pet' sera mostrado por pantalla
}

fun mutableList() {
    var names: MutableList<String> =
        mutableListOf("ana", "jose", "diana", "mario", "lucas", "pedro")

    names.add("david")//agrega un nombre al final de lista
    names.add(0,"santiago")//agrega un nombre a la lista en el indice(posicion) que se le indica
    print( names.asReversed())
}
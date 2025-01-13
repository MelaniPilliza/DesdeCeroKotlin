package com.example.cero.melani.cero

/**
 * Metodos
 */
fun main(){
    showMyName()
    showMyAge(23)
    sum(5,5)

    val printGet = getExample(5,10)
    println (printGet)
}


fun showMyName(){
    println("Me llamo Melani")
}

fun showMyAge(age:Int){
    println("Tengo $age años")
}

fun sum (num1:Int,num2:Int){
    println(num1+num2)
}

//GET: para imprimir hace falta println/print, no se puede imprimir invocando solo el metodo
fun getExample (num1:Int,num2:Int): Int{
    return num1+num2
}


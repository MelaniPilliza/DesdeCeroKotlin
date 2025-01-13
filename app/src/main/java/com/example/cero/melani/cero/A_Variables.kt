package com.example.cero.melani.cero

/**
 * Las variables no tienes porque estar en un metodo (val nombre = "Juan")
 * val: Variable de solo lectura (inmutable después de la inicialización).
 * var: Variable mutable (su valor puede cambiar durante la ejecución).
 * var edad = 25
 * edad = 26
 */


fun main(){
    /**
     * Variables Numéricas
     */
    val age:Int=23
    val example:Long=30
    val floatExample:Float=30.5f
    val doubleExample:Double=3056.54526223

    /**
     * Variables AlfaNuméricas
     */
    val charExample1:Char='e'
    val charExample2:Char='2'
    val charExample3:Char='@'

    val stringExample:String="Melani"
    val smoke:Boolean=false


    /**
     * IMPRIMIMOS POR PANTALLA
     */
    println(stringExample)
    println("Do you smoke?")
    println(smoke)
    println("Multiplicar:")
    println (age*example)

}
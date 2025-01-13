package com.example.cero.melani.cero


fun main() {

}
/******************************************************************
 * IF ELSE
 */
fun ifBoolean(){
    var soyFeliz=false

    if(!soyFeliz){
        println("Estoy triste :(")
    }
}

fun ifAnidado(){
    val animal="Sky"

    if(animal=="dog"){
        println("Es un perrito")
    }else if(animal=="cat"){
        println("Es un gato")
    }else if(animal=="pajaro"){
        println("Es un pajaro")
    }else{
        println("No es uno de los animales esperados")
    }

}



/********************************************************************
 * WHEN
 */

fun getTrimester(month:Int){
    when(month){
        1-> print("Primer trimestre")
        2-> print("Segundo trimestre")
        3-> print("Tercer trimestre")
        4,5,6 -> print("Equis trimstre")
        else -> print("No válido")
    }
}
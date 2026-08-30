package com.example.libreria_clases

open class Persona constructor(
    val nombre:String,
    val edad:Int) {


    open fun presentarse():String{
        return "Hola mi nombre es $nombre y tengo $edad años"
    }

}
class Empleado(nombre:String,
               edad:Int,
               val puesto: String,
               private val salario:Int):
    Persona(nombre, edad) {

    open fun mostrarPuesto(): String {
        return "$nombre trabaja como: $puesto"
    }

    override fun presentarse(): String {
        return "Hola, sou $nombre y mi puesto es $puesto"
    }


}
fun main() {
    val jose = Persona("Jose",  20)
    val eduardo = Empleado("Eduardo",  30, "soporte", 900000)
    println(jose.presentarse())

    println(eduardo.mostrarPuesto())
    println(eduardo.presentarse())

}
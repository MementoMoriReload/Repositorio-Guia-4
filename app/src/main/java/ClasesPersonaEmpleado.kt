open class Persona constructor(
    val nombre:String,
    val edad:Int) {


    open fun presentarse():String{
        return "Hola mi nombre es $nombre y tengo $edad"
    }

    open fun main(){
        val jose = Persona("Jose",  20)
        println(jose.presentarse())

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

    override fun main() {
        val eduardo = Empleado("Eduardo",  30, "soporte", 900000)
        println(eduardo.mostrarPuesto())
        println(eduardo.presentarse())

    }
}
fun main() {
    val jose = Persona("Jose",  20)
    val eduardo = Empleado("Eduardo",  30, "soporte", 900000)
    println(jose.presentarse())

    println(eduardo.mostrarPuesto())
    println(eduardo.presentarse())

}
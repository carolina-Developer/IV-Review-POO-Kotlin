class Persona{
    var nombre : String = ""
    var edad : Int = 0

    constructor(_nombre: String){

    }

    constructor(_nombre: String, _edad: Int){
        nombre = _nombre
        edad = _edad
        println("""
            El nombre de la persona es: $nombre y su edad es $edad
        """.trimIndent())
    }

}


/*class Persona {
    constructor(nombre: String){
        // Codigo
    }
    constructor(nombre: String, edad: Int){
        // Codigo
    }

}
class Cliente: Persona{
    constructor(nombre: String): super(nombre){
        // Codigo
    }
    constructor(nombre: String, edad: Int): super(nombre,edad){
        // Codigo
    }
}*/
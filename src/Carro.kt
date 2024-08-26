class Carro(var modelo: String = "UNKNOW", val placa: String = "UNKNOW"){
    var modeloCarro = modelo
    val placaCarro = placa

    init{
        println("""
            Modelo del carro $modeloCarro
            Placa del carro: $placaCarro 
        """.trimIndent())
    }

}
/* PRIMER Y SEGUNDO EJEMPLO
class Carro(var modelo: String, val placa: String ) {
    var modeloCarro : String
    val placaCarro : String

    //Bloque de inicializacion de variables de constructor
    init{
        modeloCarro = modelo
        placaCarro = placa

        println("""
            Modelo del carro $modeloCarro
            Placa del carro: $placaCarro
        """.trimIndent())

    }

}*/
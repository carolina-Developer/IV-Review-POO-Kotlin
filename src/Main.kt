
    fun main() {
        // Lista no mutable (inmutable)
        val listaInmutable = listOf("Manzana", "Banana", "Cereza")
        println("Lista inmutable: $listaInmutable")

        // Lista mutable
        val listaMutable = mutableListOf("Manzana", "Banana", "Cereza")
        println("Lista mutable antes de agregar: $listaMutable")

        // Agregar un elemento a la lista mutable
        listaMutable.add("Durazno")
        println("Lista mutable después de agregar: $listaMutable")
    }


/*
QUINTO EJERCICIO
    val fruitInventory = hashMapOf("Manzanas" to 30, "Naranjas" to 20, "Bananas" to 25)
    println("Inventario Inicial: $fruitInventory")

    // Add a new key-value pair
    fruitInventory["Peras"] = 15
    println("Inventario actualizado: $fruitInventory")

    // Access the corresponding value using a specified key
    val appleCount = fruitInventory["Manzanas"]
    println("Numero de manzanas: $appleCount")

    // Update the quantity for a specified key
    fruitInventory["Bananas"] = fruitInventory["Bananas"]?.plus(8) ?:8
    println("Neva cuenta de bananas: ${fruitInventory["Bananas"]}")

    // Remove a key-value pair
    fruitInventory.remove("Naranjas")
    println("Inventario despues de vender naranjas: $fruitInventory")

CUARTO EJERCICIO
    val empleado1 = Empleado("John Doe", 30, "RH")
    val empleado2 = empleado1.copy(nombre = "Jane Doe")

    println(empleado1) // Salida: Empleado(nombre=John Doe, edad=30, departamento=RH)
    println(empleado2) // Salida: Empleado(nombre=Jane Doe, edad=30, departamento=RH)

    // Desestructuración
    val (nombre, edad, departamento) = empleado1
    println(nombre) // Salida: John Doe
    println(edad) // Salida: 30
    println(departamento) // Salida: RH

TERCER EJERCICIO
val carro = Carro("Suzuki", "KSE90E")

SEGUNDO EJERCICIO
val carro = Carro("Ford", "Kss31G")
   println("Modelo: ${carro.modelo}")
   println("Placa: ${carro.placa}")*/
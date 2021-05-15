package Array

fun main (){
    //Global
    val empleados = arrayOf("David","Josue","Irving",2);

    //int
    val empleados2 = intArrayOf(1,2,3,4);

    println(empleados[0])

    //obtener tamaño
    println (empleados.size)


    for(x in 0 until empleados.size){
        println(empleados[x])
    }

    println("ArrayList")

    val empleadosList = arrayListOf("David","Juan","Jesus")

    for(empleado in empleadosList){
        println(empleado)
    }
    println("-----------------------")
    println(empleadosList.size)

    empleadosList.add("Gabriel")
    empleadosList.removeAt(1) // remuevo por index
    println(empleadosList.size)
    empleadosList.sort() //los ordena alfabeticamente
    for(empleado in empleadosList){
        println(empleado)
    }
    
    //foreach
    
    empleadosList.forEach { empleado ->
        println(empleado)
    }

    empleadosList.forEachIndexed { i,empleado->
        println("$i - $empleado")
        println("---------------")
    }
    


}
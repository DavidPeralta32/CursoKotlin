package Ejercicio1

fun main (){
    println("ingrese la calle ");
    val calle = readLine()!!.toString();
    println("ingrese la ciudad ");
    val ciudad = readLine()!!.toString();
    println("ingrese el estado ");
    val estado = readLine()!!.toString();
    println("ingrese el pais");
    val pais = readLine()!!.toString();
    println("ingrese su codigo postal");
    val cPostal = readLine()!!.toString();

    println("""
        *****Su direccion es: *****
        $calle, $ciudad, $estado, $pais, $cPostal
    """.trimIndent())

}
import java.text.DecimalFormat

var tasaCambio = 0.0;
var pesosEnCaja = 0.0;
var dolaresEnCaja = 0.0;

fun main (){
    print("Ingrese la tasa de cambio de dolar a peso: $");
    tasaCambio = readLine()!!.toDouble()
    print("Ingrese la cantidad de pesos para la apertura de caja: $");
    pesosEnCaja = readLine()!!.toDouble()
    print("Ingrese la cantidad de dolares para la apertura de caja: $");
    dolaresEnCaja = readLine()!!.toDouble()

    controloperaciones();

}

fun controloperaciones(){
    print("Ingrese la cantidad de dolares a cambiar")
    val dolaresACambiar = readLine()!!.toDouble()

    dolaresEnCaja += dolaresACambiar;

    val pesosAEntregar = tasaCambio * dolaresACambiar;

    pesosEnCaja -= pesosAEntregar;

    println("""
        --Recibo----
        Pesos mexicanos a entregar $ ${DecimalFormat("#,###.00").format(pesosAEntregar)}
        
        pesos en caja $ ${DecimalFormat("#,###.00").format(pesosEnCaja)}
        dolares en caja$ ${DecimalFormat("#,###.00").format(dolaresEnCaja)}
        """".trimIndent());

    controloperaciones();
}
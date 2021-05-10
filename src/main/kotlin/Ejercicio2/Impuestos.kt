package Ejercicio2

import java.text.DecimalFormat

fun main(){
    print("Ingrese su sueldo bruto mensual")
    var sueldo = readLine()!!.toDouble();
    print("Ingrese el porcentaje de impuesto a pagar al mes")
    var impuesto = readLine()!!.toDouble();

    impuesto *=  .01;


    var impuestoMes = sueldo * impuesto
    var sueldoNeto =sueldo - impuestoMes


    println("""
        ****Control de impuestos ****
        Salario mensual neto: ${DecimalFormat("#,###.00").format(sueldoNeto)}
        impuesto a pagar por mes: ${DecimalFormat("#,###.00").format(impuestoMes)}
        
        Salario anual neto: ${sueldoNeto*12}
        impuesto a pagar por ano: ${impuestoMes*12}
    """.trimIndent())
}
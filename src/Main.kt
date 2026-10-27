//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var saldo = 500.0
    var opcion =0

    println("===== CAJERO AUTOMÁTICO =====")
    println("1. Consultar saldo")
    println("2. Ingresar dinero")
    println("3. Retirar dinero")
    println("4. Salir")
    println("Seleccione una opción:")

    opcion = readln().toInt()


    when (opcion) {
        1 -> println("Has seleccionado consultar saldo")
        2 -> println("Has seleccionado ingresar dinero")
        3 -> println("Has seleccionado retirar dinero")
        4 -> println("Has seleccionado salir")
        else -> println("Opción no válida")
    }



}
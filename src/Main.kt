//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var saldo = 500.0
    var opcion = 0

    do {
        println("===== CAJERO AUTOMÁTICO =====")
        println("1. Consultar saldo")
        println("2. Ingresar dinero")
        println("3. Retirar dinero")
        println("4. Salir")
        println("Seleccione una opción:")

        opcion = readln().toInt()

        when (opcion) {
            1 -> println("Tu saldo actual es: $saldo €")
            2 -> {
                println("Introduce la cantidad que quieres ingresar:")
                val cantidad = readln().toDouble()

                if (cantidad > 0) {
                    println("Cantidad válida")
                } else {
                    println("Error: la cantidad debe ser mayor que cero")
                }
            }
            3 -> println("Has seleccionado retirar dinero")
            4 -> println("Saliendo del cajero. ¡Hasta pronto!")
            else -> println("Opción no válida")
        }
    } while (opcion != 4)
}
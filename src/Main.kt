//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun main() {
    var saldo = 500.0
    var opcion = 0

    do {
        println("\n===== CAJERO AUTOMÁTICO =====")
        println("1. Consultar saldo")
        println("2. Ingresar dinero")
        println("3. Retirar dinero")
        println("4. Salir")
        println("Seleccione una opción:")

        val entradaOpcion = readln()
        opcion = entradaOpcion.toIntOrNull() ?: 0

        when (opcion) {
            1 -> {
                println("Tu saldo actual es: $saldo €")
            }

            2 -> {
                println("Introduce la cantidad que quieres ingresar:")
                val cantidad = readln().toDoubleOrNull()

                if (cantidad == null) {
                    println("Error: introduce una cantidad numérica.")
                } else if (cantidad > 0) {
                    saldo += cantidad
                    println("Ingreso realizado correctamente.")
                    println("Nuevo saldo: $saldo €")
                } else {
                    println("Error: la cantidad debe ser mayor que cero.")
                }
            }

            3 -> {
                println("Introduce la cantidad que quieres retirar:")
                val cantidad = readln().toDoubleOrNull()

                if (cantidad == null) {
                    println("Error: introduce una cantidad numérica.")
                } else if (cantidad <= 0) {
                    println("Error: la cantidad debe ser mayor que cero.")
                } else if (cantidad > saldo) {
                    println("Error: no tienes saldo suficiente.")
                } else {
                    saldo -= cantidad
                    println("Retirada realizada correctamente.")
                    println("Nuevo saldo: $saldo €")
                }
            }

            4 -> {
                println("Saliendo del cajero. ¡Hasta pronto!")
            }

            else -> {
                println("Opción no válida. Selecciona una opción del 1 al 4.")
            }
        }

    } while (opcion != 4)
}


fun main() {
    var saldo = 500.0 // Saldo inicial
    var opcion = 0 // Opción seleccionada

    do {
        // Mostrar menú
        println("\n===== CAJERO AUTOMÁTICO =====")
        println("1. Consultar saldo")
        println("2. Ingresar dinero")
        println("3. Retirar dinero")
        println("4. Salir")
        println("Seleccione una opción:")

        // Leer opción elegida
        opcion = readln().toIntOrNull() ?: 0

        when (opcion) {
            1 -> {
                // Consultar saldo
                println("Tu saldo actual es: $saldo €")
            }

            2 -> {
                // Ingresar dinero
                println("Introduce la cantidad que quieres ingresar:")
                val cantidad = readln().toDoubleOrNull()

                if (cantidad == null) {
                    println("Error: introduce una cantidad numérica.")
                } else if (cantidad > 0) {
                    saldo += cantidad // Actualizar saldo
                    println("Ingreso realizado. Nuevo saldo: $saldo €")
                } else {
                    println("Error: la cantidad debe ser mayor que cero.")
                }
            }

            3 -> {
                // Retirar dinero
                println("Introduce la cantidad que quieres retirar:")
                val cantidad = readln().toDoubleOrNull()

                if (cantidad == null) {
                    println("Error: introduce una cantidad numérica.")
                } else if (cantidad <= 0) {
                    println("Error: la cantidad debe ser mayor que cero.")
                } else if (cantidad > saldo) {
                    println("Error: saldo insuficiente.")
                } else {
                    saldo -= cantidad // Actualizar saldo
                    println("Retirada realizada. Nuevo saldo: $saldo €")
                }
            }

            4 -> {
                // Salir del cajero
                println("Saliendo del cajero. ¡Hasta pronto!")
            }

            else -> {
                // Opción no válida
                println("Opción no válida. Selecciona del 1 al 4.")
            }
        }
    } while (opcion != 4) // Repetir hasta salir
}

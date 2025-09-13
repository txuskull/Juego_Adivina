fun main() {
    while (true) {
        println("Introduce un número:")
        val numero = readln().toInt()

        if (numero == 0) {
            println("El número es neutro y par")
        } else {
            if (numero > 0) {
                if (numero % 2 == 0) {
                    println("El número es positivo y par")
                } else {
                    println("El número es positivo y impar")
                }
            } else { // número < 0
                if (numero % 2 == 0) {
                    println("El número es negativo y par")
                } else {
                    println("El número es negativo y impar")
                }
            }
        }

        print("\n¿Deseas hacer otra operación? (s/n): ")
        if (readln().trim().lowercase() != "s") {
            println("¡Hasta luego!")
            break
        }
    }
}

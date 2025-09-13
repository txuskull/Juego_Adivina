import kotlin.system.exitProcess

fun main() {
    while (true) {
        println("++++++++++++++++")
        println("===== MENÚ =====")
        println("1. Sumar")
        println("2. Restar")
        println("3. Comprobar palíndromo")
        println("4. Numero primo")
        println("5. Factorial")
        println("6. Salir")
        println("===== MENÚ =====")
        println("++++++++++++++++")

        var a = readln().toInt()

        if (a == 6){
            println("Saliendo....")
            break
        }
        if (a !in 1..5){
            println("Opcion no valida")
            continue
        }

        if (a == 1){
            println("Introduce el primer numero:")
            var num1 = readln().toInt()
            println("Introduce el segundo numero")
            var num2 = readln().toInt()
            println("La suma de $num1 + $num2 = " + (num2+num1))
        }
        if (a == 2){
            println("Introduce el primer numero:")
            var num1 = readln().toInt()
            println("Introduce el segundo numero")
            var num2 = readln().toInt()
            println("La resta de $num1 - $num2 = " + (num1-num2))
        }
        if (a == 3){
            println("Introduce la palabra a comprobar")
            var palabra = readln().lowercase()
            var alreves = palabra.reversed()
            if (palabra == alreves){
                println("La palabra es palindromo")
            }else println("No lo es")
        }

        if (a == 4){
            println("Introduce el numero que deseas comprobar si es primo")
            val numPrimo = readln().toInt()
            if (numPrimo <= 1){
                println("El numero no es primo")
            }else{

                var esPrimo = true

                for (i in 2 until numPrimo){
                    if (numPrimo % i == 0){
                        esPrimo = false
                        break
                    }
                }
                if (esPrimo){
                    println("El numero $numPrimo es primo")
                }else{
                    println("El numero $numPrimo no es primo")
                }
            }

        }

        if (a == 5){
            println("Intruduce un numero para calcular el factorial")
            var numero = readln().toInt()

            if (numero < 0){
                println("❌ El factorial no está definido para números negativos😂🐗")
            }else{

                var factorial: Long = 1

                for (i in 1..numero){
                    factorial *= i
                }
                println("El factorial de $numero es $factorial")
            }
        }








    }
}





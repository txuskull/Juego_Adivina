fun main(){

    var record: Int? = null

    while (true) {
        println("juego acierta el numero entre el 1 y 100")
        var secreto = (1..100).random()
        var contador = 0
        val intentos = mutableListOf<Int>()

        while (true) {


            println("inserta el numero que creas que es")
            var numero = readln().toInt()

            if (numero > 100 || numero < 0){
                println("debes introducir un numero entre 0 y 100")
                continue
            }

            if (numero == 0) {
                println("saliendo....")
                break
            }
            contador++
            intentos.add(numero)

            if (numero == secreto) {
                println("has ganado el numero era $secreto y lo has conseguido en $contador intentos")

                //Primera partida → record = null.
                //Ganas en 4 intentos → record == null se cumple → se guarda record = 4.
                if (record == null || record > contador){
                    record = contador
                    println("nuevo record conseguido en $contador intentos")
                }else{
                    println("tu record actual sigue siendo en  $record intentos")
                }
                println("📜 Tus intentos fueron: $intentos")
                break

            } else if (numero < secreto) {
                println("El numero es mayor")

            } else {
                println("el numero es menor")

            }
            if (contador == 10) {
                println("Has perdido 😢, máximo 5 intentos. El número era $secreto")
                break
            }


        }

        println("quieres volver a jugar otra vez? (s/n)")
        val respuesta = readln().lowercase()
        if (respuesta != "s") {
            println("hasta la proxima")
            break

        } else {
            println("vamos alla")

        }
    }
}


fun main(){

    var record: Int? = null

    while (true) {

        println("++++++++++++++++++++++++++++++++++++++++++++++++++++")
        println("==============JUEGO_ADIVINA_EL_NUMERO===============")
        println("++++++++++++++++++++++++++++++++++++++++++++++++++++")
        println("Elige dificultad: 1 = Fácil, 2 = Normal, 3 = Difícil")
        println("++++++++++++++++++++++++++++++++++++++++++++++++++++")
        println("++++++++++++++++++++++++++++++++++++++++++++++++++++")
        val nivel = readln().toInt()

        val rangoMaximo: Int
        val intentosMaximos: Int

        when(nivel){
            1 -> { rangoMaximo = 50; intentosMaximos = 15}
            2 -> { rangoMaximo = 100; intentosMaximos = 10}
            3 -> { rangoMaximo = 500; intentosMaximos = 8}
            else -> {
                println("Opcion no valida, se usara dificultad NORMAL")
                rangoMaximo = 100
                intentosMaximos = 10
            }
        }

        println("+++++++++++++++++++++EMPIEZA__EL__JUEGO++++++++++++++++++++")
        println("Acierta el numero entre el 1 y $rangoMaximo")

        var secreto = (1..rangoMaximo).random()
        var contador = 0
        val intentos = mutableListOf<Int>()

        while (true) {

            println("+++++++++++++++++++++++JUGANDO+++++++++++++++++++++++++++")
            println("Inserta el numero que crees que es  || ([ 0 para salir ])")
            var numero = readln().toInt()

            if (numero > rangoMaximo || numero < 0){
                println("Debes introducir un numero entre 0 y $rangoMaximo")
                continue
            }

            if (numero == 0) {
                println("SALIENDO....")
                break
            }
            contador++
            intentos.add(numero)

            if (numero == secreto) {//ACIERTOOO
                println("Has ganado el numero era $secreto y lo has conseguido en $contador intentos")

                //Primera partida → record = null.
                //Ganas en 4 intentos → record == null se cumple → se guarda record = 4.
                if (record == null || record > contador){
                    record = contador
                    println("Nuevo record conseguido en $contador intentos")
                }else{
                    println("Tu record actual sigue siendo en  $record intentos")
                }
                println("Tus intentos fueron: $intentos")
                break

            } else if (numero < secreto ) {
                println("El numero es mayor")

            } else {
                println("El numero es menor")

            }
            if (contador == intentosMaximos) {
                println("Has perdido, máximo $intentosMaximos intentos. El número era $secreto")
                println("Tus numeros fueron: $intentos")
                break
            }


        }
        //+++++++++++++++++++++++FIN++++++++++++++++++++++++
        println("Quieres volver a jugar otra vez? (s/n)")
        val respuesta = readln().lowercase()
        if (respuesta != "s") {
            println("Hasta la proxima")
            break
        } else {
            println("Vamos alla")
        }
    }
}


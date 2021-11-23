import kotlin.math.pow

fun main(args: Array<String>) {

    println("Operações matematicas: + (adição), - (subtração), * (multiplicação), / (divisão) e ** (potência")
    print("Escolha uma operação: ")

    var escolha = readLine()!!
    print("Digite o primeiro numero: ")
    var num1 = readLine()!!.toDouble()
    print("Digite o segundo numero: ")
    var num2 = readLine()!!.toDouble()


    fun adição(num1: Double, num2: Double) {
        var result = num1 + num2
        println("$num1 + $num2 = $result")
    }

    fun subtração(num1: Double, num2: Double) {
        var result = num1 - num2
        println("$num1 - $num2 = $result")
    }

    fun multiplicação(num1: Double, num2: Double) {
        var result = num1 * num2
        println("$num1 * $num2 = $result")
    }

    fun divisão(num1: Double, num2: Double) {
        var result = num1 / num2
        println("$num1 / $num2 = $result")
    }

    fun potência(num1: Double, num2: Double) {
        var result = num1.pow(num2)
        println("$num1 ** $num2 = $result")
    }

    when (escolha) {
        "+" -> adição(num1, num2)
        "-" -> subtração(num1, num2)
        "*" -> multiplicação(num1, num2)
        "/" -> divisão(num1, num2)
        "**" -> potência(num1, num2)

    }
}



/*
Exercício 1

1 - Criem um novo projeto que se chama Calculadora
2 - Implemente uma função para cada operação aritmética

- Adição
- Subtração
- Multiplicação
- Divisão

3 - Na função Main, chame todas as funções com valores diferentes (pelo menos uma vez)
4 - Se desafiem, adicionando, ainda, uma função para calcular a potência de um número, com qualquer expoente.
 */
package br.com.fiap.imc

import kotlin.math.pow

fun calcularIMC(peso: Int, altura: Double): Double {

    val imc = peso / altura.pow(2)

    return imc

}

fun classificarImc(imc: Double): String {

    if (imc < 18.5) {
        return "Abaixo do peso"
    } else if (imc < 25.0){
        return "Peso normal"
    } else if (imc < 30.0){
        return "Sobrepeso"
    } else if (imc < 35.0){
        return "Obesidade grau 1"
    } else if (imc < 40.0){
        return "Obesidade grau 2"
    } else {
        return "Obesidade grau 3"
    }
}
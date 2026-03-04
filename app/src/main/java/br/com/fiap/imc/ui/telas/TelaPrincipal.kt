package br.com.fiap.imc.ui.telas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import br.com.fiap.imc.calcularIMC
import br.com.fiap.imc.ui.telas.componentes.Cabecalho
import br.com.fiap.imc.ui.telas.componentes.Formulario
import br.com.fiap.imc.ui.telas.componentes.PainelResultado
import br.com.fiap.imc.ui.theme.IMCTheme

@Composable
fun TelaInicial() {

    Box(
        modifier = Modifier
            .background(Color(0xFF156082))
            .fillMaxSize()
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Transparent),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Cabecalho()
            Formulario(
                aoCalcular = {
                println("Botão Calcular Clicado")
                    val imc = calcularIMC(78,1.78)
                    println("Seu IMC é: $imc")

               }
            )
            PainelResultado()
        }
    }
}

@Preview (showSystemUi = true)
@Composable
private fun TelaInicialPreview() {
    IMCTheme() {
        TelaInicial()
    }
    
}

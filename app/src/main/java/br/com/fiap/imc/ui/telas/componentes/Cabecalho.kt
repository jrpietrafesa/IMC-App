package br.com.fiap.imc.ui.telas.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import br.com.fiap.imc.R
import br.com.fiap.imc.ui.theme.IMCTheme

@Composable
fun Cabecalho() {

    Column(
    horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ){
        Image(
            painter = painterResource(R.drawable.fitnessgym),
            contentDescription = "Logo"
        )
        Text(
            text = "IMC",
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
        )
        Text(
            text = "Índice de Massa Corporal",
            color = Color.White,
        )
    }

}

@Preview(showBackground = false)
@Composable
private fun CabecalhoPreview() {
    IMCTheme() {
        Cabecalho()
    }

}


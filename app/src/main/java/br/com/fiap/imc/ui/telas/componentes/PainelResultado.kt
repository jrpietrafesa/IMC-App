package br.com.fiap.imc.ui.telas.componentes

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.imc.ui.theme.IMCTheme

@Composable
fun PainelResultado(imc: Double = 0.0) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(32.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = "RESULTADOS",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top = 8.dp)
            )

            // Box com os números e texto de baixo *****
            Box(
                modifier = Modifier
                    .height(height = 80.dp)
                    .background(Color.Transparent)
            ) {
                Text(
                    text = String.format("%.2f", imc),
                    fontSize = 48.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = "Normal",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF12DE1D),
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 8.dp)
                )
            }
        }
    }
}

@Preview
@Composable
private fun PainelResultadoPreview() {
    IMCTheme() {
        PainelResultado()
    }
}
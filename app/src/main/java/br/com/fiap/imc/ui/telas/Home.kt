package br.com.fiap.imc.ui.telas

import android.graphics.fonts.Font
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import br.com.fiap.imc.ui.theme.IMCTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Box() {
        Column() {
            Text(
                text = "IMC",
                fontSize = 72.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Text(
             text = "Mantenha a sua saúde",
             color = Color.White,
            )
        }
    }



@Preview
@Composable
private fun HomeScreenPreview() {
    IMCTheme() {
        HomeScreen()
    }
}
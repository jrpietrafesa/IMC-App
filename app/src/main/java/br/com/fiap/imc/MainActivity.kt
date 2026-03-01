package br.com.fiap.imc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import br.com.fiap.imc.ui.telas.TelaInicial
import br.com.fiap.imc.ui.theme.IMCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            IMCTheme {
                TelaInicial()
            }
        }
    }
}

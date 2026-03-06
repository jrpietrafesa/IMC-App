package br.com.fiap.imc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.imc.ui.telas.HomeScreen
import br.com.fiap.imc.ui.telas.TelaInicial
import br.com.fiap.imc.ui.theme.IMCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            IMCTheme {

                //Criar o esquema de navegação
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = "home"){
                    composable("home"){ HomeScreen(navController)}
                    composable("telaimc"){ TelaInicial()}

                    }
                }
            }
        }
    }


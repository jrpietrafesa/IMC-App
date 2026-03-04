package br.com.fiap.imc.ui.telas.componentes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.imc.calcularIMC
import br.com.fiap.imc.classificarImc
import br.com.fiap.imc.ui.theme.IMCTheme


@Composable
fun Formulario(aoCalcular: (Double) -> Unit) {

    var peso by remember { mutableStateOf("") }
    var altura by remember { mutableStateOf("") }


    Column(
        modifier = Modifier
            .padding(32.dp)
            .fillMaxWidth()
    )
    {
        Text(
            text = "Informe os seus dados",
            color = Color.Gray,
            fontSize = 22.sp,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )
        //Formulario 1******************************
        OutlinedTextField(
            value = peso,
            onValueChange = {
                peso = it
            },
            label = {
                Text(
                    text = "Digite o seu peso em KG",
                    color = Color.White // 👈 Cor do texto da label
                )
            },
            modifier = Modifier
                .fillMaxWidth(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Decimal,
                imeAction = ImeAction.Next,
            ),
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.Blue,           // Cor do texto digitado
                unfocusedTextColor = Color.Black,        // Cor do texto sem foco
                focusedBorderColor = Color.White,        // Cor da borda quando selecionado
                unfocusedBorderColor = Color.Gray,       // Cor da borda normal
                focusedLabelColor = Color.Magenta,       // Cor da label quando ativo
                unfocusedLabelColor = Color.DarkGray     // Cor da label normal
            )
        )
        Spacer(modifier = Modifier.height(16.dp))

        // Formulario 2 ******************************
        OutlinedTextField(
            value = altura,
            onValueChange = {
                altura = it
            },
            label = {
                Text(
                    text = "Digite a sua altura em Metros",
                    color = Color.White // 👈 Cor do texto da label
                )
            },
            modifier = Modifier
                .fillMaxWidth(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Decimal,
                imeAction = ImeAction.Done,
            ),
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.Blue,           // Cor do texto digitado
                unfocusedTextColor = Color.Black,        // Cor do texto sem foco
                focusedBorderColor = Color.White,        // Cor da borda quando selecionado
                unfocusedBorderColor = Color.Gray,       // Cor da borda normal
                focusedLabelColor = Color.Magenta,       // Cor da label quando ativo
                unfocusedLabelColor = Color.DarkGray     // Cor da label normal
            )
        )
        Spacer(modifier = Modifier.height(16.dp))

        // Lina onde irão os botões ********************
        Row(
        horizontalArrangement = Arrangement.Absolute.Center,
            modifier = Modifier
                .fillMaxWidth()
        ){
            // Botão 1 Limpar *********************************
            Button(
                onClick = {
                    peso = ""
                    altura = ""
                },
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .padding(end = 2.dp)
                    .weight(1f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFD0544C)
                )
            ) {
                Text(
                    text = "LIMPAR"
                )
            }
            //Spacer(modifier = Modifier.width(8.dp))

            //Botão 2 Calcular  **********************************
            Button(
                onClick = aoCalcular(4.9),
                shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                            .padding(start = 2.dp)
                            .weight(1f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF3F51B5)
                )

            ) {
                Text(
                    text = "CALCULAR"
                )
            }
        }
    }
}

@Preview(showBackground = false)
@Composable
private fun FormularioPreview() {
    IMCTheme() {
        Formulario(aoCalcular = {})
    }
}
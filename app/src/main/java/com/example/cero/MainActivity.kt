package com.example.cero

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cero.ui.theme.CeroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CeroTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

//@Composable: va a llamar Text
//el setContent de arriba solo puede llamar a lo que sea composable
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier //atributo extra: padding,longitud,elevación
    )
}

//@Preview si no quiero instalar,con esta etiqueta puedo llamar a cualquier @Composable--> EJ: Greeting
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CeroTheme {
        Greeting("Android")
    }
}

@Preview (showBackground = true)
@Composable
fun exampleModifier(){
    Text(text="Suscribete", modifier = Modifier.padding(16.dp))
}


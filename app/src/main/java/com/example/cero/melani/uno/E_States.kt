package com.example.cero.melani.uno

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cero.R

class E_States : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            App5()
        }
    }
}


//Lo mismo que Column, solo que LazyColumn permite que al rotar pantalla se pueda bajar por la columna
//En LazyColumn hay que sustituir Column y añadir item para los componentes
@Preview
@Composable
fun App5() {
    /**Estamos creando un estado que sea mutable y le decimos que el
    //valor inicial sea 0 y le estamos diciendo que lo recuerde
    //porque cada vez que se recree la vista, si no hicieramos el remember empezaria siempre desde 0
     **/
    var counter by remember{ mutableStateOf(0) }

    LazyColumn(
        modifier = Modifier.fillMaxSize().background(Color.Magenta).padding(16.dp)
    ) {
        item {
            Image(
                painter = painterResource(id = R.drawable.mariposa),
                contentDescription = "logo mariposa",
                modifier = Modifier.fillMaxWidth().height(400.dp)
            )
            Row( modifier = Modifier.padding(top=8.dp)){
                Image(
                    painter = painterResource(id = R.drawable.baseline_favorite_24),
                    contentDescription = "dislike",
                    //ESTADO
                    modifier = Modifier.clickable{counter++ }
                )
                Text(
                    //MODIFICAMOS text=counter.toString()
                    text = counter.toString(),
                    fontSize = 18.sp,
                    modifier = Modifier.padding(start=4.dp)
                )
            }
            Text(
                text = "Melani Pilliza",
                fontSize = 40.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Text(text = "2DAM")
            Text(text = "HOLA")
            LazyRow (
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth().padding(16.dp)
            ){
                item {
                    Text(text = "JAVA", color = Color.White)
                    Text(text = "KOTLIN", color = Color.White)
                    Text(text = "EJEMPLO", color = Color.White)
                    Text(text = "EJEMPLO", color = Color.White)
                    Text(text = "EJEMPLO", color = Color.White)
                    Text(text = "EJEMPLO", color = Color.White)
                    Text(text = "EJEMPLO", color = Color.White)
                    Text(text = "EJEMPLO", color = Color.White)
                    Text(text = "EJEMPLO", color = Color.White)
                    Text(text = "EJEMPLO", color = Color.White)
                }
            }
        }
    }

}
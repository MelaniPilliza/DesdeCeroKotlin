package com.example.cero.melani.uno

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cero.R

class A_Columnas : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            app()
        }
    }
}

@Preview
@Composable
fun app(){
    Column(modifier = Modifier.fillMaxSize().background(Color.Magenta)) {
        Image(
            painter = painterResource(id=R.drawable.mariposa),
            contentDescription = "logo mariposa",
            modifier = Modifier.fillMaxWidth().height(400.dp)
        )
        Text(
            text="Melani Pilliza",
            fontSize = 40.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign =  TextAlign.Center
        )
        Text(text="2DAM")
        Text(text="HOLA")
    }

}
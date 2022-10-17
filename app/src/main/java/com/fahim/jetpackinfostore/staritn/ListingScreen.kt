package com.fahim.jetpackinfostore.staritn

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.fahim.jetpackinfostore.R

@Composable
@Preview(showBackground = true )
fun ListingScreen(){
    Greeting()
}

@Composable
fun Greeting() {
    Column {
        Text("Hello, World!", style = TextStyle(color = Color.Black))
        Text("Hello, Second World!", style = TextStyle(color = Color.Cyan))
        Text("Hello, Third World!", style = TextStyle(color = Color.Red))
    }
}
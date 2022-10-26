package com.fahim.jetpackinfostore.staritn

import androidx.compose.animation.core.animateIntAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true)
fun ListingScreen(size: Int = 20) {
    Column {
        Column {
            AddTextView(listOf("Hello,World", "Hello", "H"), size)
        }
        Row {
            AddTextView("dfsvnosin smpdosmv psodkpodkls", size)
        }
    }
}

@Composable
fun AddTextView(txtArg: Any? = null, size: Int) {
    if (txtArg is List<*> && txtArg.isNotEmpty()) {
        for (txt in txtArg)
            if (txt is String)
                Text(txt, style = TextStyle(color = Color.Black), fontSize = size.sp)
    } else if (txtArg is String)
        Text(txtArg, style = TextStyle(color = Color.Black), fontSize = size.sp)
}

@Composable
fun AddButton(txtArg: Any? = null, function: () -> Unit) {
    if (txtArg is List<*> && txtArg.isNotEmpty())
        for (txt in txtArg)
            Button(onClick = { function.invoke() }) {
                if (txt is String)
                    Text(text = txt)
            }
    else if (txtArg is String) {
        Button(onClick = { function.invoke() }) {
            Text(text = txtArg)
        }
    }
}
package com.fahim.jetpackinfostore

import android.os.Bundle
import android.support.v4.os.IResultReceiver
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.animateIntAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.fahim.jetpackinfostore.staritn.AddButton
import com.fahim.jetpackinfostore.staritn.ListingScreen
import com.fahim.jetpackinfostore.ui.theme.JetPackInfoStoreTheme

class MainActivity : ComponentActivity() {
    private var sizeNow = mutableStateOf(20)
    private var isBig = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val scrollState = rememberScrollState()
            val size by animateIntAsState(targetValue = sizeNow.value)
            JetPackInfoStoreTheme {
                Column(
                    modifier = Modifier.verticalScroll(
                        state = scrollState
                    )
                ) {
                    ListingScreen(size)
                    AddButton("increase", ::increaseSize)
                }
            }
        }
    }

    private fun increaseSize() {
        if (sizeNow.value >= 60)
            isBig = true
        if (isBig)
            decreaseSize()
        else
            sizeNow.value += 20
    }

    private fun decreaseSize() {
        if (sizeNow.value <= 40)
            isBig = false
        sizeNow.value -= 20
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreView() {
        val scrollState = rememberScrollState()
        val size by animateIntAsState(targetValue = sizeNow.value)
        Column(
            modifier = Modifier.verticalScroll(
                state = scrollState
            )
        ) {
            ListingScreen(size)
            AddButton("increase", ::increaseSize)
        }
    }
}

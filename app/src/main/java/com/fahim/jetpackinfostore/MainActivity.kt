package com.fahim.jetpackinfostore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.fahim.jetpackinfostore.staritn.ListingScreen
import com.fahim.jetpackinfostore.ui.theme.JetPackInfoStoreTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackInfoStoreTheme{
                ListingScreen()
            }
        }
    }
}

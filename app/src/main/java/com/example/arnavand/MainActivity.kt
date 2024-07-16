package com.example.arnavand

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import com.example.arnavand.ui.theme.ArnavandTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("Lifecycle :- App is created")
    }

    override fun onPause(){
        super.onPause()
        println("Lifecycle:-On pause initiated")
    }
    override fun onDestroy(){
        super.onDestroy()
        println{"Lifecycle:-destroyed"}
    }
    override fun onResume() {
        super.onResume()
        println("Lifecycle:-resume started")
    }

    override fun onStop() {
        super.onStop()
        println("Lifecycle:-On stop initiated")
    }
}



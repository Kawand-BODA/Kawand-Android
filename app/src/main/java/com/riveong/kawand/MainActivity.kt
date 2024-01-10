package com.riveong.kawand

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.riveong.kawand.ui.activities.onBoarding.WelcomeScreen
import com.riveong.kawand.ui.activities.onBoarding.WelcomeScreen2
import com.riveong.kawand.ui.activities.onBoarding.WelcomeScreen3
import com.riveong.kawand.ui.activities.onBoarding.WelcomeScreen4
import com.riveong.kawand.ui.screens.logic.MainBoarding
import com.riveong.kawand.ui.theme.KawandTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KawandTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainBoarding()
                }
            }
        }
    }
}

package com.riveong.kawand.ui.screens.logic

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.riveong.kawand.ui.activities.onBoarding.WelcomeScreen
import com.riveong.kawand.ui.activities.onBoarding.WelcomeScreen2
import com.riveong.kawand.ui.activities.onBoarding.WelcomeScreen3
import com.riveong.kawand.ui.activities.onBoarding.WelcomeScreen4
import com.riveong.kawand.ui.screens.Screen

@Composable
fun MainBoarding() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.On1.route,
        modifier = Modifier
    ){
        composable(
            route = Screen.On1.route
        ) {
            EnterAnimation {
                WelcomeScreen(navHostController = navController)
            }
        }
        composable(
            route = Screen.On2.route
        ) {
            EnterAnimation {
                WelcomeScreen2(navHostController = navController)
            }
        }
        composable(
            route = Screen.On3.route
        ) {
            EnterAnimation {
                WelcomeScreen3(navHostController = navController)
            }
        }
        composable(
            route = Screen.On4.route
        ) {
            EnterAnimation {
                WelcomeScreen4(navHostController = navController)
            }
        }
    }
}

@Composable
fun EnterAnimation(content: @Composable () -> Unit) {
    AnimatedVisibility(
        visibleState = MutableTransitionState(initialState = false).apply { targetState = true },
        modifier = Modifier,
        enter = slideInVertically(initialOffsetY = { -40 }) + expandVertically(expandFrom = Alignment.Top) + fadeIn(initialAlpha = 0.3f),
        exit = slideOutVertically() + shrinkVertically() + fadeOut(),
    ) {
        content()
    }
}



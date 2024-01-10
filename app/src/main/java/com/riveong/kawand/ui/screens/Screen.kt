package com.riveong.kawand.ui.screens

sealed class Screen(val route: String) {

    //onboarding
    object On1: Screen("on1")
    object On2: Screen("on2")
    object On3: Screen("on3")
    object On4: Screen("on4")
}
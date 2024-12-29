package com.ritikcoder.navigatebetweentwoscreensjetpackcomposeapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MyAppNavigation(){
//            We will have to add this dependency in build.gradle.kts2 file and sync.
//            val navVersion = "2.8.5"
//            implementation("androidx.navigation:navigation-compose:$navVersion")

    val navController= rememberNavController()
    NavHost(navController= navController, startDestination = Routes.screenA, builder = {
        composable(Routes.screenA){
            ScreenA(navController)
        }
        composable(Routes.screenB+"/{name}"){
            val name = it.arguments?.getString("name")
            ScreenB(name?:"No name")
        }
    })
}
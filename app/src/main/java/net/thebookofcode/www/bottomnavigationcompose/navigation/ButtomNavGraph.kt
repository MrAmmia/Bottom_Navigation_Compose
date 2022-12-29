package net.thebookofcode.www.bottomnavigationcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import net.thebookofcode.www.bottomnavigationcompose.screens.HomeScreen
import net.thebookofcode.www.bottomnavigationcompose.screens.ProfileScreen
import net.thebookofcode.www.bottomnavigationcompose.screens.SettingsScreen


@Composable
fun ButtonNavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ){
        composable(route = BottomBarScreen.Home.route){
            HomeScreen()
        }
        composable(route = BottomBarScreen.Profile.route){
            ProfileScreen()
        }
        composable(route = BottomBarScreen.Settings.route){
            SettingsScreen()
        }
    }
}
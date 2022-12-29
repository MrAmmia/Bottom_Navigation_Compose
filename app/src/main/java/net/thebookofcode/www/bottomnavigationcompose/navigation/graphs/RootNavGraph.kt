package net.thebookofcode.www.bottomnavigationcompose.navigation.graphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import net.thebookofcode.www.bottomnavigationcompose.screens.home_screens.MainHomeScreen
import net.thebookofcode.www.bottomnavigationcompose.util.Graph

@Composable
fun RootNavigationGraph(navController:NavHostController){
    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = Graph.AUTHENTICATION
    ){
        authNavGraph(navController = navController)
        composable(route = Graph.HOME){
            MainHomeScreen()
        }
    }
}
package net.thebookofcode.www.bottomnavigationcompose.navigation.graphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import net.thebookofcode.www.bottomnavigationcompose.navigation.HomeScreens
import net.thebookofcode.www.bottomnavigationcompose.screens.ScreenContent
import net.thebookofcode.www.bottomnavigationcompose.util.Graph


@Composable
fun HomeNavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        route = Graph.HOME,
        startDestination = HomeScreens.Home.route
    ){
        composable(route = HomeScreens.Home.route){
            ScreenContent(
                name = HomeScreens.Home.route,
                onClick = {
                    navController.navigate(Graph.DETAILS)
                }
            )
        }
        composable(route = HomeScreens.Profile.route) {
            ScreenContent(
                name = HomeScreens.Profile.route,
                onClick = { }
            )
        }
        composable(route = HomeScreens.Settings.route) {
            ScreenContent(
                name = HomeScreens.Settings.route,
                onClick = { }
            )
        }
        detailsNavGraph(navController = navController)
    }
}
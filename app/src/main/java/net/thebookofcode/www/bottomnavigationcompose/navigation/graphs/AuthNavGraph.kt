package net.thebookofcode.www.bottomnavigationcompose.navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import net.thebookofcode.www.bottomnavigationcompose.navigation.AuthScreens
import net.thebookofcode.www.bottomnavigationcompose.screens.LoginContent
import net.thebookofcode.www.bottomnavigationcompose.screens.ScreenContent
import net.thebookofcode.www.bottomnavigationcompose.util.Graph

fun NavGraphBuilder.authNavGraph(navController: NavHostController){
    navigation(
        route = Graph.AUTHENTICATION,
        startDestination = AuthScreens.Login.route
    ){
        composable(route = AuthScreens.Login.route) {
            LoginContent(
                onClick = {
                    navController.popBackStack()
                    navController.navigate(Graph.HOME)
                },
                onSignUpClick = {
                    navController.navigate(AuthScreens.SignUp.route)
                },
                onForgotClick = {
                    navController.navigate(AuthScreens.Forgot.route)
                }
            )
        }
        composable(route = AuthScreens.SignUp.route) {
            ScreenContent(name = AuthScreens.SignUp.route) {}
        }
        composable(route = AuthScreens.Forgot.route) {
            ScreenContent(name = AuthScreens.Forgot.route) {}
        }
    }
}
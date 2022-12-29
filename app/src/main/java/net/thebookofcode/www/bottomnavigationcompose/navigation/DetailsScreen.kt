package net.thebookofcode.www.bottomnavigationcompose.navigation

// sealed class for screens we go to after the home page/
sealed class DetailsScreen(val route: String) {
    object Information : DetailsScreen(route = "INFORMATION")
    object Overview : DetailsScreen(route = "OVERVIEW")
}
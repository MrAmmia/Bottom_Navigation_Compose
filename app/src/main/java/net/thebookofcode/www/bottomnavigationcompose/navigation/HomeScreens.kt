package net.thebookofcode.www.bottomnavigationcompose.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class HomeScreens(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home : HomeScreens(
        route = "home",
        title = "HOME",
        icon = Icons.Default.Home
    )

    object Profile : HomeScreens(
        route = "profile",
        title = "PROFILE",
        icon = Icons.Default.Person
    )

    object Settings : HomeScreens(
        route = "settings",
        title = "SETTINGS",
        icon = Icons.Default.Settings
    )
}

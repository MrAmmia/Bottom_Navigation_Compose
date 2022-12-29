package net.thebookofcode.www.bottomnavigationcompose.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home : BottomBarScreen(
        route = "home",
        title = "HOME",
        icon = Icons.Default.Home
    )

    object Profile : BottomBarScreen(
        route = "profile",
        title = "PROFILE",
        icon = Icons.Default.Person
    )

    object Settings : BottomBarScreen(
        route = "settings",
        title = "SETTINGS",
        icon = Icons.Default.Settings
    )
}
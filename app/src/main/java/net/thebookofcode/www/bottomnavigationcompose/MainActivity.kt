package net.thebookofcode.www.bottomnavigationcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import net.thebookofcode.www.bottomnavigationcompose.navigation.graphs.RootNavigationGraph
import net.thebookofcode.www.bottomnavigationcompose.screens.home_screens.MainHomeScreen
import net.thebookofcode.www.bottomnavigationcompose.ui.theme.BottomNavigationComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomNavigationComposeTheme {
                // A surface container using the 'background' color from the theme
                RootNavigationGraph(navController = rememberNavController())
            }
        }
    }
}


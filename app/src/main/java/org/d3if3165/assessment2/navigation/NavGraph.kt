package org.d3if3165.assessment2.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.d3if3165.assessment2.ui.screen.AboutScreen
import org.d3if3165.assessment2.ui.screen.DetailScreen
import org.d3if3165.assessment2.ui.screen.MainMenu
import org.d3if3165.assessment2.ui.screen.MainScreen

@Composable
fun SetupNavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        startDestination = Screen.MainMenu.route
    ) {
        composable(route = Screen.MainMenu.route) {
            MainMenu(navController)
        }
        composable(route = Screen.Home.route) {
            MainScreen(navController)
        }
        composable(route = Screen.About.route) {
            AboutScreen(navController)
        }
        composable(route = Screen.FormBaru.route) {
            DetailScreen()
        }
    }
}
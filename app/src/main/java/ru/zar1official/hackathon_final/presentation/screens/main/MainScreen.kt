package ru.zar1official.hackathon_final.presentation.screens

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.koin.androidx.compose.getViewModel
import ru.zar1official.hackathon_final.presentation.screens.main.BottomBarScreen

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(bottomBar = {
        BottomBar(navController = navController)
    }) {
        BottomNavGraph(navController = navController)
    }
}

@Composable
fun BottomBar(navController: NavController) {
    BottomNavigation {
        val screens = listOf(BottomBarScreen.WorkSpace, BottomBarScreen.ChillSpace)
        screens.forEach { screen ->
            BottomNavigationItem(
                selected = false,
                onClick = {
                    navController.navigate(screen.route) {
                        launchSingleTop = true
                        popUpTo(screen.route)
                    }
                },
                icon = {
                    Icon(
                        painter = painterResource(id = screen.icon),
                        contentDescription = stringResource(id = screen.contentDescription)
                    )
                },
                label = { Text(text = stringResource(id = screen.title)) })
        }
    }
}

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = BottomBarScreen.WorkSpace.route) {
        composable(
            route = BottomBarScreen.WorkSpace.route,
        ) {
            WorkSpaceScreen()
        }
        composable(route = BottomBarScreen.ChillSpace.route) {
            ChillSpaceScreen(viewModel = getViewModel())
        }
    }
}
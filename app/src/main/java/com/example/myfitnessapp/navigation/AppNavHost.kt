

package com.example.fitnessapp.navigation


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myfitnessapp.ui.theme.screens.workoutprograms.ProgramScreen


import com.example.myfitnessapp.navigation.Routes

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Routes.HOME,
        modifier = modifier
    ) {
        composable(Routes.LOGIN) { LoginScreen(navController) }
        composable(Routes.HOME) { HomeScreen(navController) }
        composable(Routes.PERSONAL_INFO) { PersonalInfoScreen(navController) }
        composable(Routes.PROGRAM) { ProgramScreen(navController) }
    }
}

@Composable
fun HomeScreen(navController: NavHostController) {
    TODO("Not yet implemented")
}

@Composable
fun PersonalInfoScreen(navController: NavHostController) {
    TODO("Not yet implemented")
}

@Composable
fun LoginScreen(navController: NavHostController) {


}

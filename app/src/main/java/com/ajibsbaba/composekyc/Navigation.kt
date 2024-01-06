package com.ajibsbaba.composekyc

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

object NavigationRoutes {
    const val Compliance = "complianceScreen"
    const val CustomerRequirement = "customerRequirementScreen"
    const val VerificationSubmitted = "verificationSubmittedScreen"
    const val VerificationComplete = "verificationCompleteScreen"
}

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = NavigationRoutes.Compliance) {
        composable(NavigationRoutes.Compliance) { ComplianceScreen(navController = navController)}
        composable(NavigationRoutes.CustomerRequirement) { CustomerRequirementScreen(navController = navController)}
        composable(NavigationRoutes.VerificationSubmitted) { VerificationSubmittedScreen(navController = navController)}
        composable(NavigationRoutes.VerificationComplete) { VerificationCompleteScreen()}
    }
}
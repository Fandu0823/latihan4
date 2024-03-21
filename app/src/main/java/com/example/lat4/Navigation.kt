package com.example.lat4

import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController

class Navigation {
    fun navigateFromAToB(navController: NavController) {
        navController.navigate(R.id.action_a_to_b4)
    }

    fun navigateFromBToA(navController: NavController) {
        navController.navigate(R.id.action_b_to_a)
    }
}

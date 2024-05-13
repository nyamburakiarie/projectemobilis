package net.ezra.navigation

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.ezra.ui.SplashScreen

import net.ezra.ui.auth.LoginScreen
import net.ezra.ui.auth.SignUpScreen




import net.ezra.ui.mit.ContactScreen
import net.ezra.ui.mit.MitScreen
import net.ezra.ui.products.ProductsScreen

import net.ezra.ui.shop.ShopScreen
import net.ezra.ui.students.AddStudents
import net.ezra.ui.students.StudentList



@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_SPLASH


) {
    BackHandler {
        navController.popBackStack()

        }
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {




        composable(ROUTE_MIT) {
            MitScreen(navController)
        }


        composable(ROUTE_SHOP) {
            ShopScreen(navController)
        }

        composable(ROUTE_PRODUCTS) {
            ProductsScreen(navController)
        }


        composable(ROUTE_ADD_STUDENTS) {
            AddStudents(navController)
        }

        composable(ROUTE_SPLASH) {
            SplashScreen(navController)
        }


        composable(ROUTE_VIEW_STUDENTS) {
            StudentList(navController = navController, viewModel = viewModel())
        }

        composable(ROUTE_REGISTER) {
            SignUpScreen(navController = navController){

            }
        }

        composable(ROUTE_DASHBOARD) {
            LoginScreen(navController = navController){

            }
        }

        composable(ROUTE_CONTACT) {
            ContactScreen(navController)
        }

//        composable(ROUTE_REGISTER) {
//            Register(navController)
//        }




























    }
}
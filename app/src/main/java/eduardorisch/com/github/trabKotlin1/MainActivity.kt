package eduardorisch.com.github.trabKotlin1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import eduardorisch.com.github.trabKotlin1.screens.LoginScreen
import eduardorisch.com.github.trabKotlin1.screens.MenuScreen
import eduardorisch.com.github.trabKotlin1.screens.PedidosScreen
import eduardorisch.com.github.trabKotlin1.screens.PerfilScreen
import eduardorisch.com.github.trabKotlin1.ui.theme.TrabKotlin1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TrabKotlin1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "login",
                    ){
                        composable(route = "login"){
                            LoginScreen(modifier = Modifier.padding(innerPadding), navController)
                        }
                        composable(route = "menu"){
                            MenuScreen(modifier = Modifier.padding(innerPadding), navController)
                        }
                        composable(route = "pedidos"){
                            PedidosScreen(modifier = Modifier.padding(innerPadding), navController)
                        }
                        composable(route = "perfil"){
                            PerfilScreen(modifier = Modifier.padding(innerPadding), navController)
                        }
                    }
                }
            }
        }
    }
}
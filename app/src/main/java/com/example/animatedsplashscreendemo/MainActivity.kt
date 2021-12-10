package com.example.animatedsplashscreendemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.animatedsplashscreendemo.navigation.SetupNavGraph
import com.example.animatedsplashscreendemo.ui.theme.AnimatedSplashScreenDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimatedSplashScreenDemoTheme {
                /*  // A surface container using the 'background' color from the theme
                  Surface(color = MaterialTheme.colors.background) {
                      Greeting("Android")*/
                val navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }

        }
    }
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AnimatedSplashScreenDemoTheme {
        Greeting("Android")
    }
}
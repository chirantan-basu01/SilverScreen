package com.example.movies_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.movies_app.navigation.Navigation
import com.example.movies_app.ui.theme.Movies_appTheme
import com.example.movies_app.viewModel.MovieViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Movies_appTheme {
//                WindowCompat.setDecorFitsSystemWindows(window, false)
//                window.setFlags(
//                    WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
//                    WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
//                )
                val linearGradientBrush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFFB226E1),
                        Color(0xFFFC6603),
                        Color(0xFF5995EE),
                        Color(0xFF3D3535)
                    ),
                    start = Offset(Float.POSITIVE_INFINITY, 0f),
                    end = Offset(0f, Float.POSITIVE_INFINITY)
                )

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val movieViewModel = viewModel<MovieViewModel>()
                    val state = movieViewModel.state

                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(linearGradientBrush)
                    ) {
                        Navigation()
                    }
                }
            }
        }
    }
}
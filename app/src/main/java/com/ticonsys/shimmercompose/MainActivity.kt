package com.ticonsys.shimmercompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ticonsys.shimmer.shimmer
import com.ticonsys.shimmercompose.ui.theme.ShimmerComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShimmerComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ShimmerAnimation()
                }
            }
        }
    }
}


@Composable
fun ShimmerAnimationPreview(){
    ShimmerComposeTheme {
        ShimmerAnimation()
    }
}

@Composable
fun ShimmerAnimation() {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        repeat(10){
            item {
                ShimmerItem()
            }
        }
    }
}

@Composable
fun ShimmerItem(){
    Box(
        modifier = Modifier
            .size(128.dp)
            .shimmer()
            .background(Color.Blue),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .size(64.dp)
                .background(Color.Red)
        )
    }
}


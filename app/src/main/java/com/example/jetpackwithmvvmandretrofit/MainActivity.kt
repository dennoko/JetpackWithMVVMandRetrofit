package com.example.jetpackwithmvvmandretrofit

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackwithmvvmandretrofit.ui.theme.JetpackWithMVVMandRetrofitTheme

class MainActivity : ComponentActivity() {
    private val viewModel: CreditCardViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("hoge", "onCreate")
        super.onCreate(savedInstanceState)
        setContent {
            JetpackWithMVVMandRetrofitTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Log.d("hoge", "setContent")
                    CreditCardsScreen(viewModel)
                }
            }
        }
    }
}


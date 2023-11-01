package com.example.jetpackwithmvvmandretrofit

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import coil.compose.AsyncImage

@Composable
fun CreditCardsScreen(viewModel: CreditCardViewModel) {
    val creditCards by viewModel.creditCards.observeAsState(listOf())

    LaunchedEffect(Unit) {
        Log.d("hoge", "LaunchedEffect")
        viewModel.fetchCreditCards()
    }

    Column {
        if(creditCards.isEmpty()) {
            // Show loading indicator or placeholder
            Text(text = "Loading...")
        } else {
            // Display the list of credit cards
            LazyColumn {
                items(creditCards) { creditCard ->
                    Log.d("hoge", "LazyColumn")
                    Text(text = creditCard.id)

                    AsyncImage(model = creditCard.img_src, contentDescription = null)
                    Divider()
                }
            }
        }
    }
}
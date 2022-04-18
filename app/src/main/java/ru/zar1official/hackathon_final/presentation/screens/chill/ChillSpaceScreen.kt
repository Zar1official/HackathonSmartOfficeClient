package ru.zar1official.hackathon_final.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import ru.zar1official.hackathon_final.presentation.screens.chill.ChillSpaceViewModel

@Composable
fun ChillSpaceScreen(viewModel: ChillSpaceViewModel) {
    val state = viewModel.state.observeAsState("0")
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Blue),
        contentAlignment = Alignment.Center
    ) {
        Button(onClick = {
            viewModel.state.value = "fkf"
        }) {
            Text(text = "Click")
        }

        Text(text = state.value)

    }
}
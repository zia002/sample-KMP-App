package org.example.project

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ShowTextScreen(fileHelper: FileHelper) {
    val text = remember { mutableStateOf("") }

    LaunchedEffect(Unit) {
        text.value = fileHelper.readAll()
    }

    Column(modifier = Modifier
        .padding(16.dp)
        .fillMaxSize()) {
        Text("Saved Text:", style = MaterialTheme.typography.titleMedium)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text.value)
    }
}

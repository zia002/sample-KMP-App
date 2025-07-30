package org.example.project

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AddTextScreen(fileHelper: FileHelper) {
    var input by remember { mutableStateOf("") }

    Column(modifier = Modifier
        .padding(16.dp)
        .fillMaxSize()) {
        OutlinedTextField(
            value = input,
            onValueChange = { input = it },
            label = { Text("Enter Text") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(12.dp))
        Button(
            onClick = {
                if (input.isNotBlank()) {
                    fileHelper.appendText(input)
                    input = ""
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Save to File")
        }
    }
}


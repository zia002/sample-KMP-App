package org.example.project

import android.content.Context
import java.io.File

class AndroidFileHelper(private val context: Context) : FileHelper {

    private val file = File(context.filesDir, "data.txt")

    override fun appendText(text: String) {
        file.appendText(text + "\n")
    }

    override fun readAll(): String {
        return if (file.exists()) file.readText() else ""
    }
}

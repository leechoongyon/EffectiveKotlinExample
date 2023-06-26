package org.example.use

import java.io.BufferedReader
import java.io.FileReader

class UseExample {
    fun readLine(filePath: String): String {
        BufferedReader(FileReader(filePath))
            .use {
                return it.readLine()
            }
    }
}
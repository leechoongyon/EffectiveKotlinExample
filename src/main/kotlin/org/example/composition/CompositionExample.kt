package org.example.composition

class CompositionExample {
}

class FileStream {
    fun open() {}
    fun close() {}
}

class PdfLoader {
    val fileStream = FileStream()

    fun init() {
        fileStream.open()
    }
}

class ImageLoader {
    val fileStream = FileStream()

    fun init() {
        fileStream.open()
    }
}
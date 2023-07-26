package org.example.extension

class ExtensionFunctionExample2 {
}

fun main() {
    val strInt = "100"
    val intValue: Int = strInt.readObject()
    println(intValue)  // 출력: 42
}
package org.example.data

data class DataClassExample(val name: String)

fun main() {
    val dataClassExample = DataClassExample("test")
    val copy = DataClassExample("test").copy()
    println(dataClassExample == copy)
    println(dataClassExample.equals(copy))
}
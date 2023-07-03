package org.example

class Item5 {
    fun test(num: Int = 1): List<String> {
        println(num)
        return listOf("a", "b")
    }
}

fun main() {
    Item5().test(5)
}
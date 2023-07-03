package org.example

class Item12 {
}

fun Int.factorial(): Int = (1..this).product()
fun Iterable<Int>.product(): Int =
    fold(1) { acc, i -> acc * i }

fun main() {
    val number = 5
    println("result is ${number.factorial()}")
}

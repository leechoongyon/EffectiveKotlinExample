package org.example.dsl

class AnalogicalFunctionExample {
}


val plus: (Int, Int) -> Int = { a, b -> a + b }
val multi: (Int, Int) -> Int = { a, b -> a * b }

fun operate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    println("plus: ${operate(5, 3, plus)}")
    println("multi: ${operate(5, 3, multi)}")
}


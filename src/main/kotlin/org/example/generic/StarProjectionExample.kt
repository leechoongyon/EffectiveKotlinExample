package org.example.generic

class StarProjectionExample {
}

fun print(list: List<*>) {
    list.forEach { value ->
        print(value)
    }
}

fun main() {
    print(listOf(1, 2, 3))
    println()
    print(listOf("a", "b", "c"))
}
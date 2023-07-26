package org.example.equals

class EqualsExample {
}


class A(var name: String)
data class AA(var name: String)

fun main() {
    val a = A("test")
    val a1 = A("test")
    val a2 = A("test")

    println(a == a1)    // false
    println(a == a2)    // false

    val aa = AA("test")
    val aa1 = AA("test")
    val aa2 = AA("test")

    println(aa == aa1)  // true
    println(aa == aa2) // true
}
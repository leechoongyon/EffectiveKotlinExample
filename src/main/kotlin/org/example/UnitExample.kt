package org.example

class UnitExample {
    fun isEqualsUsingUnit(str: String): Unit? {
        print("isEquals : ${str.equals("str")}")
        return null
    }
}

fun main() {
    val unit = UnitExample().isEqualsUsingUnit("str")
    println(unit)
}
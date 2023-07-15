package org.example.generic

fun calculateCalories(list: List<Parent>) {
    println("size : ${list.size}")
}

fun main() {
    val list: List<Parent> = listOf(Parent(), Child())
    calculateCalories(list)    // size 2

//    val list: List<Child> = listOf(Child(), Child())
//    calculateCalories(list)    // size 2
}
package org.example.generic

class GenericExample {
}

open class Parent() {
}

class Child : Parent() {

}


fun calculateCalories(array: Array<Parent>) {
    println("size : ${array.size}")
}

fun main() {
    val array: Array<Parent> = arrayOf(Parent(), Child())
    calculateCalories(array)    // size 2

//    val errorCase: Array<Child> = arrayOf(Child(), Child())
//    calculateCalories(errorCase)    // compile error. 코틀린 제네릭 타입 불변성때문에 에러 발생
}
package org.example.generic

class GenericInExample {
}

fun copyAppliedOutIn(source: Array<out Parent>, target: Array<in Parent>) {
    for (i in source.indices) {
        target[i] = source[i]
    }
}

fun main() {
    val source: Array<Child> = arrayOf(Child(), Child())
    val target: Array<Parent> = arrayOf(Child(), Child())
    copyAppliedOutIn(source, target) // 정상 처리

    println(target.size)    // target 에는 source 의 child 객체들이 들어감
}
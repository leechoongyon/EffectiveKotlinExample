package org.example.generic

class GenericExample3 {
}

fun copy(source: Array<Parent>, target: Array<Parent>) {
    for (i in source.indices) {
        target[i] = source[i]
    }
}

fun copyAppliedOut(source: Array<out Parent>, target: Array<Parent>) {
    for (i in source.indices - 1) {
        target[i] = source[i]
    }
}

fun main() {

    // case 1.compile error type mismatch
//    val source: Array<Child> = arrayOf(Child(), Child())
//    val target: Array<Parent> = arrayOf(Parent())
//    copy(source, target) // compile error type mismatch

    // case 2. out 적용
    val source: Array<Child> = arrayOf(Child(), Child())
    val target: Array<Parent> = arrayOf(Parent(), Parent())
    copyAppliedOut(source, target) // 정상 처리
}
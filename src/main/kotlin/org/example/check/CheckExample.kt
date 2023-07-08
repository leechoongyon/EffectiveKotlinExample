package org.example.check

class CheckExample {
    fun method(isExecute: Boolean) {
        check(isExecute) {
            "isExecute must be true"
        }
    }
}

fun main() {
    CheckExample().method(true)
//    CheckExample().method(false) // java.lang.IllegalStateException: isExecute must be true

    checkNotNull(null)
    requireNotNull(null)
}
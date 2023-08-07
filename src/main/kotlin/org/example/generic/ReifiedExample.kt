package org.example.generic

class ReifiedExample {

    inline fun <reified T> printGenericType() {
        print(T::class.simpleName)
    }
}


fun main() {
    ReifiedExample().printGenericType<String>()
}
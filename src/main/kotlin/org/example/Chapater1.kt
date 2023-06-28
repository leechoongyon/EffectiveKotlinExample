package org.example

class Chapater1

open class Animal {
    fun helloWorld() {
        print("Hello World")
    }
}

class Rabbit : Animal()

fun main() {
    var animal = Rabbit()
    animal.helloWorld()
}


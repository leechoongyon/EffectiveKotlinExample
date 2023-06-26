package org.example.scope

data class Person(var name: String)

fun main() {
    var person = Person("test")
    with(person) {
        println(name)
    }
}
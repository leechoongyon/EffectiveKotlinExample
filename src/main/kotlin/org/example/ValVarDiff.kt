package org.example

var name: String = "Lee"
var name1: String = "1312"
val fullName
    get() = "$name $name1"

fun main() {
    println(fullName)
    name1 = "123456"
    println(fullName)
}
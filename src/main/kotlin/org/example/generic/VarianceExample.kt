package org.example.generic

class VarianceExample {
}

class Computer<in T>
open class Notebook
class M2Mac() : Notebook()

fun main() {
//    val a: Computer<Notebook> = Computer<M2Mac>() // mismatch
    val b: Computer<M2Mac> = Computer<Notebook>() // 정상
}
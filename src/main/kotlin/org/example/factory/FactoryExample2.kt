package org.example.factory

class FactoryExample2 {
}

class MyLinkedList<T>(
    val head: T,
    val tail: MyLinkedList<T>?
) : MyList<T> {
    fun of(vararg elements: T) {

    }
}

interface MyList<T> {
    companion object {
        fun <T> of(vararg elements: T): MyList<T>? {
            return null
        }
    }
}
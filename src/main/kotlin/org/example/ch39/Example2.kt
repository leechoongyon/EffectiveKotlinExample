package org.example.ch39

class Example2 {
}

sealed class ValueMatcher<T> {
    abstract fun match(value: T): Boolean

    class Equal<T>(val value: T) : ValueMatcher<T>() {
        override fun match(value: T): Boolean =
            value == this.value
    }

    class NotEqual<T>(val value: T) : ValueMatcher<T>() {
        override fun match(value: T): Boolean =
            value != this.value
    }

    class EmptyList<T>() : ValueMatcher<T>() {
        override fun match(value: T): Boolean =
            value is List<*> && value.isEmpty()
    }

    class NotEmptyList<T>() : ValueMatcher<T>() {
        override fun match(value: T): Boolean =
            value is List<*> && value.isNotEmpty()
    }
}

fun main() {
    val matcher1 = ValueMatcher.Equal(5)
    val matcher2 = ValueMatcher.NotEqual("World")
    val matcher3 = ValueMatcher.EmptyList<Any>()
    val matcher4 = ValueMatcher.NotEmptyList<List<Int>>()

    println(matcher1.match(5))  // true
    println(matcher2.match("HelloWorld"))  // true
    println(matcher3.match(emptyList<Int>()))  // true
    println(matcher4.match(listOf(1, 2)))  // true
}

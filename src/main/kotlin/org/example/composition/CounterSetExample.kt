package org.example.composition

class CounterSetExample {
}

class CounterSet<T> : HashSet<T>() {
    var elementsAdded: Int = 0
        private set

    override fun add(element: T): Boolean {
        elementsAdded++
        return super.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        elementsAdded += elements.size
        return super.addAll(elements)
    }
}

fun main() {
    val counterSet = CounterSet<Int>()
    counterSet.addAll(listOf(1, 2, 3))  // 아래 보면 HashSet addAll 이 add를 부르고 있기에 6이 나옴
    println(counterSet.elementsAdded)
}

/**
 * fun <T> HashSet<T>.addAll(elements: Collection<T>): Boolean {
 *     var modified = false
 *     for (element in elements) {
 *         if (add(element)) {
 *             modified = true
 *         }
 *     }
 *     return modified
 * }
 */

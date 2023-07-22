package org.example.compare

class CustomCompareExample {
}

data class SimpleMember(
    val name: String,
    val age: Int
) : Comparable<SimpleMember> {
    override fun compareTo(other: SimpleMember): Int =
        compareValues(other.age, age)
}

fun main() {
    val simpleMembers = listOf(
        SimpleMember("cdb", 15),
        SimpleMember("abc", 12)
    )

    // before sort
    simpleMembers.forEach { println(it) }
    println()
    val sortedMembers = simpleMembers.sorted()
    println()

    // after sort
    sortedMembers.forEach { println(it) }
}

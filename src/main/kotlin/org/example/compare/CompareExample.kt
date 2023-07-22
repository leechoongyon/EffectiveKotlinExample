package org.example.compare

class CompareExample {
}

data class Member(val name: String, val age: Int)

fun main() {
    val members = listOf<Member>(
        Member("t2", 12),
        Member("t1", 10)
    )

    val membersSortByNameAge = members.sortedWith(compareBy({ it.name }, { it.age }))
    println(membersSortByNameAge)  // Member(name=t1, age=10), Member(name=t2, age=12)

    val membersSortByName = members.sortedBy { it.name }
    println(membersSortByName) // Member(name=t1, age=10), Member(name=t2, age=12)
}
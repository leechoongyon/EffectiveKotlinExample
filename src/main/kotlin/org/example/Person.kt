package org.example

data class Person(
    val name: String,
    val age: Int,
) {

}

fun main() {
    var person = Person("test", 10)
    person = person.copy(name = "test222")  // 불변 객체이니 신규 객체 생성해서 리턴
    print(person)
}


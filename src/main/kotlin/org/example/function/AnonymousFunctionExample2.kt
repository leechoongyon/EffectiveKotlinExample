package org.example.function

class AnonymousFunctionExample2 {
}

// block 은 T.() -> Unit 함수 타입을 가짐. T.() 는 T 타입의 확장함수 형식을 의미함
inline fun <T> T.apply(block: T.() -> Unit): T {
    this.block()
    return this
}

class User {
    var name: String = ""
    var surName: String = ""
}

val user = User().apply {
    name = "test"
    surName = "12345"
}
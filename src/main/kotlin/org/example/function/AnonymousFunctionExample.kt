package org.example.function

class AnonymousFunctionExample {

}

//  Int 의 확장함수 이며, Int 를 파라미터로 받습니다.
fun Int.plus(other: Int) = this + other

// myPlus 의 타입은 확장함수를 나타내며, 리시버를 가진 함수 타입이라고 합니다.
val myPlus = fun Int.(other: Int) = this + other

// myPlus2 의 타입은 Int 를 받아서 Int 를 리턴하는 함수입니다.
val myPlus2: Int.(Int) -> Int = fun Int.(other: Int) = this + other

fun main() {
    println("result : ${myPlus.invoke(3, 4)}")
    println("result : ${myPlus(3, 4)}")
    println("result : ${3.myPlus(4)}")
}

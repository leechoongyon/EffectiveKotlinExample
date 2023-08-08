package org.example.extension

class ExtensionFunctionExample3 {
    fun String.isAddr(): Boolean = length == 13
}

private fun String.isAddr(): Boolean = length == 13

fun main() {
    // 클래스 내부에 확장함수를 쓰는건 될 수 있으면 피하는게 좋습니다. 가시성을 제한합니다. 또한, 레퍼런스도 쓸 수 없습니다.
    val isAddr = ExtensionFunctionExample3().apply { "12345".isAddr() }
    println(isAddr)

    // 이런 방식으로 쓰는게 좋습니다.
    val str = "abcde12345"
    val isAddrBoolean = "abc".isAddr()
    val isAddrBooleanReference = str::isAddr // 오류 안남
    println(isAddrBoolean)
}
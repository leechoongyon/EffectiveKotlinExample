package org.example.dsl

class CustomDslExample {
}

class TableBuilder {
    var text = ""

    // String.unaryPlus 라는 기존의 함수가 있는데 이것을 override 한 것
    operator fun String.unaryPlus() {
        text += this
    }

    override fun toString(): String {
        return "TableBuilder(text='$text')"
    }
}

// TableBuilder.() 확장함수를 입력받고 리턴이 없습니다.
fun table(init: TableBuilder.() -> Unit) = TableBuilder().apply(init)

fun main() {
    val table = table {
        +"abc"  // unaryPlus 를 override 했기에 단항연산자가 적용됩니다.
        +"cde"
    }
    println(table)

    val tableBuilder = TableBuilder().apply {
        +"abc"
        +"cde"
    }
    println(tableBuilder)
}
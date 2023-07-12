package org.example.factory

class FactoryExample {
}

class SimpleList<T>(var id: T) {
    override fun toString(): String {
        return "SimpleList(id=$id)"
    }

    companion object {
        fun <T> of(id: T): SimpleList<T>? {
            return SimpleList(id)
        }
    }
}

fun <T> createSimpleList(id: T): SimpleList<T>? {
    return SimpleList(id)
}

fun main() {
    // 생성자 사용
    val simpleList = SimpleList<String>("test")
    println(simpleList)

    // factory Method 사용
    val factoryExample = createSimpleList("FactoryMethodExample...")
    println(factoryExample)

    // companion object 사용
    val example = SimpleList.of("HelloWorld...")
    println(example)
}
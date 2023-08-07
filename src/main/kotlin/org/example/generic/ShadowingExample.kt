package org.example.generic

class ShadowingExample {
}

interface Tree
class TreeA : Tree
class TreeB : Tree

class Forest<T : Tree> {

    fun <ST : Tree> addTree(tree: ST) {

    }
}

fun main() {
    val forest = Forest<TreeA>()
    forest.addTree(TreeA())
    forest.addTree(TreeB())
}
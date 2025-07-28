package com.example.myapplication2



fun main() {
    List(100000, init = { it }).nonInlineTestForeach(action = {
        val result = it * 2
    })

    println("====================")

    List(100000, init = { it }).inlineTestForeach(action = {
        val result = it * 2
    })

}

fun List<Int>.nonInlineTestForeach(action: (Int) -> Unit) {
    val startTime = System.nanoTime()
    for (i in  0..<this.size) {
        action(this[i])
    }
    val endTime = System.nanoTime()
    println("nonInlineTestForeach endTime - startTime: ${(endTime - startTime) / 1_000_000.0} ms")
}

inline fun List<Int>.inlineTestForeach(action: (Int) -> Unit) {
    val startTime = System.nanoTime()
    for (i in  0..<this.size) {
        action(this[i])
    }
    val endTime = System.nanoTime()
    println("inlineTestForeach endTime - startTime: ${(endTime - startTime) / 1_000_000.0} ms")
}
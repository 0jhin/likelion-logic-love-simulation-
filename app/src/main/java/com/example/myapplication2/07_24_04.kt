package com.example.myapplication2

fun main(){
    val numbersList = listOf("1", "2", "3", "3", "2")
    // 람다 : 키, 값
    val map01 : Map<String, String> = numbersList.associate( {
        println("it : $it")
        "하하" to it
    })
    println(map01)

    // 요소 : / 람다 : 키
    val map02 : Map<Pair<String, String>, String> = numbersList.associateBy({
        "호호" to it
    })
    println(map02)

    // 요소 : 키 / 람다 : 값
    val map03 = numbersList.associateWith({
        "후후" to it
    })
    println(map03)

    // 그룹으로 묶기
    // 람다 : 일치되는 부분 키로 잡고 값이 일치되는 배열이 됨
    val map04 : Map<Int, List<String>> = numbersList.groupBy {
        it.length
    }
    println(map04)

    println()


}
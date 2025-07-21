package com.example.myapplication2

fun main(){

    //복습
    val numberList = listOf<Int>(1, 2, 3, 4, 5).mapIndexed { index, i ->
    }

    val num : List<Int> = listOf<Int>(1,2,3,4,5)

    var result = num.filter {
        it == 3
    }
    println(result)


    val num2 : List<Int> = listOf<Int>(1,2,3,4,5)

    // 인덱스 + 반복
    num2.forEachIndexed { index, i ->

    }

    // 뒤에서부터 찾는법
    num2.last {
        it == 5
    }

    val num3 : List<Int> = listOf<Int>(1,2,3,4,5)

    // 맨 앞부터 찾음
    num3.indexOfFirst {
        it == 3
    }

    val lunch = listOf<String>("순대", "떡볶이", "라면")

    // 리스트에 내용이 포함 되었는지
    val result2 : Boolean = lunch.contains("라면")

    println(result2)

    // 리스트에 두 개 이상의 내용이 포함 되었는지
    val checklunch = listOf<String>("순대", "떡볶이")

    var result3 : Boolean = lunch.containsAll(checklunch)

    println(result3)



}
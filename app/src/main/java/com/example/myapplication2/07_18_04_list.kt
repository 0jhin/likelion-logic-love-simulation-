package com.example.myapplication2

fun main(){

    // 원시, 참조

    val numbers2 = mutableListOf<Int>(3, 6, 9)
    var numbers3 = numbers2
    println("수정 전 $numbers2") // 3, 6, 9
    println("수정 전 $numbers3") // 3, 6, 9
    numbers3.add(10)
    println("수정 후 $numbers2") // 3, 6, 9, 10
    println("수정 후 $numbers3") // 3, 6, 9, 10



    val someList = listOf<String>()
    val someMutableList = mutableListOf<String>()
    val myRestaurants = mutableListOf<String>("아웃빽", "엽떡", "빕스", "쿠우쿠우")
    val myRestaurants02 = listOf<String>("아웃빽", "엽떡", "빕스", "쿠우쿠우")

    val numbers02 = (0..10).toList()
    val numbers03 = (0..10).toMutableList()


    // 이해 안됨
    val numbers = List(size = 10, {
        "이건 ${it + 1}번째 레슨"
    })
    println(numbers)

    val mutableNumbers =  numbers.toMutableList()

    val myNumbers = mutableListOf<Int>(1, 2, 3)

    myNumbers.toList()

}
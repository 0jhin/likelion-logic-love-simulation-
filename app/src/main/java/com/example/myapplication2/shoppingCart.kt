package com.example.myapplication2

fun main(){
    var shoppingCart = mutableListOf<String>()
    var i = 0



    while (i < 3) { // 상수

        println("장바구니 담기 : ")
        var userInput = readln()

        shoppingCart.add(userInput)
        i++
    }
    println(shoppingCart)

    var input = ""
    println("삭제하려면 del / 추가하려면 add")
    input = readln()
    if (input == "del"){
        println("삭제하실 번호 입력 : ")
        val delNum = readln().toInt()
        shoppingCart.removeAt(delNum - 1)
    }
    if (input =="add"){
        println("추가하실 내용 : ")
        val add = readln()
        println("몇 번째 자리에 추가 : ")
        println("현재 장바구니 : $shoppingCart")
        val addNum = readln().toInt()
        shoppingCart.add(index = addNum -1, element = add)
    }

    println("최종 장바구니 : $shoppingCart")
}
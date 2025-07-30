package com.example.myapplication2

import androidx.annotation.Size

fun main(){

    // 사용자는 돈을 10000원 가지고 있다
    var customerCash : Int = 10000


    // 사용자는 물건을 구매할 수 있다.
    var customerShoppingList : MutableList<String> = mutableListOf()


    // 구매가능한 상품들은 3개다
    // 1. 라이터 - 300원
    // 2. 삼각김밥 - 1300원
    // 3. 캔맥주 - 2500원
    var products : Map<String, Int> = mapOf(
        "라이터" to 300,
        "삼각김밥" to 1300,
        "캔맥주" to 2500
    )


    // 사용자는 아이템을 구매할 때 여러개 구매할 수 있다.

    // 편의점
    // 현재 사용자 돈을 보여준다
    println("현재 잔액 : ${customerCash}원")

    // 상품을 구매한다
    var price = products["라이터"] ?: 0
    customerCash = customerCash - price

    // 현재 사용자 돈을 보여준다
    println("남은 잔액 : ${customerCash}원")
    // 구매한 상품 목록도 보여준다
    customerShoppingList.add(products.keys.first())
    println("구매 품목 : $customerShoppingList")
}

data class Customer(
    var cash: Int,
    var shoppingList: MutableList<String>

)
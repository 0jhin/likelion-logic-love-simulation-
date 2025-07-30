package com.example.myapplication2

data class Product999(
    val title: String,
    val price: Int
) {
    fun printInfo(){
        println("아이템 정보 / 이름: ${this.title}, 가격: ${this.price}")
    }

}

fun main(){

    // 사용자는 돈을 10,000원을 가지고 있다

    var userMoney : Int = 10000

    // 사용자는 물건을 구매할 수 있다.
    // 구매가능한 상품들은 3개다
    // 1. 라이터 - 300원
    // 2. 삼각김밥 - 1300원
    // 3. 캔맥주 - 2500원
    val availableProducts : List<Product999> = listOf(
        Product999("라이터", 300),
        Product999("삼각김밥", 1300),
        Product999("캔맥주", 2500),
    )

    val purchasedProducts : MutableList<Product999> = mutableListOf()


    fun purchase(product: Product999){
        userMoney = userMoney - product.price
        purchasedProducts.add(product)

        println("구매완료:")
        product.printInfo()
    }

    fun purchase(product: Product999, count: Int){
        for (index in 1..count) {
            purchase(product)
        }
    }

    fun purchase(vararg products:  Product999){
        for (product in products) {
            purchase(product)
        }
    }

    fun showPurchasedItemList(){
        println("구매목록입니다.")
        purchasedProducts.forEachIndexed { index, product ->
            println("아이템 [${index + 1}]: 이름: ${product.title}, 가격: ${product.price}")
        }
    }

    fun printCurrentUserMoneyInfo(){
        println("현재 사용자 잔고")
        println("currentMoney: $userMoney")
    }

    // 사용자는 아이템을 구매할 때 여러개 구매할 수 있다.

    // 편의점
    // 현재 사용자 돈을 보여준다

    // 상품을 구매한다

    // 현재 사용자 돈을 보여준다
    // 구매한 상품 목록도 보여준다

    println("사용자는 아이템을 구매할 때 여러개 구매할 수 있다.")

    // 구매 가능한 상품 보여주기
    availableProducts.forEachIndexed { index, product ->
        println("아이템 [${index + 1}]: 이름: ${product.title}, 가격: ${product.price}")
    }


    //
    val userInput = 3

    // 사용자가 3번을 입력했다
    val purchasedItem = availableProducts.get(userInput - 1)

    purchase(purchasedItem)


    showPurchasedItemList()

    printCurrentUserMoneyInfo()

}
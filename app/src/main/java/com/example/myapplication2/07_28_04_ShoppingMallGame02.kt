package com.example.myapplication2

// 대분류 1. 물건이 있고
data class Product99(
    val title: String,
    val price: Int
) {

}

// 대분류 2. 고객이 있고
class MyCustomer(var userMoney: Int) {
    val shoppingBag : MutableList<Product99> = mutableListOf()

    fun enterConvenience(){
        println("---편의점에 들어왔다---")
    }

    // 현금 보여주기(입장 후, 계산 후)
    fun printCurrentUserMoneyInfo(){
        println("현재 사용자 잔고")
        println("currentMoney: ${this.userMoney} 원")
        println()
    }
    // 물건을 담고
    fun addProduct(product99: Product99) : MutableList<Product99>{
        var isShoppingEnd = true
        while (isShoppingEnd) {
            println("담을 물건의 번호를 입력하세요")
            println()
            this.shoppingBag.add(element = product99)
        }
        return shoppingBag
    }
    // shoppingBag =  mutableListOf(Product99(title = dd, price = 100), Product99(title = dd, price = 100), Product99(title = dd, price = 100))

    // 담은 물건을 계산하고
    fun paymentShoppingBag(): Int {
        shoppingBag.forEach {
            userMoney -= it.price
        }
        return userMoney
    }

//    fun paymentShoppingBag(product99: MutableList<Product99>) : Int {
//        userMoney = userMoney - product99.price
//        return userMoney
//    }

    // 구매한 물건을 보여준다
    fun printPaymentShoppingBag(){
        shoppingBag.forEach {
            println("구매한 물건 : ${it.title}")
            println("가격 : ${it.price}")
        }
    }

}




fun main(){
    // 고객이 있고
    var customer : MyCustomer = MyCustomer(10000)

    customer.enterConvenience() // 편의점 입장
    customer.printCurrentUserMoneyInfo() // 보유 현금 출력

    // 상품이 있고
    val availableProducts : List<Product99> = listOf(
        Product99("라이터", 300),
        Product99("삼각김밥", 1300),
        Product99("캔맥주", 2500),
    )

    // 물건을 담고
    var shoppingBag =  customer.addProduct(availableProducts[readln().toInt()])

    customer.paymentShoppingBag() // 담은 물건을 계산하고
    customer.printCurrentUserMoneyInfo() // 남은 잔액 표시

    customer.printPaymentShoppingBag() // 구매한 물건 표시

}
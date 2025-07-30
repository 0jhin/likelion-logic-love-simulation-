//package com.example.myapplication2
//data class Product99(
//    val title: String,
//    val price: Int
//) {
//    fun printInfo(){
//        println("아이템 정보 / 이름: ${this.title}, 가격: ${this.price}")
//    }
//
//    fun getInfo() : String{
//        return "이름: ${this.title}, 가격: ${this.price}"
//    }
//
//    companion object {
//        fun makeDummies(dummiesNumber : Int = 10) : MutableList<Product99> {
//            var dummieItemList = mutableListOf<Product99>()
//
//            for (){
//                Product99("더미 아이템", 1000),
//            }
//
//            return dummieItemList
//        }
//    }
//}
//
//fun main(){
//    val manager = GameManager()
//    manager.gameStart()
//
//    User99.makeInstance()
//
//}
//
//class User99(private var money: Int) {
//
//    fun payMoney(price: Int){
//        this.money = this.money - price
//    }
//
//    fun showCurrentMoney(){
//        println("현재 사용자 잔고")
//        println("currentMoney: ${this.money}")
//    }
//
//    companion object {
//
//        const val API_URL = ""
//        fun makeInstance() : User99{
//            return User99(1000)
//        }
//    }
//}
//
//class GameManager {
//    // 사용자는 돈을 10,000원을 가지고 있다
//
//    val test = User99.API_URL
//    var currentUser = User99(money = 10000)
//
//    // 사용자는 물건을 구매할 수 있다.
//    // 구매가능한 상품들은 3개다
//    // 1. 라이터 - 300원
//    // 2. 삼각김밥 - 1300원
//    // 3. 캔맥주 - 2500원
//    val availableProducts : List<Product99> = Product99.makeDummies()
//
//    val purchasedProducts : MutableList<Product99> = mutableListOf()
//
//
//    fun purchase(product: Product99){
//
//        currentUser.payMoney(product.price)
//
//        purchasedProducts.add(product)
//
//        println("구매완료:")
//        product.printInfo()
//    }
//
//    fun purchase(product: Product99, count: Int){
//        for (index in 1..count) {
//            purchase(product)
//        }
//    }
//
//    fun purchase(vararg products:  Product99){
//        for (product in products) {
//            purchase(product)
//        }
//    }
//
//    fun showPurchasedItemList(){
//        println("구매목록입니다.")
//        purchasedProducts.forEachIndexed { index, product ->
//            println("아이템 [${index + 1}]: ${product.getInfo()}")
//        }
//    }
//
//    fun printCurrentUserMoneyInfo(){
//        currentUser.showCurrentMoney()
//    }
//
//    fun gameStart(){
//        // 사용자는 아이템을 구매할 때 여러개 구매할 수 있다.
//
//        // 편의점
//        // 현재 사용자 돈을 보여준다
//
//        // 상품을 구매한다
//
//        // 현재 사용자 돈을 보여준다
//        // 구매한 상품 목록도 보여준다
//
//        println("사용자는 아이템을 구매할 때 여러개 구매할 수 있다.")
//
//        // 구매 가능한 상품 보여주기
//        availableProducts.forEachIndexed { index, product ->
//            println("아이템 [${index + 1}]: ${product.getInfo()}")
//        }
//
//
//        //
//        val userInput = 3
//
//        // 사용자가 3번을 입력했다
//        val purchasedItem = availableProducts.get(userInput - 1)
//
//        purchase(purchasedItem)
//
//
//        showPurchasedItemList()
//
//        printCurrentUserMoneyInfo()
//    }
//}

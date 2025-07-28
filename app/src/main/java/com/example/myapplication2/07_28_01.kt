package com.example.myapplication2

fun main(){

}



data class ShoppingMall(
    var store : Store,
)

data class Store(
    var id : Int,
    var name : String,
    var item : List<Item>,
    var seller : User
)

data class Item(
    var id : Int,
    var name : String,
    var price : String,
    var quantity : Int,
    var category : Category,
    var seller: User
)

data class Category(
    var id : Int,
    var name : String
)

data class User(
    var id : Int,
    var cash : Int,
    var orderHistory : OrderHistory,
    var isSeller : Boolean,
    var sellerApprovedAt: Int? // 시간
)

data class OrderHistory(
    var id: Int,
    var buyer : User,
    var seller: User,
    var item : List<Item>,
    var orderTime : Int?,
    var totalPrice: String,
    var orderNum : Int
)


// 피드백
//data class Store(
//    var id : Int,
//    var name : String,
//    var item : List<Item>,
//    var seller : User
//)
//
//data class Item(
//    var id : Int,
//    var name : String,
//    var price : String,
//    var quantity : Int,
//    var category : Category,
//    var seller: User
//)
//
//data class Category(
//    var id : Int,
//    var name : String
//)
//
//data class User(
//    var id : Int,
//    var cash : Int,
//    var history : List<Item>,
//    var isSeller : Boolean,
//    var sellerApprovedAt: Int? // 시간
//)
//
//data class OrderHistory(
//    var id: Int,
//    var buyer : User,
//    var seller: User,
//    var item : List<Item>,
//    var orderTime : Int?,
//    var totalPrice: String,
//    var orderNum : Int
//)
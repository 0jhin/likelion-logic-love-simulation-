package com.example.myapplication2

import java.util.UUID

fun main(){
//    쇼핑몰에 입장하면 여러 상점 목록 들이 보인다.
//    각 상점에는 판매하는 아이템들이 다양하다.

    var seller : User = User(cash = 100, isSeller = true, sellerApprovedAt = 1010)

    var shopList: List<Store> = listOf(
        Store(name = "옷가게", item = listOf(Item(name = "청바지", price = 1000, quantity = 3, category = Category(name = "바지"), seller = seller)), seller = seller),
        Store(name = "카페", item = listOf(Item(name = "카페", price = 1000, quantity = 3, category = Category(name = "커피"), seller = seller)), seller = seller),
        Store(name = "향수", item = listOf(Item(name = "향수", price = 1000, quantity = 3, category = Category(name = "향수"), seller = seller)), seller = seller),
        )

    println("Welcome to Shopping Mall")

    shopList.forEachIndexed{ index, store ->
        println("가게 ${index + 1}: ${store.name}")
    }


}



data class ShoppingMall(
    var store : Store,
)

data class Store(
    var id : String = UUID.randomUUID().toString(),
    var name : String,
    var item : List<Item>,
    var seller : User
)

data class Item(
    var id : String = UUID.randomUUID().toString(),
    var name : String,
    var price : Int,
    var quantity : Int,
    var category : Category,
    var seller: User
)

data class Category(
    var id : String = UUID.randomUUID().toString(),
    var name : String
)

data class User(
    var id : String = UUID.randomUUID().toString(),
    var cash : Int,
    var isSeller : Boolean,
    var sellerApprovedAt: Int? // 시간
)

data class OrderHistory(
    var id : String = UUID.randomUUID().toString(),
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
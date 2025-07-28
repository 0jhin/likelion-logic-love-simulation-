//package com.example.myapplication2
//
//import javax.security.auth.callback.PasswordCallback
//
//class User(val chmod : Int){
//    var name = "유저"
//    var info = ""
//
//    init {
//        println("User init called 01")
//        if (chmod >= 777){
//            this.info = "관리자입니다."
//        }
//    }
//    init {
//        println("User init called 02 / ${this.info}")
//    }
//    init {
//        println("User init called 03")
//        this.name = "root"
//    }
//    init {
//        println("User init called 04 / ${this.name}")
//    }
//}
//
//class Root {
//    var name : String
//    constructor(nameParam : String){
//        println("Root constructor called")
//        this.name = nameParam
//    }
//}
//
//class ShopUser{
//    val id: String
//    val name: String
//    val password: String
//
//    constructor(idParam : String, nameParam : String, passwordParam : String){
//        this.id = idParam
//        this.name = nameParam
//        this.password = passwordParam
//    }
//}
//
//class ServerUser{
//    var id: String
//    var authority: Int
//    var home: String
//    constructor(name : String, chmod: Int){
//        when(name){
//            "aa" -> {
//                this.id = name
//                this.authority = chmod
//                this.home = "/home/${id}"
//            }
//            "bb" -> {
//                this.id = name
//                this.authority = chmod
//                this.home = "/home/${id}"
//            }
//            "cc" -> {
//                this.id = name
//                this.authority = chmod
//                this.home = "/home/${id}"
//            }
//            else -> {
//                this.id = name
//                this.authority = chmod
//                this.home = "/home/${id}"
//            }
//        }
//    }
//}
//
//class NormalUser()
//class AdminUser(val name: String)
//class SuperAdminUser(val name: String)
//
//fun main(){
//    val aUser = User(777)
//}
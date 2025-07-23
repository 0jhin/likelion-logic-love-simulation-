package com.example.myapplication2

import kotlin.math.PI


fun main(){
    println("회원가입")
    val agreement : MutableSet<String> = mutableSetOf<String>()
    val allAgreement = setOf<String>("약관 1", "약관 2", "약관 3")
    val essentialAgreemnet = setOf<String>("약관 2", "약관 3")
    var userInput : String = ""


    while (true) {

        println("약관이 3개 있습니다")
        println("동의할 약관을 입력하세요")
        println("[약관 1], [약관 2], [약관 3]")
        println()
        println("모든 약관 동의 후 7 을 입력하시면 회원 가입이 됩니다.")
        print("동의 : ")
        userInput = readln()

        if (userInput in agreement){
            agreement.remove(userInput)
            println("지금까지 동의한 약관 : $agreement")
            println()
            continue
        }

        if (userInput !in agreement){
            agreement.add(userInput)
            println()
            println("지금까지 동의한 약관 : $agreement")
            println()
        }

        if (agreement.containsAll(allAgreement)){
            println("모든 약관에 동의하셨습니다.")
            println("회원가입 하시겠습니까? 7")
        }

        if (userInput == "7"){
            if (!agreement.containsAll(essentialAgreemnet)){

            }

        }



        println()
    }


}
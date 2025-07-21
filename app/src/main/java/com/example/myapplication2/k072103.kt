package com.example.myapplication2

fun main(){
    var menu : Int = 0

    println("요리 번호를 숫자로 입력하세요[1. 떡볶이, 2. 된장찌개]")
    print("요리 : ")
    menu = readln().toInt()

    if (menu == 1){
        var spice : Int = 0
        println("맵기 번호를 숫자로 입력하세요[1. 기본맛, 2. 약간 매운맛, 3. 아주 매운맛]")
        print("맵기 : ")
        spice = readln().toInt()
        when(spice){
            1 -> {
                println("기본맛을 선택하셨습니다.")

            }
            2 -> {

            }
            3 -> {

            }
        }

    }
}

fun riceCake(){

}
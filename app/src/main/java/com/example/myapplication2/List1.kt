package com.example.myapplication2

fun main(){

    // 인덱스 활용해서 리스트 할당
    var myDigitals : MutableList<String> = mutableListOf<String>("Iphone 16", "Galaxy S24+", "Galaxy Tap 9", "MacbookPro")

    myDigitals.add(0, "dsa")
    println(myDigitals)
    val isIn = myDigitals.contains("Iphone 16")
    println(isIn)


//    myDigitals.clear()

//    val aDigitals = myDigitals.randomOrNull()




    // 순서
    // 동일요소 가능
//    val numbers : List<String> = listOf<String>("사과", "포도", "딸기")
//    println(numbers[0])


    // Mutant = Mut 그리스 라틴어 체인지
    // 일반적인 리스트는 변경 불가
    // 상호 보완
    // 리스트에 뮤타블 리스트 할당가능
//    var myDigitals : MutableList<String> = mutableListOf<String>()
//
//    val itemCount = myDigitals.count() // 리스트 접근 함수 사용
//
//    if (itemCount > 0){
//    val myLastItem = myDigitals[itemCount - 1]
//    }


//    val firstItem = myDigitals.firstOrNull() // 왠만하면 OrNull로
//
//    val lastItem = myDigitals.lastOrNull()
//
//    println(firstItem)
//    println(lastItem)

//    // 인덱스 추가
//    myDigitals.add("Galaxy A34")
//
//    println(myDigitals)
//
//    myDigitals.removeAt(0)
//
//    val result = myDigitals[0]
//
//    println("result : $result")
//
//    println(myDigitals)
//
//    myDigitals[0] = "sadads"
//
//    println(myDigitals)
}
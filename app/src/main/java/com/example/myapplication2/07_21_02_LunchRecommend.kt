package com.example.myapplication2

fun main(){

    // 한식
    // 비빔밥, 돌솥비빔밥, 순대국밥, 김치찌개, 된장찌개, 뼈해장국

    // 분식
    // 떡볶이, 튀김, 순대, 김밥, 오뎅

    // 메뉴선택 : 1. 한식, 2. 분식
    // 메뉴를 선택하면 선택한 메뉴 중 랜덤으로 하나를 알려준다.
    //한번 나온 메뉴는 안나온다
    //종료 입력시 프로그램 종료

    val alreadyDrawedMenus = mutableListOf<String>()

    val koreanMenus = listOf<String>("비빔밥", "돌솥비빔밥", "순대국밥", "김치찌개", "뼈해장국")
    val imonumMenus = listOf<String>("떡볶이", "튀김", "순대", "김밥", "오뎅")

    val koreanRandomMenus : String = koreanMenus.randomOrNull() ?: "메뉴 없음"

    // 이미 뽑힌 녀석은 안나와야 한다 - 어떻게 하면 될까?
    if(alreadyDrawedMenus.contains(koreanRandomMenus)){
        // TODO 다시 뽑기
    } else {
        print("뽑은 메뉴 : $koreanRandomMenus")
    }


    alreadyDrawedMenus.add(koreanRandomMenus)

}
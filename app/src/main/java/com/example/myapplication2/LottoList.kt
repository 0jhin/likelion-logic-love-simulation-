package com.example.myapplication2

import kotlinx.coroutines.selects.select

fun main(){

    // 로또 숫자 범위 풀 생성
    // 로또 번호 담을 빈 리스트 생성

    // 반복 시작
    // 리스트 랜덤 차출
    // 조건 차출 된 숫자가 범위풀 안에 없을 때 실행
    // 범위풀에 추가 .add 하면 그냥 뒤에 추가 됨
    // 6번 반복
    // 반복 종료

    val randRange = 1..45
    var lottoList = mutableListOf<Int>()
    var lottoNum = 1
    var count = 0

    while (lottoNum <= 7){
        var selectNum = randRange.random()
        if (!lottoList.contains(selectNum)){
            lottoList.add(selectNum)
            lottoNum++
        }
        count++
    }
    println("선택 된 숫자 : $lottoList / 실행 된 횟수 : $count")
}
package com.example.myapplication2

// TODO up 구현
// 현재 다이아 위치를 찾는다
// 새로운 다이아를 그린다
// 기존 다이아 위치를 지운다


fun main(){
    val twoDimension = listOf<List<String>>(
        mutableListOf<String>(" "," "," ", " ", " "),
        mutableListOf<String>(" "," ","o", " ", " "),
        mutableListOf<String>(" ","o","o", "o", " "),
        mutableListOf<String>(" "," ","o", " ", " "),
        mutableListOf<String>(" "," "," ", " ", " "),
    )

    val upDimension = listOf<List<String>>(
        mutableListOf<String>(" "," ","o", " ", " "),
        mutableListOf<String>(" ","o","o", "o", " "),
        mutableListOf<String>(" "," ","o", " ", " "),
        mutableListOf<String>(" "," "," ", " ", " "),
        mutableListOf<String>(" "," "," ", " ", " "),
        )

    val downDimension = listOf<List<String>>(
        mutableListOf<String>(" "," "," ", " ", " "),
        mutableListOf<String>(" "," "," ", " ", " "),
        mutableListOf<String>(" "," ","o", " ", " "),
        mutableListOf<String>(" ","o","o", "o", " "),
        mutableListOf<String>(" "," ","o", " ", " "),
    )

    val leftDimension = listOf<List<String>>(
        mutableListOf<String>(" "," "," ", " ", " "),
        mutableListOf<String>(" ","o", " ", " "," "),
        mutableListOf<String>("o","o", "o", " "," "),
        mutableListOf<String>(" ","o", " ", " "," "),
        mutableListOf<String>(" "," "," ", " ", " "),
    )

    val rightDimension = listOf<List<String>>(
        mutableListOf<String>(" "," "," ", " ", " "),
        mutableListOf<String>(" "," "," ", "o", " "),
        mutableListOf<String>(" "," ","o", "o", "o"),
        mutableListOf<String>(" "," "," ", "o", " "),
        mutableListOf<String>(" "," "," ", " ", " "),
    )

    //맨 윗줄, 아랫줄, 맨 앞 인덱스, 뒤 인덱스 옮기는 방식으로 다시



    twoDimension.forEach {
        it.forEach {
            print("$it")
        }
        println()
    } // 처음 다이아 중앙 표시



    while (true){
        println("up / down / left / right") // 게임 설명
        print("커맨드 입력 : ")
        var userCommand = readln() // 사용자 입력 대기

        when(userCommand){
            "up" -> upDimension.forEach {
                        it.forEach {
                            print("$it")
                        }
                        println()
                    }
            "down" -> downDimension.forEach {
                        it.forEach {
                            print("$it")
                        }
                        println()
                    }
            "left" -> leftDimension.forEach {
                        it.forEach {
                            print("$it")
                        }
                        println()
                    }
            "right" -> rightDimension.forEach {
                        it.forEach {
                            print("$it")
                        }
                        println()
                    }
        }


    }















//    if (userCommand == "up"){
//        twoDimension.forEach {
//            it.forEach {
//                print("$it")
//            }
//            println()
//        }
//    }




}
package com.example.myapplication2

 fun upUserCommand(userCommand : String = "up") : Boolean {
    val twoDimension = mutableListOf<MutableList<String>>(
        mutableListOf<String>(" "," "," ", " ", " "),
        mutableListOf<String>(" "," ","o", " ", " "),
        mutableListOf<String>(" ","o","o", "o", " "),
        mutableListOf<String>(" "," ","o", " ", " "),
        mutableListOf<String>(" "," "," ", " ", " "),
    )

    var upDia = twoDimension.add(twoDimension.first()) // 첫 번째 줄 마지막 줄에 추가
    twoDimension.remove(twoDimension.first()) // 첫 번째 줄 삭제
    twoDimension.forEach { // 출력
        it.forEach {
            print("$it")
        }
        println() // 한 줄 띄기
    }


    return upDia
}

 fun downUserCommand(userCommand : String = "down"){
    val twoDimension = mutableListOf<MutableList<String>>(
        mutableListOf<String>(" "," "," ", " ", " "),
        mutableListOf<String>(" "," ","o", " ", " "),
        mutableListOf<String>(" ","o","o", "o", " "),
        mutableListOf<String>(" "," ","o", " ", " "),
        mutableListOf<String>(" "," "," ", " ", " "),
    )

    var downDia = twoDimension.add(0, twoDimension.last()) // 마지막 줄 첫 번째 줄에 추가
    twoDimension.removeAt(twoDimension.lastIndex) // 마지막 줄 삭제
    twoDimension.forEach { // 출력
        it.forEach {
            print("$it")
        }
        println() // 한 줄 띄기
    }

    return downDia
}

 fun leftUserCommand(userCommand : String = "left"){
    val twoDimension = mutableListOf<MutableList<String>>(
        mutableListOf<String>(" "," "," ", " ", " "),
        mutableListOf<String>(" "," ","o", " ", " "),
        mutableListOf<String>(" ","o","o", "o", " "),
        mutableListOf<String>(" "," ","o", " ", " "),
        mutableListOf<String>(" "," "," ", " ", " "),
    )

    var leftDia = twoDimension.forEachIndexed { index, strings ->
        strings.add(strings.first()) // 첫 번째 인덱스 마지막 인덱스에 추가
        strings.remove(strings.first()) // 첫 번째 인덱스 삭제
        strings.forEach { // 출력
            print("$it")
        }
        println() // 한 줄 띄기
    }

    return leftDia


}

fun rightUserCommand(userCommand: String = "right"){
    val twoDimension = mutableListOf<MutableList<String>>(
        mutableListOf<String>(" "," "," ", " ", " "),
        mutableListOf<String>(" "," ","o", " ", " "),
        mutableListOf<String>(" ","o","o", "o", " "),
        mutableListOf<String>(" "," ","o", " ", " "),
        mutableListOf<String>(" "," "," ", " ", " "),
    )

    var rightDia = twoDimension.forEachIndexed { index, strings ->
        strings.add(0, strings.last()) // 마지막 안덱스 첫 번째 인덱스에 추가
        strings.removeAt(strings.lastIndex) // 마지막 인덱스 삭제
        strings.forEach { // 출력
            print("$it")
        }
        println() // 한 줄 띄기
    }

    return rightDia

}
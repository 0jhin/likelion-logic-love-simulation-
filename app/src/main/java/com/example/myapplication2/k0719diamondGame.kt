package com.example.myapplication2

fun main(){
//    val twoDimension = listOf<List<String>>(
//        mutableListOf<String>("1", "2", "3", "4",  "5"),
//        mutableListOf<String>("6", "7", "8", "9", "10"),
//        mutableListOf<String>("11","12","13","14","15"),
//        mutableListOf<String>("16","17","18", "19", "20"),
//        mutableListOf<String>("21","22","23", "24", "25"),
//    )
    val twoDimension = mutableListOf<MutableList<String>>(
        mutableListOf<String>(" "," "," ", " ", " "),
        mutableListOf<String>(" "," ","o", " ", " "),
        mutableListOf<String>(" ","o","o", "o", " "),
        mutableListOf<String>(" "," ","o", " ", " "),
        mutableListOf<String>(" "," "," ", " ", " "),
    )




    while (true){
        var userCommand : String = readln()


        if (userCommand == "up"){
            twoDimension.add(twoDimension.first())
            twoDimension.remove(twoDimension.first())
            twoDimension.forEach {
                it.forEach {
                    print("$it")
                }
                println()
            }
            }
        if (userCommand == "down"){
            twoDimension.add(0, twoDimension.last())
            twoDimension.removeAt(twoDimension.lastIndex)
            twoDimension.forEach {
                it.forEach {
                    print("$it")
                }
                println()
            }
        }
        if (userCommand == "left"){
            twoDimension.forEachIndexed { index, strings ->
                strings.add(strings.first())
                strings.remove(strings.last())
                strings.forEach {
                    print("$it")
                }
                println()
            }
        }
        if (userCommand == "right"){
            twoDimension.forEachIndexed { index, strings ->
                strings.add(0, strings.last())
                strings.removeAt(strings.lastIndex)
                strings.forEach {
                    print("$it")
                }
                println()
            }
        }

    }


}
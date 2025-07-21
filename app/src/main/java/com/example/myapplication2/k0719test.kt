package com.example.myapplication2

fun main(){
    val twoDimension = mutableListOf<MutableList<String>>(
    mutableListOf<String>("1", "2", "3", "4",  "5"),
    )

    twoDimension.forEachIndexed { index, strings ->
        if (index == 0){
            var test =
            strings.add(strings.first())
            strings.remove(strings.last())
        }
        println(strings)
    }

}
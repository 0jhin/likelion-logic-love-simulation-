package com.example.myapplication2

fun main(){

    val someTriple = Triple(1, "둘", "three")

    val (a : Int, b: String, _) = someTriple

    val firstValue = someTriple.first
    val secondValue = someTriple.second
    val thirdValue = someTriple.third
}


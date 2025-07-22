package com.example.myapplication2

fun main(){

    var num1 = calc()
    var num2 = calc(20, 10)

    println(num1)
    println(num2)

}




// n1 * n2 = result
// n1이 없으면 1이 들어감
// n2가 없으면 100이 들어감
private fun calc(n1 : Int = 1, n2 : Int = 100) : Int{
    return n1 * n2
}
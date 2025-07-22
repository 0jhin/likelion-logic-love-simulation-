    package com.example.myapplication2


    fun main(){

        // n카운트를 입력 받고
        // 빈 배열을 해당 카운트 만큼
        // 반환하는 람다식을 만드시오


        val someListadd : (count : Int) -> List<Int> = { count ->
            val generatedList =  List(size = count, { it })
            generatedList
        }

        val result : List<Int> = someListadd.invoke(10)
        print(result)

        // 람다식 반환이 있는 함수
        val someLambda : () -> String = {
            "핫도그"
        }
    }

    // 반환이 있는 함수
    private fun someFun() : String{
        return ""
    }
package com.example.myapplication2

fun main() {
//    for (i in 1..100) { // 1 번 실행
//        println("outer loop i = $i")
//        for (j in 1..100) { // 100번 실행 하고 outer 2번 실행
//            println("inner loop j = $j")
//            if (j == 10) // 100까지 중에 10번쨰에서 탈출 = 1 ~ 100까지 있지만 10까지만
//                break
//        }
//    }

    myLoop@ for (i in 1..100) { // 1 번 실행 // 너도 종료
        println("outer loop i = $i")
        for (j in 1..100) { // 100번 실행 하고 outer 2번 실행
            println("inner loop j = $j")
            if (j == 10) // 100까지 중에 10번쨰에서 탈출 = 1 ~ 100까지 있지만 10까지만
                break@myLoop // j가 10이면 종료
        }
    }
}

// 여기 물어봐야 함
// 변수1 false
// 변수2 false
// 변수3 false

// 변수4 == 변수1 && 변수2 && 변수3
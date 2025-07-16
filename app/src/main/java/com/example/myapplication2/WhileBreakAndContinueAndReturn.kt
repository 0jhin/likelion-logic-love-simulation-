package com.example.myapplication2

fun main() {
//     break continue return 차이
    while (true) {
        println("이건 첫번째 레슨! / 아무말이나 입력하시오")
        val input = readLine()
        println("입력 값: $input")
        if (input == "pass") { // TODO: pass 입력시 작업 패스
            continue
        } else if (input == "break") {// TODO: break 입력시 해당 루프 탈출
            break
        } else if (input == "exit") {// TODO: exit 입력시 해당 프로그램 탈출
            return
        }
        println("작업하기")
    }
    while (true) {
        println("이건 두번째 레슨! / 아무말이나 입력하시오")
        val input = readLine()
        println("입력 값: $input")
        if (input == "pass") { // TODO: pass 입력시 작업 패스
            continue
        } else if (input == "break") {// TODO: break 입력시 해당 루프 탈출
            break
        } else if (input == "exit") {// TODO: exit 입력시 해당 프로그램 탈출
            return
        }
        println("작업하기")
    }
    while (true) {
        println("이건 세번째 레슨! / 아무말이나 입력하시오")
        val input = readLine()
        println("입력 값: $input")
        if (input == "pass") { // TODO: pass 입력시 작업 패스
            continue
        } else if (input == "break") {// TODO: break 입력시 해당 루프 탈출
            break
        } else if (input == "exit") {// TODO: exit 입력시 해당 프로그램 탈출
            return
        }
        println("작업하기")
    }
}
package com.example.myapplication2

fun main() {

//================================게임 설명 주석================================================
    // 사용자는 가상의 애인과 데이트를 하는 설정이다 (기본 호감도: 0)
    // 사용자는 입력을 20번만 할 수 있다.
    // 가상의 애인은 Y, N으로 당신에게 20가지 질문을 던진다
    // 질문에 답을 할 때마다 - 호감 답변을 하면 1점 상승, 비호감 답변을 하면 -1점 하락한다
    // 20번의 질문에 대한 답을 모두하고 최종 호감도 점수에 따라 3가지 상호작용을 한다.

    // 1. 점수 0이하 = "우리 헤어져"
    // 2. 점수 5 ~ 10 = "우리 생각할 시간을 가지자"
    // 3. 점수 10 초과 = "나와 결혼해줄래"

    // 대사 부분은 디테일한 표현 X
    // 클린 코드 우선
//================================게임 설명 주석================================================


//================================사전 변수 / 상수 선언================================================
    val description : String = "당신은 애인과 데이트를 하고 있다, 애인은 Y or N로 당신에게 20번의 질문을 할 것이다. 질문의 답에 따라 호감도가 변하니 신중하게 대답하기 바란다.(호감 답변을 하면 1점 상승, 비호감 답변을 하면 -1점 하락한다)"
    // 상수로 간단한 게임 설명 하드 코딩

    val gameStarAsk : String = "게임을 시작하시겠습니까? (Y/N)"
    // 상수로 게임 시작 질문 하드 코딩

    val gameStarted : String = "게임을 시작합니다"
    // 싱수로 게임 시작 메세지 하드 코딩

    val endGame : String = "게임을 종료합니다."
    // 상수로 게임 종료 메세지 하드 코딩

    val errorInput : String = "잘못 입력하셨습니다. 다시 입력하세요"
    // 상수로 입력 오류 메세지 하드 코딩

    val minus : String = "-1점"
    // 상수로 -1점 메세지 하드 코딩

    val plus : String = "+1점"
    // 상수로 +1점 메세지 하드 코딩

    var count = 1
    // 현재 질문 카운트

    val maxCount = 20
    // 최대 질문 횟수

    val question = listOf("질문 1", "질문 2", "질문 3", "질문 4", "질문 5", "질문 6", "질문 7", "질문 8", "질문 9", "질문 10", "질문 11", "질문 12", "질문 13", "질문 14", "질문 15", "질문 16", "질문 17", "질문 18", "질문 19", "질문 20")
    // 질문 내용(디테일한 질문은 생략)

    var questionIndex = 0
    // 질문 내용 리스트 접근용 index

    var question2 = listOf("")
    // 나왔던 질문 보관용 list

    var questionIndex2 = 0
    // 나왔던 질문 보관용 list 접근용 index

//================================사전 변수 / 상수 선언================================================

//========================================게임 시작================================================
    println(description)
    // 게임 설명 출력

    println(gameStarAsk)
    // 게임 시작 여부 출력


    var startGame : String? = readLine()
    // 게임 시작 답 입력


    var isValidAnswer = if (startGame == "Y" || startGame == "N") true else false
    // 게임 시작에 대한 사용자 입력이 "Y"나 "N"가 맞으면 true 아니라면 false
    // 현정강사님 감사합니다.
//========================================게임 시작================================================

//=================================사용자 입력 오류================================================
        while (!isValidAnswer) { // "Y"나 "N"가 아니라면(false라면) 실행
            println(errorInput) //입력 에러 메세지 출력
            var startGame2 : String? = readLine() // 게임 시작 답 다시 입력
            if (startGame2 == "Y" || startGame2 == "N" ){ // 여기서 Y 나 N입력하면 if 진입
                startGame = startGame2 // 만약 값이 N이라면 다음 if에서 return하기 위해 값 재할당
                isValidAnswer = true // 정상적인 입력을 받았으니 플래그 변경으로 반복문 종료
            }
        }


//=================================사용자 입력 오류================================================


//=================================사용자 게임 종료================================================
    if (startGame == "N") { // N 입력하면 게임 종료
        println(endGame)
        return
    }
//=================================사용자 게임 종료================================================


//=======================================질문 시작================================================
    var favorability : Int = 0
    // 변수로 기본 호감도 생성 : 0

    var indexfavorit : Int = 20
    // 질문 갯수 만큼의 수

    val score0 : String = "우리 헤어져"
    val scoreOver0Under5 : String = "당분간 연락하지마"
    val scoreOver0Under10 : String = "우리 생각할 시간을 가지자"
    val score10Over : String = "나와 결혼해줄래"

    println(gameStarted)
    println()
    println("현재 애정도 : $favorability")
    //시작 전 현재 애정도 사용자 전달용

    while (count <= maxCount) {
        print("$count 번째 질문: ")
        println(question[questionIndex]) // 질문
//        questionIndex++ // 다음 질문 넘어가기 위해 +1
        question[--indexfavorit]
        print("당신의 대답은? : ")
        val answer: String? = readLine()
        var isValidAnswer2 = if (answer == "Y" || answer == "N") true else false // 질문에 대한 사용자 입력이 "Y"나 "N"가 맞으면 true 아니라면 false
        if (isValidAnswer2 == true){
            if (answer == "Y") {
                println(plus)
                favorability++
            } else if (answer == "N") {
                println(minus)
                favorability--
            }
        } else if (isValidAnswer2 == false){
            while (isValidAnswer2 == false) { // "Y"나 "N"가 아니라면(false라면) 실행
                println(errorInput) //입력 에러 메세지 출력
                var answer2 : String? = readLine() // 게임 시작 답 다시 입력
                if (answer2 == "Y"){ // 여기서 Y 입력하면 게임 시작으로 이동하도록 구현 필요 // 되는데?? 뭐지??
                    println(plus)
                    favorability++
                    break
                } else if (answer2 == "N"){ // 응용해서 N 입력하면 게임 탈출하도록 구현함
                    println(minus)
                    favorability--
                    break
                }

            }
        }
        count++
        println("현재 애정도 : $favorability")
        println()
    }

    println("최종 점수 : $favorability")
    if (favorability <= 0){
        println(score0)
    } else if (favorability >= 5 && favorability <= 10){
        println(scoreOver0Under10)
    } else if (favorability > 0 && favorability < 5){
        println(scoreOver0Under5)
    } else if (favorability > 10){
        println(score10Over)
    }
}
//=======================================질문 종료================================================
// 1. 점수 0이하 = "우리 헤어져"
// 2. 점수 5 ~ 10 = "우리 생각할 시간을 가지자"
// 3. 점수 10 초과 = "나와 결혼해줄래"
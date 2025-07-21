package com.example.myapplication2

fun main(){

    var shoppingCart = mutableListOf<String>()
    var deleteItem = ""
    var i = 0




    while (true) { // 상수

        print("장바구니 담기 : ")
        var userInput = readLine() ?: ""
        if (userInput != ""){
            shoppingCart.add(userInput)
            println("다음 단계로 넘어가려면 [next]를 계속 하시려면 [아무 키]나 입력하세요")
            var breakAsk = readln()
            if (breakAsk == "next"){
                break
            }
            continue
        }
        println("필수 항목입니다.")
        println("다시 입력 해주세요")
        println()
    }




    while (true){
        var input = ""
        println("삭제하려면 del / 추가하려면 add / 완료하려면 end / 취소하려면 cancel")
        input = readln()

        if (input == "del"){
            println("현재 장바구니 : $shoppingCart") // 현재 물건 리스트 보여줌
            print("삭제하실 물건 입력 : ") // 뭐 지울건지 입력 받음
            var delItem = readln() // 입력
            if (shoppingCart.contains(delItem)){ // 받은 입력이 장바구니에 있으면 실행
                var delItemIndex = delItem.indexOf(delItem)
                var test = shoppingCart.removeAt(delItemIndex)// 해당 내용 삭제
                deleteItem = test
                println("물건이 삭제 되었습니다.")
                println(shoppingCart)
                continue
            }

        }
        if (input =="add"){
            print("추가하실 내용 : ")
            val add = readLine() ?: ""
            if (add != ""){
                println("현재 장바구니 : $shoppingCart") // 현재 장바구니 보여줌
                var indexCount = shoppingCart.count() // 현재 몇 까지의 인덱스가 있는지 확인
                println("1부터 $indexCount 사이의 숫자를 입력 하세요")
                print("몇 번째 자리에 추가 : ") // 위치 확인
                val addNum = readln().toIntOrNull() ?: 0 // 숫자 입력 받음
                if (addNum > 0 && addNum <= indexCount){ // 받은 숫자가 인덱스를 벗어나지 않으면 실행
                    shoppingCart.add(index = addNum, element = add) // 추가
                    break
                }
            }
            println("필수 항목입니다.")
            println("다시 입력 해주세요")
            continue
        }

        if (input == "cancel"){
            shoppingCart.add(deleteItem)
            println(shoppingCart)
            continue
        }
        println("잘못 입력 하셨습니다. 다시 입력 하세요")
    }


    println("최종 장바구니 : $shoppingCart")
}
package com.example.myapplication2

enum class DesktopParts(val type: String){
    Cpu("CPU"),
    Memory("램"),
    GraphicsCard("그래픽카드"),
    Disk("SSD");

    fun getInfo() : String{
        return "이 컴퓨터 부품은 ${this.type}입니다"
    }

    fun price() : Int {
        return when(this) {
            DesktopParts.Cpu -> 300000
            DesktopParts.Memory -> 80000
            DesktopParts.GraphicsCard -> 1000000
            DesktopParts.Disk -> 200000
        }
    }

    fun printInto(price : Int){
        when(this) {
            DesktopParts.Cpu -> println("CPU 가격은 - ${price}입니다")
            DesktopParts.Memory -> println("Memory 가격은 - ${price}입니다")
            DesktopParts.GraphicsCard -> println("GraphicsCard 가격은 - ${price}입니다")
            DesktopParts.Disk -> println("Disk 가격은 - ${price}입니다")
        }
    }



}

fun main(){
    val thisDesktop = DesktopParts.Memory
    val info = thisDesktop.getInfo()
    println(info)

    thisDesktop.printInto(80000)


    when(thisDesktop) {
        DesktopParts.Cpu -> {
            println("CPU 입니다")
        }
        DesktopParts.Memory -> {
            println("램 입니다.")
        }
        DesktopParts.GraphicsCard -> {
            println("그래픽카드 입니다.")
        }
        DesktopParts.Disk -> {
            println("SSD 입니다.")
        }
    }
}
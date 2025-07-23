package com.example.myapplication2

import kotlin.collections.Map

fun main(){

    val someMap : Map<String, Any>  = mapOf(
        "브랜드명" to "나이키",
        "카테고리" to "신발 > 스니커즈 > 패션스니커즈화(나이키)",
        "제품명" to "에어 포스 1 07 M - 화이트 / CW2288-111",
        "반품여부" to "무료반품",
        "후기 평점" to 4.9,
        "후기 갯수" to 7850,
        "가격" to 139000,
        "찜" to 59000,
        "이미지" to "img/~"
    )

    val result = makeProduct("후드집업")
    println(result)

    makeProduct(mapOf("카테고리" to "아디다스"))
}

private fun makeProduct(params: Map<String, Any>) : Map<String, Any> {

    val  brandName= params["브랜드명"] ?: ""
    val category = params["카테고리"] ?: ""
    val productName = params["제품명"] ?: ""

    val product : Map<String, Any> = mapOf(
        "브랜드명" to brandName,
        "카테고리" to category,
        "제품명" to productName,
        "반품여부" to "무료반품",
        "후기 평점" to 4.9,
        "후기 갯수" to 7850,
        "가격" to 139000,
        "찜" to 59000,
        "이미지" to "img/~"
    )

    return product
}

private fun makeProduct(productName : String) : Map<String, Any>{
    val product : Map<String, Any>  = mapOf(
        "브랜드명" to productName,
        "카테고리" to "신발 > 스니커즈 > 패션스니커즈화(나이키)",
        "제품명" to "에어 포스 1 07 M - 화이트 / CW2288-111",
        "반품여부" to "무료반품",
        "후기 평점" to 4.9,
        "후기 갯수" to 7850,
        "가격" to 139000,
        "찜" to 59000,
        "이미지" to "img/~"
    )
    return product
}
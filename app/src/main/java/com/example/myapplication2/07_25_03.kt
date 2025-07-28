package com.example.myapplication2

import android.media.Image


data class UserEntity(
    var id : String,
    var password : String,
    var profile_image : Image,
    var name : String,
    var email : String,
    var gender : String,
    var date_of_birht : Int,
    var mobile_number : Int,
    var introduce : String,
    var join_date : Int,
    var is_admin : Boolean,

)

data class ReviewEntitu(
    var user : UserEntity
)

data class ProductEntity(
    val user : UserEntity,
    val review : ReviewEntitu
)
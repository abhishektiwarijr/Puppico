package com.example.androiddevchallenge.data

data class Puppy(
    val id : String,
    val image: String,
    val name: String,
    val breed: String,
    val age: Int,
    val gender: String,
    val address: String = "Mancton, NB",
    val kms: Float = 1.2f,
    val description: String = "",
)

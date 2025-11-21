package com.example.srl

data class Product(
    var name: String = "",
    var category: String = "",
    var quantity: Int = 0,
    var price: Double = 0.0
) {
    val id: String = ""
}
package com.example.myfitnessapp.data

import androidx.lifecycle.ViewModel
import com.example.myfitnessapp.model.Product

class ProductViewModel : ViewModel() {

    // List of products
    private val productList: MutableList<Product> = mutableListOf()

    // Function to add a product
    fun addProduct(product: Product) {
        productList.add(product)
    }

    // Function to remove a product
    fun removeProduct(product: Product) {
        productList.remove(product)
    }

    // Function to get all products
    fun getAllProducts(): List<Product> {
        return productList
    }
}
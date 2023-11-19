package com.example.recipeapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.recipeapp.databinding.FragmentListCategoriesBinding

data class Category(
    val id: Int,
    val title: String,
    val description: String,
    val imageUrl: String,
)

data class Ingredient(
    val quantity: Double,
    val unitOfMeasure: String,
    val description: String,
)

data class Recipe(
    val id: Int,
    val title: String,
    val ingredients: List<Ingredient>,
    val method: List<String>,
    val imageUrl: String,
)

class CategoriesListFragment: Fragment() {

    private lateinit var binding: FragmentListCategoriesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListCategoriesBinding.inflate(inflater, container, false)
        return binding.root
    }



    val burger = Category(0, "Бургеры", "Рецепты всех популярных видов бургеров", "burger.png")
    val dessert = Category(1, "Десерты", "Самые вкусные рецепты десертов специально для вас", "dessert.png")
    val pizza = Category(2, "Пицца", "Пицца на любой вкус и цвет. Лучшая подборка для тебя", "pizza.png")
    val fish = Category(3, "Рыба", "Печеная, жареная, сушеная, любая рыба на твой вкус", "fish.png")
    val soup = Category(4, "Супы", "От классики до экзотики: мир в одной тарелке", "soup.png")
    val salad = Category(5, "Салаты", "Хрустящий калейдоскоп под соусом вдохновения", "salad.png")

}
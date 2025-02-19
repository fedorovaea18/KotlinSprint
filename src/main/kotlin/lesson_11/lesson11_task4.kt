package ru.fedorova.spring.lesson_11

class recipeCategory(
    val categoryName: String,
    val recipes: List<Recipe>,
)

class Recipe(
    val name: String,
    val countOfPortion: Int,
    val ingredients: List<Ingredient>,
    val inctruction: String,
)

class Ingredient(
    val name: String,
    val count: String,
)

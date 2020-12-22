package com.rubywei.cleanarchitecturerecipes.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ResultModel(
    @SerialName("aggregateLikes")
    val aggregateLikes: Int,
    @SerialName("cheap")
    val cheap: Boolean,
    @SerialName("dairyFree")
    val dairyFree: Boolean,
    @SerialName("extendedIngredients")
    val extendedIngredientModels:  List<ExtendedIngredientModel>,
    @SerialName("glutenFree")
    val glutenFree: Boolean,
    @SerialName("id")
    val recipeId: Int,
    @SerialName("image")
    val image: String,
    @SerialName("readyInMinutes")
    val readyInMinutes: Int,
    @SerialName("sourceName")
    val sourceName: String?,
    @SerialName("sourceUrl")
    val sourceUrl: String,
    @SerialName("summary")
    val summary: String,
    @SerialName("title")
    val title: String,
    @SerialName("vegan")
    val vegan: Boolean,
    @SerialName("vegetarian")
    val vegetarian: Boolean,
    @SerialName("veryHealthy")
    val veryHealthy: Boolean,
)
package com.example.movies_app.models

data class Data(
    val country: String,
    val genres: List<String>,
    val id: Int,
    val title: String,
    val year: Int,
    val images: List<String>,
    val imdb_rating: String,
    val poster: String,
)

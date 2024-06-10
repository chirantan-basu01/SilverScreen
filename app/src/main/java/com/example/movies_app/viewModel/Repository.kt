package com.example.movies_app.viewModel

import com.example.movies_app.models.Details
import com.example.movies_app.models.MoviesList
import com.example.movies_app.utils.RetrofitInstance
import retrofit2.Response

class Repository {
    suspend fun getMovieList(page: Int): Response<MoviesList> {
        return RetrofitInstance.api.getMovies(page)
    }

    suspend fun getDetailsById(id: Int): Response<Details> {
        return RetrofitInstance.api.getDetailsById(id = id)
    }
}


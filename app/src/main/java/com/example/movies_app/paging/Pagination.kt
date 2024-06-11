package com.example.movies_app.paging

interface Pagination<Key, Item> {
    suspend fun loadNextPage()
    fun reset()
}
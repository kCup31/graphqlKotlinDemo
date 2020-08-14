package com.diptanu.project.graphqlKotlinDemo.book.model

data class Author (
        val id: String,
        val name: String,
        val age: String,
        val country: String,
        var bookref: List<String>
)


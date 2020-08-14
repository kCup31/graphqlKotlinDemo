package com.diptanu.project.graphqlKotlinDemo.book.resolver

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.diptanu.project.graphqlKotlinDemo.book.dao.AuthorDao
import com.diptanu.project.graphqlKotlinDemo.book.model.Book
import org.springframework.stereotype.Component

@Component
class AuthorQueryResolver (private val authorDao: AuthorDao, val authorResolver: AuthorResolver) : GraphQLQueryResolver {

    fun getAuthorById(id: String) = authorDao.getAuthorById(id)

    fun getAuthorBooks(id: String) : List<Book> {
        val author = authorDao.getAuthorById(id)
        return authorResolver.books(author)
    }
}
package com.diptanu.project.graphqlKotlinDemo.book.resolver

import com.coxautodev.graphql.tools.GraphQLResolver
import com.diptanu.project.graphqlKotlinDemo.book.dao.AuthorDao
import com.diptanu.project.graphqlKotlinDemo.book.dao.BookDao
import com.diptanu.project.graphqlKotlinDemo.book.model.Author
import com.diptanu.project.graphqlKotlinDemo.book.model.Book
import org.springframework.stereotype.Component

@Component
class AuthorResolver (private val  bookDao: BookDao) : GraphQLResolver<Author> {


    //get books by Author id
    fun books(author: Author): List<Book> {
        val bookLists: MutableList<Book> = mutableListOf<Book>()
        author.bookref.forEach { book ->
            bookLists.add(bookDao.getBook(book))
        }
        return bookLists
    }
}
package com.diptanu.project.graphqlKotlinDemo.book.dao

import com.diptanu.project.graphqlKotlinDemo.book.model.Book
import com.diptanu.project.graphqlKotlinDemo.book.model.Category
import org.springframework.stereotype.Component

@Component
class BookDao {

    private val data = mutableListOf(
            Book(id="1", name = "Da Vinci Code", category = Category.FICTION),
            Book(id= "2", name = "Harry Potter", category = Category.FICTION),
            Book(id="3", name = "The Blue Umbrella", category = Category.FICTION),
            Book(id="4", name = "The Kite Runner", category = Category.FICTION),
            Book(id= "5", name = "I am Malala", category = Category.NON_FICTION),
            Book(id="6", name = "Five Point Someone", category = Category.FICTION),
            Book(id="7", name = "Camel Club", category = Category.FICTION),
            Book(id="8", name = "Becoming Obama", category = Category.NON_FICTION),
            Book(id="9", name = "Dead Wake", category = Category.NON_FICTION),
            Book(id="10", name = "Martian", category = Category.FICTION),
            Book(id="11", name = "The Namesake", category = Category.FICTION),
            Book(id="12", name = "The Lost Symbol", category = Category.FICTION),
            Book(id="13", name = "The Room on the Roof", category = Category.FICTION),
            Book(id="14", name = "Delhi is not far", category = Category.FICTION),
            Book(id="15", name = "2 States", category = Category.FICTION),
            Book(id="16", name = "The 3 mistakes of my life", category = Category.FICTION)
    )


    fun getBook(id: String) : Book =  data.first { book-> book.id == id }
}

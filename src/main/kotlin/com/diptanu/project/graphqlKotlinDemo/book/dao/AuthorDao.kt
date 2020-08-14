package com.diptanu.project.graphqlKotlinDemo.book.dao

import com.diptanu.project.graphqlKotlinDemo.book.model.Author
import org.springframework.stereotype.Component

@Component
class AuthorDao {
    private val data = mutableListOf(
            Author(id="1", name = "Dan Brown", age="56", country = "USA" , bookref = listOf("1", "12")),
            Author(id="2", name = "J K Rowling", age="55", country = "England", bookref = listOf("2")),
            Author(id="3", name = "Ruskin Bond", age="86", country = "India", bookref = listOf("3", "13", "14")),
            Author(id="4", name = "Khaled Hosseini", age="55", country = "Afganistan", bookref = listOf("4")),
            Author(id="5", name = "Malala Yousafzai", age="23", country = "Pakistan", bookref = listOf("5")),
            Author(id="6", name = "Chetan Bhagat", age="46", country = "India", bookref = listOf("6", "15", "16")),
            Author(id="7", name = "David Baldacci", age="60", country = "USA", bookref = listOf("7")),
            Author(id="8", name = "Michelle Obama", age="56", country = "USA", bookref = listOf("8")),
            Author(id="9", name = "Eric Larkson", age="66", country = "USA", bookref = listOf("9")),
            Author(id="10", name = "Andy Weir", age="48", country = "USA", bookref = listOf("10")),
            Author(id="11", name = "Jhumpa Lahiri", age="53", country = "UK", bookref = listOf("11"))
    )

    fun getAuthorById(id: String) = data.first{ author -> author.id == id }

}

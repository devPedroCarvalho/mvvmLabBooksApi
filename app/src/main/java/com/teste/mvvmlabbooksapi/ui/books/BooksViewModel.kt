package com.teste.mvvmlabbooksapi.ui.books

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.teste.mvvmlabbooksapi.data.model.Book

class BooksViewModel: ViewModel() {

    val booksLiveData: MutableLiveData<List<Book>> = MutableLiveData()

    fun getBooks(){
        booksLiveData.value = createFakeBooks()
    }

    fun createFakeBooks(): List<Book>{
        return listOf(
            Book("title1","autor1"),
            Book("title2","autor2"),
            Book("title3","autor3")
        )
    }
}
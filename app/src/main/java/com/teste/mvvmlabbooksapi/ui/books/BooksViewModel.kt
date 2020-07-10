package com.teste.mvvmlabbooksapi.ui.books

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.teste.mvvmlabbooksapi.data.model.Book
import com.teste.mvvmlabbooksapi.data.network.ApiService
import com.teste.mvvmlabbooksapi.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BooksViewModel: ViewModel() {

    val booksLiveData: MutableLiveData<List<Book>> = MutableLiveData()

    fun getBooks(){
        //booksLiveData.value = createFakeBooks()
        ApiService.service.getBooks().enqueue(object: Callback<BookBodyResponse>{
            override fun onFailure(call: Call<BookBodyResponse>, t: Throwable) {

            }

            override fun onResponse(
                call: Call<BookBodyResponse>,
                response: Response<BookBodyResponse>
            ) {

                val resp= response.body()
                print(resp)
                if (response.isSuccessful){
                    val books: MutableList<Book> = mutableListOf()

                    response.body()?.let {bookBodyResponse ->
                        for (results in bookBodyResponse.bookResult){
                            val book:Book = Book(
                                title = results.bookDetailResponses[0].title,
                                author = results.bookDetailResponses[0].author
                            )
                            books.add(book)
                        }
                    }
                    booksLiveData.value = books
                }
            }

        })
    }
}
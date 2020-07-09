package com.teste.mvvmlabbooksapi.ui.books

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.teste.mvvmlabbooksapi.R
import com.teste.mvvmlabbooksapi.data.model.Book
import kotlinx.android.synthetic.main.activity_books.*

class BooksActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        toolbar_main_id.title = getString(R.string.app_name)
        setSupportActionBar(toolbar_main_id)

        with(recycler_books){
            layoutManager = LinearLayoutManager(this@BooksActivity,RecyclerView.VERTICAL,false)
            setHasFixedSize(true)
            adapter = BooksAdapter(getBooks())

        }
    }
    fun getBooks(): List<Book>{
        return listOf(
            Book("title1","autor1"),
            Book("title2","autor2"),
            Book("title3","autor3")

        )
    }
}

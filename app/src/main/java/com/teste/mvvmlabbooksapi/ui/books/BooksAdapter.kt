package com.teste.mvvmlabbooksapi.ui.books

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.teste.mvvmlabbooksapi.R
import com.teste.mvvmlabbooksapi.data.model.Book
import kotlinx.android.synthetic.main.item_book.view.*

class BooksAdapter(val books: List<Book>): RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent,false)
        return BooksViewHolder(view)
    }

    override fun getItemCount(): Int {
        return books.count()
    }

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
        holder.bindView(books[position])
    }

    class BooksViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        val title = itemView.text_title_id
        val author = itemView.text_author_id

        fun bindView(book:Book){
            title.text = book.title
            author.text = book.author
        }
    }

}
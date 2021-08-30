package com.itsthetom.newsor.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.itsthetom.newsor.R
import com.itsthetom.newsor.databinding.LayoutNewsBinding
import com.itsthetom.newsor.datamodel.News


class NewsAdapter constructor(private val onItemClicked:(News)->Unit) :ListAdapter<News, NewsAdapter.NewsViewHolder>(NewsDiffUtil){

    inner class NewsViewHolder(view: View):RecyclerView.ViewHolder(view){
        val binding=LayoutNewsBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.layout_news,parent,false)
        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val news=getItem(position)
        holder.binding.tvNewsTitle.text=news.title
        holder.binding.tvByAuthor.text=news.author
        holder.binding.newsData.text=news.date
        holder.binding.newsImg.setImageResource(news.imgId)
    }


}
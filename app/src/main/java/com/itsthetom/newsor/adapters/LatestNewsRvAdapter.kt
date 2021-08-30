package com.itsthetom.newsor.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.itsthetom.newsor.R
import com.itsthetom.newsor.databinding.LayoutLatestNewsItemBinding
import com.itsthetom.newsor.datamodel.News

class LatestNewsRvAdapter(private val onItemClicked:(News)->Unit)
    : ListAdapter<News,LatestNewsRvAdapter.LatestNewsViewHolder>(NewsDiffUtil){

   inner class LatestNewsViewHolder(view: View):RecyclerView.ViewHolder(view){
         val binding=LayoutLatestNewsItemBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LatestNewsViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.layout_latest_news_item,parent,false)
        return LatestNewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: LatestNewsViewHolder, position: Int) {
        val news=getItem(position)

        holder.binding.tvByAuthor.text=news.author
        holder.binding.newsTitle.text=news.title
        holder.binding.newsDesc.text=news.description
        holder.binding.newsImg.setImageResource(news.imgId)
    }

     
}
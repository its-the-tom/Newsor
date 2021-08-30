package com.itsthetom.newsor.adapters

import androidx.recyclerview.widget.DiffUtil
import com.itsthetom.newsor.datamodel.News

object NewsDiffUtil: DiffUtil.ItemCallback<News>() {
    override fun areItemsTheSame(oldItem: News, newItem: News): Boolean {
        return oldItem==newItem
    }

    override fun areContentsTheSame(oldItem: News, newItem: News): Boolean {
        return oldItem.title.equals(newItem.title) && oldItem.description.equals(newItem.description)
    }
}
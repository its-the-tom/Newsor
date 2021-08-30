package com.itsthetom.newsor.datamodel

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class News(val title:String,val description:String,val author:String, val date:String,val imgId:Int):Parcelable

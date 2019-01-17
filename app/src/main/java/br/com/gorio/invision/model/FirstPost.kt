package br.com.gorio.invision.model

import com.google.gson.annotations.SerializedName

data class FirstPost(@SerializedName("date")
                     val date: String = "",
                     @SerializedName("hidden")
                     val hidden: Boolean = false,
                     @SerializedName("item_id")
                     val itemId: Int = 0,
                     @SerializedName("author")
                     val author: Author,
                     @SerializedName("id")
                     val id: Int = 0,
                     @SerializedName("content")
                     val content: String = "",
                     @SerializedName("url")
                     val url: String = "")
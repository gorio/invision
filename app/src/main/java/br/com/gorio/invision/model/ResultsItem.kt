package br.com.gorio.invision.model

import com.google.gson.annotations.SerializedName

data class ResultsItem(@SerializedName("pinned")
                       val pinned: Boolean = false,
                       @SerializedName("featured")
                       val featured: Boolean = false,
                       @SerializedName("bestAnswer")
                       val bestAnswer: String = "",
                       @SerializedName("hidden")
                       val hidden: Boolean = false,
                       @SerializedName("prefix")
                       val prefix: String = "",
                       @SerializedName("rating")
                       val rating: Int = 0,
                       @SerializedName("poll")
                       val poll: String = "",
                       @SerializedName("title")
                       val title: String = "",
                       @SerializedName("posts")
                       val posts: Int = 0,
                       @SerializedName("url")
                       val url: String = "",
                       @SerializedName("tags")
                       val tags: List<String>?,
                       @SerializedName("forum")
                       val forum: Forum,
                       @SerializedName("archived")
                       val archived: Boolean = false,
                       @SerializedName("lastPost")
                       val lastPost: LastPost,
                       @SerializedName("id")
                       val id: Int = 0,
                       @SerializedName("firstPost")
                       val firstPost: FirstPost,
                       @SerializedName("locked")
                       val locked: Boolean = false,
                       @SerializedName("views")
                       val views: Int = 0)
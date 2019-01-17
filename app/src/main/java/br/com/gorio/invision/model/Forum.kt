package br.com.gorio.invision.model

import com.google.gson.annotations.SerializedName

data class Forum(@SerializedName("topics")
                 val topics: Int = 0,
                 @SerializedName("name")
                 val name: String = "",
                 @SerializedName("id")
                 val id: Int = 0,
                 @SerializedName("url")
                 val url: String = "")
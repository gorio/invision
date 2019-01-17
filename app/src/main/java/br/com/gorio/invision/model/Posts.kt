package br.com.gorio.invision.model

import com.google.gson.annotations.SerializedName

data class Posts(@SerializedName("totalResults")
                 val totalResults: Int = 0,
                 @SerializedName("perPage")
                 val perPage: Int = 0,
                 @SerializedName("totalPages")
                 val totalPages: Int = 0,
                 @SerializedName("page")
                 val page: Int = 0,
                 @SerializedName("results")
                 val results: List<ResultsItem>?)
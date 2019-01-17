package br.com.gorio.invision.model

import com.google.gson.annotations.SerializedName

data class PrimaryGroup(@SerializedName("formattedName")
                        val formattedName: String = "",
                        @SerializedName("name")
                        val name: String = "",
                        @SerializedName("id")
                        val id: Int = 0)
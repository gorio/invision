package br.com.gorio.invision.retrofit.service

import br.com.gorio.invision.model.Posts
import retrofit2.Call
import retrofit2.http.GET

interface NoteService {
    @GET("api/forums/topics?key=533ded9ce37d74f6afa6a03cc54bb973&sortDir=desc")
    fun listPosts(): Call<Posts>
}
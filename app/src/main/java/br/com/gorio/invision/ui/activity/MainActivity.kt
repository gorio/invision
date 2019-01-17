package br.com.gorio.invision.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.StaggeredGridLayoutManager
import android.util.Log
import br.com.gorio.invision.R
import br.com.gorio.invision.model.Posts
import br.com.gorio.invision.retrofit.RetrofitInitializer
import br.com.gorio.invision.ui.adapter.PostListAdapter
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val call = RetrofitInitializer().noteService().listPosts()
        call.enqueue(object : Callback<Posts?> {
            override fun onResponse(call: Call<Posts?>?,
                                    response: Response<Posts?>?) {
                response?.body()?.let {
                    val notes: Posts = it
                    configureList(notes)
                }
            }

            override fun onFailure(call: Call<Posts?>?, t: Throwable?) {
                Log.e("onFailure error", t?.message)
            }
        })
    }

    private fun configureList(notes: Posts) {
        val recyclerView = post_list_recyclerview
        recyclerView.adapter = PostListAdapter(notes, this)
        val layoutManager = StaggeredGridLayoutManager(
            2, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager
    }
}

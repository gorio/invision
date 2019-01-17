package br.com.gorio.invision.ui.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.gorio.invision.R
import br.com.gorio.invision.model.Posts
import br.com.gorio.invision.model.ResultsItem
import kotlinx.android.synthetic.main.posts_item.view.*

class PostListAdapter(
    private val posts: Posts,
    private val context: Context
) : Adapter<PostListAdapter.ViewHolder>() {


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.posts_item, p0, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        val note = posts.results!![p1]
        p0?.let {
            it.bindView(note)
        }
    }

    override fun getItemCount(): Int {
        return posts.results!!.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(post: ResultsItem) {
            val title = itemView.post_item_title
            val description = itemView.post_item_description

            title.text = post.title
            description.text = post.url
        }

    }

}

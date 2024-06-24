package com.akirachix.blogreaderapp

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.akirachix.blogreaderapp.models.Article
import com.squareup.picasso.Picasso

class ArticleAdapter(private val context: Context, private val articles: List<Article>) : RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_article, parent, false)
        return ArticleViewHolder(view)
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val article = articles[position]

        holder.author.text = article.author
        holder.title.text = article.title
        holder.publishingDate.text = article.publishingDate
        holder.preview.text = article.desc.take(100)  // Truncate to 100 characters

        Picasso.get()
            .load(article.authorProfilePicture)
            .resize(40, 40)  // Resize to 40x40 pixels
            .centerCrop()
            .into(holder.authorProfilePicture)

        Picasso.get()
            .load(article.articlePhoto)
            .resize(800, 400)  // Resize to 800x400 pixels
            .centerCrop()
            .into(holder.articlePhoto)

        holder.viewFullPostButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(article.fullPostLink))
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = articles.size

    class ArticleViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val author: TextView = view.findViewById(R.id.author)
        val title: TextView = view.findViewById(R.id.title)
        val publishingDate: TextView = view.findViewById(R.id.publishingDate)
        val preview: TextView = view.findViewById(R.id.preview)
        val authorProfilePicture: ImageView = view.findViewById(R.id.authorProfilePicture)
        val articlePhoto: ImageView = view.findViewById(R.id.articlePhoto)
        val viewFullPostButton: Button = view.findViewById(R.id.viewFullPostButton)
    }
}

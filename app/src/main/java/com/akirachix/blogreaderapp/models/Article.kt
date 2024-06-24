package com.akirachix.blogreaderapp.models

data class Article(
    val author: String,
    val authorProfilePicture: Int,  // Drawable resource ID
    val title: String,
    val publishingDate: String,
    val desc: String,  // Full description of the article
    val articlePhoto: Int,  // Drawable resource ID
    val fullPostLink: String
)

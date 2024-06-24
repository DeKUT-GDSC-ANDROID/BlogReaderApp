package com.akirachix.blogreaderapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.akirachix.blogreaderapp.models.Article

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var articleAdapter: ArticleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val articles = listOf(
            Article(
                "Author 1",
                R.drawable.profile_placeholder,
                "Title 1",
                "2023-06-01",
                "This is the full description of article 1. It contains more than 100 characters to demonstrate the truncation in the preview.",
                R.drawable.computer,
                "https://link_to_full_post_1.com"
            ),
            Article(
                "Author 2",
                R.drawable.profile_placeholder,
                "Title 2",
                "2023-06-02",
                "This is the full description of article 2. It contains more than 100 characters to demonstrate the truncation in the preview.",
                R.drawable.computer,
                "https://link_to_full_post_2.com"
            ),
            Article(
                "Author 3",
                R.drawable.profile_placeholder,
                "Title 3",
                "2023-06-03",
                "This is the full description of article 3. It contains more than 100 characters to demonstrate the truncation in the preview.",
                R.drawable.computer,
                "https://link_to_full_post_3.com"
            ),
            Article(
                "Author 4",
                R.drawable.profile_placeholder,
                "Title 4",
                "2023-06-04",
                "This is the full description of article 4. It contains more than 100 characters to demonstrate the truncation in the preview.",
                R.drawable.computer,
                "https://link_to_full_post_4.com"
            ),
            Article(
                "Author 5",
                R.drawable.profile_placeholder,
                "Title 5",
                "2023-06-05",
                "This is the full description of article 5. It contains more than 100 characters to demonstrate the truncation in the preview.",
                R.drawable.computer,
                "https://link_to_full_post_5.com"
            ),
            Article(
                "Author 6",
                R.drawable.profile_placeholder,
                "Title 6",
                "2023-06-06",
                "This is the full description of article 6. It contains more than 100 characters to demonstrate the truncation in the preview.",
                R.drawable.computer,
                "https://link_to_full_post_6.com"
            ),
            Article(
                "Author 7",
                R.drawable.profile_placeholder,
                "Title 7",
                "2023-06-07",
                "This is the full description of article 7. It contains more than 100 characters to demonstrate the truncation in the preview.",
                R.drawable.computer,
                "https://link_to_full_post_7.com"
            )
        )

        articleAdapter = ArticleAdapter(this, articles)
        recyclerView.adapter = articleAdapter
    }
}

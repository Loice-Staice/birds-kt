package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityFifthBirdBinding
import com.example.hello.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class FifthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFifthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFifthBirdBinding. inflate(layoutInflater)
        setContentView(binding.root)

//        val btnnext1 = findViewById<ImageView>(R.id.btnnext1)
        binding.btnprev5.setOnClickListener {
            val intent = Intent (this,SecondBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://media.istockphoto.com/id/1499453496/photo/a-hummingbirds-feast-a-macro-photo-of-a-flower.webp?b=1&s=170667a&w=0&k=20&c=wElJTbFMUZSt_ko5MO1E-biXQOUIkX576ChYivrDDs0=")
            .centerCrop()
            .resize(500,500)
            .into(binding.imageView12)
    }
}
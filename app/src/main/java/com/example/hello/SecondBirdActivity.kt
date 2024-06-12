package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.hello.databinding.ActivityMainBinding
import com.example.hello.databinding.ActivitySecondBirdBinding
import com.squareup.picasso.Picasso

class SecondBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBirdBinding. inflate(layoutInflater)
        setContentView(binding.root)

//
        binding.btnprev1.setOnClickListener {
          finish()
        }

        binding.btnnext3.setOnClickListener{
            val intent = Intent(this,ThirdBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1620694563886-c3a80ec55f41?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fGJpcmRzfGVufDB8fDB8fHww")
            .centerCrop()
            .resize(500,500)
            .into(binding.imageView3)
    }
}


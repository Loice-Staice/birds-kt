package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.hello.databinding.ActivitySecondBirdBinding
import com.example.hello.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class ThirdBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBirdBinding. inflate(layoutInflater)
        setContentView(binding.root)

//
        binding.btnprev2.setOnClickListener {
            finish()
        }

        binding.btnnext3a.setOnClickListener{
            val intent = Intent(this,ThirdBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://plus.unsplash.com/premium_photo-1661963462506-79ba42476383?dpr=1&w=306&auto=format&fit=crop&q=60&crop=entropy&cs=tinysrgb&fm=jpg&ixid=M3wxMjA3fDB8MXxzZWFyY2h8MTJ8fGJpcmRzfGVufDB8MHx8fDE3MTgxMjI4NTB8MQ&ixlib=rb-4.0.3")
            .centerCrop()
            .resize(500,500)
            .into(binding.imageView6)
    }
}

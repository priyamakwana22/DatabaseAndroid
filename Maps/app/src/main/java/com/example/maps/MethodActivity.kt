package com.example.maps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import com.example.maps.databinding.ActivityMethodBinding

class MethodActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMethodBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMethodBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnClick.setOnClickListener {
            var intent = Intent()
            intent.action = MediaStore.ACTION_IMAGE_CAPTURE
            startActivity(intent)
        }
        //Log.d("TAG","onCreate Method called..!")
    }
//
//    override fun onStart() {
//        super.onStart()
//        Log.d("TAG","onStart Method called..!")
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Log.d("TAG","onPause Method called....!")
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Log.d("TAG","Onpause method called..!")
//    }
//
//    override fun onRestart() {
//        super.onRestart()
//        Log.d("TAG","onStop method called")
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Log.d("TAG","onStop method called")
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Log.d("TAG","onDestroy method called...!")
//    }
}
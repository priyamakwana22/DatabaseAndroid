package com.example.databasedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.databasedemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var helper = MyHelper(applicationContext)
        var db = helper.readableDatabase

        var rs = db.rawQuery("SELECT * FROM USERS", null)

        binding.btnShow.setOnClickListener {
            if (rs.moveToNext()) {
                binding.edtName.setText(rs.getString(1))
                binding.edtPass.setText(rs.getString(2))
                binding.edtName.isFocusable = false
                binding.edtPass.isFocusable = false
//                Toast.makeText(this, rs.getString(1), Toast.LENGTH_LONG).show()
            }
        }
    }
}
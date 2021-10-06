package com.example.callbacksrevisited

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(applicationContext,"onCreate Activity 1", Toast.LENGTH_SHORT).show()
        Log.d(this@MainActivity.toString(), "onCreate Activity 1 ")

        title = "First Activity"
        val btn1 = findViewById<Button>(R.id.button)

        btn1.setOnClickListener ( object : View.OnClickListener {
                override fun onClick(v: View?) {
                    val intent = Intent(this@MainActivity, SecondActivity2::class.java)
                    startActivity(intent)

                }

            })

    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(applicationContext,"onStart Activity 1", Toast.LENGTH_SHORT).show()
        Log.d(this@MainActivity.toString(), "onStart Activity 1 ")

    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(applicationContext,"onStop Activity 1", Toast.LENGTH_SHORT).show()
        Log.d(this@MainActivity.toString(), "onStop Activity 1 ")

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(applicationContext,"onResume Activity 1", Toast.LENGTH_SHORT).show()
        Log.d(this@MainActivity.toString(), "onResume Activity 1 ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(applicationContext,"onDestroy Activity 1", Toast.LENGTH_SHORT).show()
        Log.d(this@MainActivity.toString(), "onDestroy Activity 1 ")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(applicationContext,"onPause Activity 1", Toast.LENGTH_SHORT).show()
        Log.d(this@MainActivity.toString(), "onPause Activity 1 ")
    }
}
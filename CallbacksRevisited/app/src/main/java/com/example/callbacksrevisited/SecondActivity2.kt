package com.example.callbacksrevisited

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class SecondActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)
        Toast.makeText(applicationContext,"onCreate Activity 2", Toast.LENGTH_SHORT).show()
        Log.d(this@SecondActivity2.toString(), "onCreate Activity 2 ")

        title = "Second Activity"
    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(applicationContext,"onStart Activity 2", Toast.LENGTH_SHORT).show()
        Log.d(this@SecondActivity2.toString(), "onStart Activity 2 ")

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(applicationContext,"onResume Activity 2", Toast.LENGTH_SHORT).show()
        Log.d(this@SecondActivity2.toString(), "onResume Activity 2 ")
    }
    override fun onStop() {
        super.onStop()
        Toast.makeText(applicationContext,"onStop Activity 2", Toast.LENGTH_SHORT).show()
        Log.d(this@SecondActivity2.toString(), "onStop Activity 2 ")

    }
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(applicationContext,"onDestroy Activity 2", Toast.LENGTH_SHORT).show()
        Log.d(this@SecondActivity2.toString(), "onDestroy Activity 2 ")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(applicationContext,"onPause Activity 2", Toast.LENGTH_SHORT).show()
        Log.d(this@SecondActivity2.toString(), "onPause Activity 2")
    }
}
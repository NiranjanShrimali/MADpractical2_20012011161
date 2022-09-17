package com.example.madpractical2_20012011161

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate: Function Called")
    }

    private fun showMessage(msg: String) {
        Log.i(TAG,msg)
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
        Snackbar.make(findViewById(R.id.mymsg),msg,Snackbar.LENGTH_LONG).show()
    }

    override fun onStart(){
        showMessage("onStart: Function Called")
        super.onStart()
    }

    override fun onRestart(){
        showMessage("onRestart: Function Called")
        super.onRestart()
    }

    override fun onPause(){
        showMessage("onPause: Function Called")
        super.onPause()
    }

    override fun onDestroy(){
        showMessage("onDestroy: Function Called")
        super.onDestroy()
    }

    override fun onStop(){
        showMessage("onStop: Function Called")
        super.onStop()
    }
}
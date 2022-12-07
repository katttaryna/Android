package com.example.ccc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
//import android.widget.TextView
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {
    val TAG: String = " MainActivity "
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG , "start of onCreate function")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()

    }

    fun initViews(){
        val toolbar:MaterialToolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
    }
//вызывает сама система
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_stop ->{
                Log.d(TAG,"action stop")
                return true
            }
            R.id.action_clear ->{
                Log.d(TAG,"action clear")
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
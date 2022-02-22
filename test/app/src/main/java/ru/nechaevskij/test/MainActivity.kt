package ru.nechaevskij.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.MutableLiveData

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val liveData = MutableLiveData<String>("10")
        liveData.observeForever {
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        }
        liveData.value = "10"
    }
}
package ru.nechaevskij.pw_24

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val pic = findViewById<ImageView>(R.id.answer)
        pic.visibility = View.INVISIBLE
        setContentView(R.layout.activity_main)
        val b = findViewById<Button>(R.id.inspect)

        b.setOnClickListener {
            val numbs = arrayOf(
                findViewById<EditText>(R.id.km).text.toString()
                findViewById<EditText>(R.id.m).text.toString()
                findViewById<EditText>(R.id.dm).text.toString()
                findViewById<EditText>(R.id.sm).text.toString()
                findViewById<EditText>(R.id.mm).text.toString()
            )
            val res = findViewById<TextView>(R.id.rezult)

            if (numbs[0]*1000!=numbs[1] ||
                numbs[1]*10!=numbs[2] ||
                numbs[2]*10!=numbs[3] ||
                numbs[3]*10!=numbs[3])
            {
                res.setTextColor(getColor(R.color.red))
                res.text = "Повторите материал, ответ неверный!"
                pic.visibility = View.VISIBLE
                pic.setImageResource(R.drawable.bad)
            }
            else{
                res.setTextColor(getColor(R.color.blue))
                res.text = "Отлично!"
                pic.visibility = View.VISIBLE
                pic.setImageResource(R.drawable.cool)
            }
        }
    }
}
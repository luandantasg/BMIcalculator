package com.example.meuprimeiroprojeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView

class ResultActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result2)

        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val tvResult = findViewById<TextView>(R.id.textview_Result)
        val tvClassification = findViewById<TextView>(R.id.textview_Classification)
        val result = intent.getFloatExtra("EXTRA_RESULT",0.1f)

        tvResult.text = result.toString()



        val Classification = if (result < 18.5f) {
            "UNDERWEIGHT"
        }else if (result in 18.5f..24.9f) {
            "NORMAL"
        }else if (result in 25.0f..29.9f) {
            "OVERWEIGHT LEVEL 1"
        }else if (result in 30.0f..39.9f) {
            "OBESITY LEVEL 2"
        }else{
            "EXTREME OBESITY LEVEL 3"
        }

        tvClassification.text = getString(R.string.message_Classification, Classification )

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }
}
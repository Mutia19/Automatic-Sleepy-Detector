package org.tensorflow.lite.examples.classification

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnRealtime = findViewById<Button>(R.id.btn_realtime)


        btnRealtime.setOnClickListener {
            val pageRealtime = Intent(this,RealtimeActivity::class.java)
            startActivity(pageRealtime)
        }


    }
}
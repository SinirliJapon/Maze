package com.example.maze

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_view)

        val restartButton = findViewById<Button>(R.id.restartButton)
        restartButton.setOnClickListener {
            restartGame()
        }
    }

    private fun restartGame() {
        val intent = Intent(this, ResumeActivity::class.java)
        startActivity(intent)
        finish()
    }
}

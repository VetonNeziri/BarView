package com.codex.barview

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.codex.bar_view.Bar
import com.codex.barview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val bars = listOf(
        Bar(0f, 10f, "Bar 1", Color.GREEN),
        Bar(10f, 30f, "Bar 2", Color.RED),
        Bar(30f, 50f, "Bar 3", Color.BLUE)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.barView.setBars(bars)
    }
}
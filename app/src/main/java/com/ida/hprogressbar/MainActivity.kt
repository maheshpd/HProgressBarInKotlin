package com.ida.hprogressbar

import android.animation.ObjectAnimator
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        progressBar.max = 10

        val currentProgress = 6

        ObjectAnimator.ofInt(progressBar, "progress", currentProgress)
                .setDuration(2000)
                .start()

    }
}
package com.stardo

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this)
        text.text = "StarDo ⭐ شغال"
        text.textSize = 24f

        setContentView(text)
    }
}

package com.cis.androidlayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_constrant.*
import kotlinx.android.synthetic.main.activity_linear.*
import kotlinx.android.synthetic.main.activity_main.*

class LinearActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear)

        button4.setOnClickListener{
            this.finish()
        }
    }
}

package com.cis.androidlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_constrant.*
import kotlinx.android.synthetic.main.activity_reletive.*

class ReletiveActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reletive)

        button5.setOnClickListener{
            this.finish()
        }
    }

}

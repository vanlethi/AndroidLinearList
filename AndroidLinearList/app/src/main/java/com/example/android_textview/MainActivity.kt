package com.example.android_textview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.marginRight
import kotlinx.android.synthetic.main.activity_main.*
import android.view.ViewGroup.MarginLayoutParams
import android.view.ViewGroup



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val className = arrayOf<String>("Nam", "Hoa", "Lan", "Co")
        for (i in className){
            var ll_layout = LinearLayout(this)
            var tv = TextView(this)
            tv.text = i
            tv.width= 800
            var btn = Button(this)
            btn.text = "btn_"+i
            ll_layout.addView(tv)
            ll_layout.addView(btn)
            ll_main_layout.addView(ll_layout)

        }
    }
}

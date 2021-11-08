package com.example.hellocjy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // To show UI
        //val buttonShow: Button //val = value
        //var counter: Int // var = variable

        val buttonShow: Button = findViewById(R.id.button_Show)
        val imageViewQR = findViewById<ImageView>(R.id.image_View_qr)

        buttonShow.setOnClickListener{
            //To handle the click event of a button

            if(imageViewQR.visibility == View.INVISIBLE) {
                imageViewQR.visibility = View.VISIBLE
                buttonShow.setText("Hide")

            }else {
                imageViewQR.visibility = View.INVISIBLE
                buttonShow.setText("Show")
            }

        }
    }
}
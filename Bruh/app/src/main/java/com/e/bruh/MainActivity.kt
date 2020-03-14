package com.e.bruh

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.time.Duration


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        *   TODO: Clicks-per-second
        *   TODO: Easter-egg-uri
        */

        var bruh = 0 //Bruh...

        val bruhButton = findViewById<View>(R.id.addBruh) as Button
        val bruhCounter = findViewById<View>(R.id.bruhCounter) as TextView
        bruhCounter.text = getString(R.string.bruh_counter, bruh) //Set initial text to 0

        bruhButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                /* On each click it adds 1 to the bruh counter */

                bruh++
                bruhCounter.text = getString(R.string.bruh_counter, bruh)
                checkvalues()
            }

            private fun checkvalues() {
                if (getString(R.string.bruh_counter, bruh) == "69") {
                    /* Chief meme-er */

                    val text = R.string.at69
                    val duration = Toast.LENGTH_LONG

                    val toastAt69 = Toast.makeText(applicationContext, text, duration)
                    toastAt69.show()
                }

                if(getString(R.string.bruh_counter, bruh) == "420") {
                    /* Never gonna give you up */
                    val text = R.string.at420
                    val duration = Toast.LENGTH_LONG

                    val toastAt420 = Toast.makeText(applicationContext, text, duration)
                    toastAt420.show()

                    val viewIntent = Intent("android.intent.action.VIEW",
                                        Uri.parse("https://www.youtube.com/watch?v=dQw4w9WgXcQ"))
                                        startActivity(viewIntent)
                }
            }
        })
    }
}
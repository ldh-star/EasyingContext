package com.liangguo.easyingcontextsample

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.liangguo.easyingcontext.EasyingContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun test1(view: View) {
        Toast.makeText(EasyingContext.application, "application:${EasyingContext.application}", Toast.LENGTH_LONG).show()
    }


    fun test2(view: View) {
        Toast.makeText(EasyingContext.currentActivity, "activity:${EasyingContext.currentActivity}", Toast.LENGTH_LONG).show()
    }


}